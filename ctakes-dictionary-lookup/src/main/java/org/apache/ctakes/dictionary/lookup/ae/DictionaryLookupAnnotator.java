/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.ctakes.dictionary.lookup.ae;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ctakes.core.resource.FileResource;
import org.apache.ctakes.dictionary.lookup.MetaDataHit;
import org.apache.ctakes.dictionary.lookup.algorithms.LookupAlgorithm;
import org.apache.ctakes.dictionary.lookup.vo.LookupHit;
import org.apache.ctakes.dictionary.lookup.vo.LookupToken;
import org.apache.ctakes.dictionary.lookup.vo.LookupTokenComparator;
import org.apache.log4j.Logger;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;


/**
 * UIMA annotator that identified entities based on lookup.
 * 
 * @author Mayo Clinic
 */
public class DictionaryLookupAnnotator extends JCasAnnotator_ImplBase
{
	// LOG4J logger based on class name
	private Logger iv_logger = Logger.getLogger(getClass().getName());

	private UimaContext iv_context;

	private Set iv_lookupSpecSet = new HashSet();

	// used to prevent duplicate hits
	// key = hit begin,end key (java.lang.String)
	// val = Set of MetaDataHit objects
	private Map iv_dupMap = new HashMap();

	public void initialize(UimaContext aContext)
			throws ResourceInitializationException
	{
		super.initialize(aContext);

		iv_context = aContext;
		configInit();

	}

	/**
	 * Reads configuration parameters.
	 */
	private void configInit() throws ResourceInitializationException
	{
		try {
		FileResource fResrc = (FileResource) iv_context.getResourceObject("LookupDescriptor");
		File descFile = fResrc.getFile();

			iv_logger.info("Parsing descriptor: " + descFile.getAbsolutePath());
			iv_lookupSpecSet = LookupParseUtilities.parseDescriptor(descFile, iv_context);
		}
		catch (Exception e) {
			throw new ResourceInitializationException(e);
		}

	}

	/**
	 * Entry point for processing.
	 */
	public void process(JCas jcas)
			throws AnalysisEngineProcessException {
		
		iv_logger.info("process(JCas)");
		iv_dupMap.clear();
		
		try {

			Iterator lsItr = iv_lookupSpecSet.iterator();
			while (lsItr.hasNext()) {

				LookupSpec ls = (LookupSpec) lsItr.next();
				LookupInitializer lInit = ls.getLookupInitializer();

				Iterator windowItr = lInit.getLookupWindowIterator(jcas);
				while (windowItr.hasNext()) {

					Annotation window = (Annotation) windowItr.next();
					List lookupTokensInWindow = lInit.getSortedLookupTokens(jcas, window);
											
					Map ctxMap = lInit.getContextMap(
							jcas,
							window.getBegin(),
							window.getEnd());
					performLookup(jcas, ls, lookupTokensInWindow, ctxMap);
				}
			}

		}
		catch (Exception e) {
			throw new AnalysisEngineProcessException(e);
		}
	}

	/**
	 * Executes the lookup algorithm on the lookup tokens. Hits are stored to
	 * CAS.
	 */
	private void performLookup(JCas jcas, LookupSpec ls, List lookupTokenList,
			Map ctxMap) throws Exception
	{
		// sort the lookup tokens
		Collections.sort(lookupTokenList, LookupTokenComparator.getInstance() );

		// perform lookup
		Collection lookupHitCol = null;

		LookupAlgorithm la = (LookupAlgorithm) ls.getLookupAlgorithm();
		lookupHitCol = la.lookup(lookupTokenList, ctxMap);

		Collection uniqueHitCol = filterHitDups(lookupHitCol);

		// consume hits
		ls.getLookupConsumer().consumeHits(jcas, uniqueHitCol.iterator());
	}

	/**
	 * Filters out duplicate LookupHit objects.
	 * 
	 * @param lookupHitCol
	 * @return
	 */
	private Collection filterHitDups(Collection lookupHitCol)
	{
		List l = new ArrayList();
		Iterator itr = lookupHitCol.iterator();
		while (itr.hasNext())
		{
			LookupHit lh = (LookupHit) itr.next();
			if (!isDuplicate(lh))
			{
				l.add(lh);
			}
		}
		return l;
	}

	/**
	 * Checks to see whether this hit is a duplicate.
	 * 
	 * @param lh
	 * @return
	 */
	private boolean isDuplicate(LookupHit lh)
	{
		MetaDataHit mdh = lh.getDictMetaDataHit();

		// iterate over MetaDataHits that have already been seen
		String offsetKey = getOffsetKey(lh);
		Set mdhDuplicateSet = (Set) iv_dupMap.get(offsetKey);
		if (mdhDuplicateSet != null)
		{
			Iterator itr = mdhDuplicateSet.iterator();
			while (itr.hasNext())
			{
				MetaDataHit otherMdh = (MetaDataHit) itr.next();
				if (mdh.equals(otherMdh))
				{
					// current LookupHit is a duplicate
					return true;
				}
			}
		}
		else
		{
			mdhDuplicateSet = new HashSet();
		}

		// current LookupHit is new, add it to the duplicate set
		// for future checks
		mdhDuplicateSet.add(mdh);
		iv_dupMap.put(offsetKey, mdhDuplicateSet);
		return false;
	}

	/**
	 * Gets a list of LookupToken objects within the specified window
	 * annotation.
	 * 
	 * @param window
	 * @param lookupTokenItr
	 * @return
	 * @throws Exception
	 */
	private List constrainToWindow(Annotation window, Iterator lookupTokenItr)
			throws Exception
	{
		List ltObjectList = new ArrayList();

		while (lookupTokenItr.hasNext())
		{
			LookupToken lt = (LookupToken) lookupTokenItr.next();

			// only consider if it's within the window
			if ((lt.getStartOffset() >= window.getBegin())
					&& (lt.getEndOffset() <= window.getEnd()))
			{
				ltObjectList.add(lt);
			}
		}
		return ltObjectList;
	}

	private String getOffsetKey(LookupHit lh)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(lh.getStartOffset());
		sb.append(',');
		sb.append(lh.getEndOffset());
		return sb.toString();
	}
}
