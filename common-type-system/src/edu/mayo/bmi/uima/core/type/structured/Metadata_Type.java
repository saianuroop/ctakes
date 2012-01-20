
/* First created by JCasGen Thu Jan 19 17:46:27 EST 2012 */
package edu.mayo.bmi.uima.core.type.structured;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.TOP_Type;

/** Other structured data that captures information about the document, patient, or context of the clinical text.
 * Updated by JCasGen Fri Jan 20 10:31:42 EST 2012
 * @generated */
public class Metadata_Type extends TOP_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Metadata_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Metadata_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Metadata(addr, Metadata_Type.this);
  			   Metadata_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Metadata(addr, Metadata_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Metadata.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.mayo.bmi.uima.core.type.structured.Metadata");
 
  /** @generated */
  final Feature casFeat_patientID;
  /** @generated */
  final int     casFeatCode_patientID;
  /** @generated */ 
  public long getPatientID(int addr) {
        if (featOkTst && casFeat_patientID == null)
      jcas.throwFeatMissing("patientID", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    return ll_cas.ll_getLongValue(addr, casFeatCode_patientID);
  }
  /** @generated */    
  public void setPatientID(int addr, long v) {
        if (featOkTst && casFeat_patientID == null)
      jcas.throwFeatMissing("patientID", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    ll_cas.ll_setLongValue(addr, casFeatCode_patientID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_providerID;
  /** @generated */
  final int     casFeatCode_providerID;
  /** @generated */ 
  public int getProviderID(int addr) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_providerID);
  }
  /** @generated */    
  public void setProviderID(int addr, int v) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_providerID, v);}
    
   /** @generated */
  public long getProviderID(int addr, int i) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i);
  return ll_cas.ll_getLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i);
  }
   
  /** @generated */ 
  public void setProviderID(int addr, int i, long v) {
        if (featOkTst && casFeat_providerID == null)
      jcas.throwFeatMissing("providerID", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    if (lowLevelTypeChecks)
      ll_cas.ll_setLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i);
    ll_cas.ll_setLongArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_providerID), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_sourceData;
  /** @generated */
  final int     casFeatCode_sourceData;
  /** @generated */ 
  public int getSourceData(int addr) {
        if (featOkTst && casFeat_sourceData == null)
      jcas.throwFeatMissing("sourceData", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sourceData);
  }
  /** @generated */    
  public void setSourceData(int addr, int v) {
        if (featOkTst && casFeat_sourceData == null)
      jcas.throwFeatMissing("sourceData", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_sourceData, v);}
    
  
 
  /** @generated */
  final Feature casFeat_demographics;
  /** @generated */
  final int     casFeatCode_demographics;
  /** @generated */ 
  public int getDemographics(int addr) {
        if (featOkTst && casFeat_demographics == null)
      jcas.throwFeatMissing("demographics", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    return ll_cas.ll_getRefValue(addr, casFeatCode_demographics);
  }
  /** @generated */    
  public void setDemographics(int addr, int v) {
        if (featOkTst && casFeat_demographics == null)
      jcas.throwFeatMissing("demographics", "edu.mayo.bmi.uima.core.type.structured.Metadata");
    ll_cas.ll_setRefValue(addr, casFeatCode_demographics, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Metadata_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_patientID = jcas.getRequiredFeatureDE(casType, "patientID", "uima.cas.Long", featOkTst);
    casFeatCode_patientID  = (null == casFeat_patientID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_patientID).getCode();

 
    casFeat_providerID = jcas.getRequiredFeatureDE(casType, "providerID", "uima.cas.LongArray", featOkTst);
    casFeatCode_providerID  = (null == casFeat_providerID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_providerID).getCode();

 
    casFeat_sourceData = jcas.getRequiredFeatureDE(casType, "sourceData", "edu.mayo.bmi.uima.core.type.structured.SourceData", featOkTst);
    casFeatCode_sourceData  = (null == casFeat_sourceData) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceData).getCode();

 
    casFeat_demographics = jcas.getRequiredFeatureDE(casType, "demographics", "edu.mayo.bmi.uima.core.type.structured.Demographics", featOkTst);
    casFeatCode_demographics  = (null == casFeat_demographics) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_demographics).getCode();

  }
}



    