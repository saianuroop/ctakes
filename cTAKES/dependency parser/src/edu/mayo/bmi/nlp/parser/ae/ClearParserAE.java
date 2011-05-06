/*
			File posModelFile = FileLocator.locateFile(posModelPath);
 * Copyright: (c) 2010   Mayo Foundation for Medical Education and 
 * Research (MFMER). All rights reserved. MAYO, MAYO CLINIC, and the
 * triple-shield Mayo logo are trademarks and service marks of MFMER.
 *
 * Except as contained in the copyright notice above, or as used to identify 
 * MFMER as the author of this software, the trade names, trademarks, service
 * marks, or product names of the copyright holder shall not be used in
 * advertising, promotion or otherwise in connection with this software without
 * prior written authorization of the copyright holder.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */
package edu.mayo.bmi.nlp.parser.ae;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.cas.text.AnnotationIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import clear.dep.DepLib;
import clear.dep.DepNode;
import clear.dep.DepParser;
import clear.dep.DepTree;
import clear.morph.MorphEnAnalyzer;
import edu.mayo.bmi.nlp.parser.type.ConllDependencyNode;
import edu.mayo.bmi.nlp.parser.util.ClearDependencyUtility;
import edu.mayo.bmi.uima.core.resource.FileLocator;
import edu.mayo.bmi.uima.core.type.BaseToken;
import edu.mayo.bmi.uima.core.type.Sentence;

	

	private boolean useMorphy = false;
	

		String absParserModelPath = null;
			File morphDictionaryFile = FileLocator.locateFile(morphDictionaryPath);
			if (morphDictionaryFile.exists()) {
				absMorphDictionaryPath = morphDictionaryFile.getAbsolutePath();
				useMorphy = (new File(absMorphDictionaryPath)).isDirectory();
		    	morph = new MorphEnAnalyzer( absMorphDictionaryPath );
			} else {
				useMorphy = false;
			}
		    logger.info("using Morphy analysis? "+useMorphy);
		    
		    String parserModelPath = (String) uimaContext.getConfigParameterValue(DEPENDENCY_MODEL_FILE_PARAM);
			absParserModelPath = parserModelFile.getAbsolutePath();
			logger.info("parser model file: " + absParserModelPath);
			absLexiconDirectoryPath = lexiconDirectoryFile.getAbsolutePath();
            logger.info("lexicon directory: " + absLexiconDirectoryPath);
			absFeatureTemplateFile = featureTemplateFile.getAbsolutePath();
		    logger.info("feature template file: " + absFeatureTemplateFile);

			
			FSIterator tokenIterator = baseTokenIndex.subiterator(sentence);
			for (int i = 0; i < tokens.size(); i++) {
				words[i] = (tokens.get(i).getCoveredText());
			    	lemmas[i] = (tokens.get(i).getNormalizedForm());
                node.lemma = (lemma==null) ? form.toLowerCase() : lemma;
            ClearDependencyUtility.addToIndexes(jCas, nodes);