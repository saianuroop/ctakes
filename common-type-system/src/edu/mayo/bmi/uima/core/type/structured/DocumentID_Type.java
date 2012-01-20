
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

/** Equivalent to cTAKES: edu.mayo.bmi.uima.core.type.DocumentID, but its supertype changed to uima.cas.TOP
 * Updated by JCasGen Fri Jan 20 10:31:42 EST 2012
 * @generated */
public class DocumentID_Type extends TOP_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DocumentID_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DocumentID_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DocumentID(addr, DocumentID_Type.this);
  			   DocumentID_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DocumentID(addr, DocumentID_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = DocumentID.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.mayo.bmi.uima.core.type.structured.DocumentID");
 
  /** @generated */
  final Feature casFeat_documentID;
  /** @generated */
  final int     casFeatCode_documentID;
  /** @generated */ 
  public String getDocumentID(int addr) {
        if (featOkTst && casFeat_documentID == null)
      jcas.throwFeatMissing("documentID", "edu.mayo.bmi.uima.core.type.structured.DocumentID");
    return ll_cas.ll_getStringValue(addr, casFeatCode_documentID);
  }
  /** @generated */    
  public void setDocumentID(int addr, String v) {
        if (featOkTst && casFeat_documentID == null)
      jcas.throwFeatMissing("documentID", "edu.mayo.bmi.uima.core.type.structured.DocumentID");
    ll_cas.ll_setStringValue(addr, casFeatCode_documentID, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DocumentID_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_documentID = jcas.getRequiredFeatureDE(casType, "documentID", "uima.cas.String", featOkTst);
    casFeatCode_documentID  = (null == casFeat_documentID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_documentID).getCode();

  }
}



    