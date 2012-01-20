

/* First created by JCasGen Thu Jan 19 17:46:26 EST 2012 */
package edu.mayo.bmi.uima.core.type.refsem;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;


/** A set of mostly temporal properties that are unique to Events.
 * Updated by JCasGen Fri Jan 20 10:31:31 EST 2012
 * XML source: C:/Users/CH150124/workspace_SHARPn/common-type-system/desc/common_type_system.xml
 * @generated */
public class EventProperties extends TOP {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(EventProperties.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected EventProperties() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EventProperties(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EventProperties(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: contextualModality

  /** getter for contextualModality - gets 
   * @generated */
  public String getContextualModality() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualModality == null)
      jcasType.jcas.throwFeatMissing("contextualModality", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualModality);}
    
  /** setter for contextualModality - sets  
   * @generated */
  public void setContextualModality(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualModality == null)
      jcasType.jcas.throwFeatMissing("contextualModality", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualModality, v);}    
   
    
  //*--------------*
  //* Feature: contextualAspect

  /** getter for contextualAspect - gets 
   * @generated */
  public String getContextualAspect() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualAspect == null)
      jcasType.jcas.throwFeatMissing("contextualAspect", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualAspect);}
    
  /** setter for contextualAspect - sets  
   * @generated */
  public void setContextualAspect(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_contextualAspect == null)
      jcasType.jcas.throwFeatMissing("contextualAspect", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_contextualAspect, v);}    
   
    
  //*--------------*
  //* Feature: permanence

  /** getter for permanence - gets 
   * @generated */
  public String getPermanence() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_permanence == null)
      jcasType.jcas.throwFeatMissing("permanence", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_permanence);}
    
  /** setter for permanence - sets  
   * @generated */
  public void setPermanence(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_permanence == null)
      jcasType.jcas.throwFeatMissing("permanence", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_permanence, v);}    
   
    
  //*--------------*
  //* Feature: category

  /** getter for category - gets Type of Event.
   * @generated */
  public String getCategory() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_category);}
    
  /** setter for category - sets Type of Event. 
   * @generated */
  public void setCategory(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_category == null)
      jcasType.jcas.throwFeatMissing("category", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_category, v);}    
   
    
  //*--------------*
  //* Feature: aspect

  /** getter for aspect - gets 
   * @generated */
  public String getAspect() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_aspect);}
    
  /** setter for aspect - sets  
   * @generated */
  public void setAspect(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_aspect == null)
      jcasType.jcas.throwFeatMissing("aspect", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_aspect, v);}    
   
    
  //*--------------*
  //* Feature: docTimeRel

  /** getter for docTimeRel - gets 
   * @generated */
  public String getDocTimeRel() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_docTimeRel == null)
      jcasType.jcas.throwFeatMissing("docTimeRel", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_docTimeRel);}
    
  /** setter for docTimeRel - sets  
   * @generated */
  public void setDocTimeRel(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_docTimeRel == null)
      jcasType.jcas.throwFeatMissing("docTimeRel", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_docTimeRel, v);}    
   
    
  //*--------------*
  //* Feature: degree

  /** getter for degree - gets 
   * @generated */
  public String getDegree() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_degree == null)
      jcasType.jcas.throwFeatMissing("degree", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_degree);}
    
  /** setter for degree - sets  
   * @generated */
  public void setDegree(String v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_degree == null)
      jcasType.jcas.throwFeatMissing("degree", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventProperties_Type)jcasType).casFeatCode_degree, v);}    
   
    
  //*--------------*
  //* Feature: polarity

  /** getter for polarity - gets 
   * @generated */
  public int getPolarity() {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    return jcasType.ll_cas.ll_getIntValue(addr, ((EventProperties_Type)jcasType).casFeatCode_polarity);}
    
  /** setter for polarity - sets  
   * @generated */
  public void setPolarity(int v) {
    if (EventProperties_Type.featOkTst && ((EventProperties_Type)jcasType).casFeat_polarity == null)
      jcasType.jcas.throwFeatMissing("polarity", "edu.mayo.bmi.uima.core.type.refsem.EventProperties");
    jcasType.ll_cas.ll_setIntValue(addr, ((EventProperties_Type)jcasType).casFeatCode_polarity, v);}    
  }

    