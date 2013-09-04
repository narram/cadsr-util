/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.domain.Number;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class QuestionsDMLViewRowImpl extends ViewRowImpl  {


  protected static final int QCIDSEQ = 0;
  protected static final int VERSION = 1;
  protected static final int QTLNAME = 2;
  protected static final int CONTEIDSEQ = 3;
  protected static final int ASLNAME = 4;
  protected static final int PREFERREDNAME = 5;
  protected static final int PREFERREDDEFINITION = 6;
  protected static final int DEIDSEQ = 7;
  protected static final int LONGNAME = 8;
  protected static final int PMODIDSEQ = 9;
  protected static final int MODULESDMLVIEW1 = 10;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public QuestionsDMLViewRowImpl() {
  }

  /**
   * 
   * Gets qc entity object.
   */
  public QuestContentsExtImpl getqc() {
    return (QuestContentsExtImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for QC_IDSEQ using the alias name QcIdseq
   */
  public String getQcIdseq() {
    return (String)getAttributeInternal(QCIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for QC_IDSEQ using the alias name QcIdseq
   */
  public void setQcIdseq(String value) {
    setAttributeInternal(QCIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for VERSION using the alias name Version
   */
  public Number getVersion() {
    return (Number)getAttributeInternal(VERSION);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for VERSION using the alias name Version
   */
  public void setVersion(Number value) {
    setAttributeInternal(VERSION, value);
  }

  /**
   * 
   * Gets the attribute value for QTL_NAME using the alias name QtlName
   */
  public String getQtlName() {
    return (String)getAttributeInternal(QTLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for QTL_NAME using the alias name QtlName
   */
  public void setQtlName(String value) {
    setAttributeInternal(QTLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for CONTE_IDSEQ using the alias name ConteIdseq
   */
  public String getConteIdseq() {
    return (String)getAttributeInternal(CONTEIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CONTE_IDSEQ using the alias name ConteIdseq
   */
  public void setConteIdseq(String value) {
    setAttributeInternal(CONTEIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for ASL_NAME using the alias name AslName
   */
  public String getAslName() {
    return (String)getAttributeInternal(ASLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for ASL_NAME using the alias name AslName
   */
  public void setAslName(String value) {
    setAttributeInternal(ASLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for PREFERRED_NAME using the alias name PreferredName
   */
  public String getPreferredName() {
    return (String)getAttributeInternal(PREFERREDNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for PREFERRED_NAME using the alias name PreferredName
   */
  public void setPreferredName(String value) {
    setAttributeInternal(PREFERREDNAME, value);
  }

  /**
   * 
   * Gets the attribute value for PREFERRED_DEFINITION using the alias name PreferredDefinition
   */
  public String getPreferredDefinition() {
    return (String)getAttributeInternal(PREFERREDDEFINITION);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for PREFERRED_DEFINITION using the alias name PreferredDefinition
   */
  public void setPreferredDefinition(String value) {
    setAttributeInternal(PREFERREDDEFINITION, value);
  }

  /**
   * 
   * Gets the attribute value for DE_IDSEQ using the alias name DeIdseq
   */
  public String getDeIdseq() {
    return (String)getAttributeInternal(DEIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DE_IDSEQ using the alias name DeIdseq
   */
  public void setDeIdseq(String value) {
    setAttributeInternal(DEIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for LONG_NAME using the alias name LongName
   */
  public String getLongName() {
    return (String)getAttributeInternal(LONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LONG_NAME using the alias name LongName
   */
  public void setLongName(String value) {
    setAttributeInternal(LONGNAME, value);
  }

  /**
   * 
   * Gets the attribute value for P_MOD_IDSEQ using the alias name PModIdseq
   */
  public String getPModIdseq() {
    return (String)getAttributeInternal(PMODIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for P_MOD_IDSEQ using the alias name PModIdseq
   */
  public void setPModIdseq(String value) {
    setAttributeInternal(PMODIDSEQ, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case QCIDSEQ:
        return getQcIdseq();
      case VERSION:
        return getVersion();
      case QTLNAME:
        return getQtlName();
      case CONTEIDSEQ:
        return getConteIdseq();
      case ASLNAME:
        return getAslName();
      case PREFERREDNAME:
        return getPreferredName();
      case PREFERREDDEFINITION:
        return getPreferredDefinition();
      case DEIDSEQ:
        return getDeIdseq();
      case LONGNAME:
        return getLongName();
      case PMODIDSEQ:
        return getPModIdseq();
      case MODULESDMLVIEW1:
        return getModulesDMLView1();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case QCIDSEQ:
        setQcIdseq((String)value);
        return;
      case VERSION:
        setVersion((Number)value);
        return;
      case QTLNAME:
        setQtlName((String)value);
        return;
      case CONTEIDSEQ:
        setConteIdseq((String)value);
        return;
      case ASLNAME:
        setAslName((String)value);
        return;
      case PREFERREDNAME:
        setPreferredName((String)value);
        return;
      case PREFERREDDEFINITION:
        setPreferredDefinition((String)value);
        return;
      case DEIDSEQ:
        setDeIdseq((String)value);
        return;
      case LONGNAME:
        setLongName((String)value);
        return;
      case PMODIDSEQ:
        setPModIdseq((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   * Gets the associated <code>Row</code> using master-detail link ModulesDMLView1
   */
  public oracle.jbo.Row getModulesDMLView1() {
    return (oracle.jbo.Row)getAttributeInternal(MODULESDMLVIEW1);
  }
}