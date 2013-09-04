/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class FormUsagesForACdeViewRowImpl extends ViewRowImpl
{


    public static final int PROTOCOLNUMBER = 0;

    public static final int LEADORG = 1;

    public static final int CRFLONGNAME = 2;

    public static final int USAGETYPE = 3;

    public static final int CRFIDSEQ = 4;

    public static final int PROTOIDSEQ = 5;

    public static final int DEIDSEQ = 6;

    public static final int QUELONGNAME = 7;

    public static final int QUEDEIDSEQ = 8;

    /**
   * 
   * This is the default constructor (do not remove)
   */
  public FormUsagesForACdeViewRowImpl() {
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute ProtocolNumber
   */
  public String getProtocolNumber() {
    return (String)getAttributeInternal(PROTOCOLNUMBER);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute ProtocolNumber
   */
  public void setProtocolNumber(String value) {
    setAttributeInternal(PROTOCOLNUMBER, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute LeadOrg
   */
  public String getLeadOrg() {
    return (String)getAttributeInternal(LEADORG);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute LeadOrg
   */
  public void setLeadOrg(String value) {
    setAttributeInternal(LEADORG, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute CrfLongName
   */
  public String getCrfLongName() {
    return (String)getAttributeInternal(CRFLONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute CrfLongName
   */
  public void setCrfLongName(String value) {
    setAttributeInternal(CRFLONGNAME, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute UsageType
   */
  public String getUsageType() {
    return (String)getAttributeInternal(USAGETYPE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute UsageType
   */
  public void setUsageType(String value) {
    setAttributeInternal(USAGETYPE, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute CrfIdseq
   */
  public String getCrfIdseq() {
    return (String)getAttributeInternal(CRFIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute CrfIdseq
   */
  public void setCrfIdseq(String value) {
    setAttributeInternal(CRFIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute ProtoIdseq
   */
  public String getProtoIdseq() {
    return (String)getAttributeInternal(PROTOIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute ProtoIdseq
   */
  public void setProtoIdseq(String value) {
    setAttributeInternal(PROTOIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute DeIdseq
   */
  public String getDeIdseq() {
    return (String)getAttributeInternal(DEIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute DeIdseq
   */
  public void setDeIdseq(String value) {
    setAttributeInternal(DEIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute QueLongName
   */
  public String getQueLongName() {
    return (String)getAttributeInternal(QUELONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute QueLongName
   */
  public void setQueLongName(String value) {
    setAttributeInternal(QUELONGNAME, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
        switch (index)
        {
        case PROTOCOLNUMBER :
            return getProtocolNumber();
        case LEADORG :
            return getLeadOrg();
        case CRFLONGNAME :
            return getCrfLongName();
        case USAGETYPE :
            return getUsageType();
        case CRFIDSEQ :
            return getCrfIdseq();
        case PROTOIDSEQ :
            return getProtoIdseq();
        case DEIDSEQ :
            return getDeIdseq();
        case QUELONGNAME :
            return getQueLongName();
        case QUEDEIDSEQ :
            return getQueDeIdseq();
        default :
            return super.getAttrInvokeAccessor(index, attrDef);
        }
    }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
        switch (index)
        {
        case PROTOCOLNUMBER :
            setProtocolNumber((String)value);
            return;
        case LEADORG :
            setLeadOrg((String)value);
            return;
        case CRFLONGNAME :
            setCrfLongName((String)value);
            return;
        case USAGETYPE :
            setUsageType((String)value);
            return;
        case CRFIDSEQ :
            setCrfIdseq((String)value);
            return;
        case PROTOIDSEQ :
            setProtoIdseq((String)value);
            return;
        case DEIDSEQ :
            setDeIdseq((String)value);
            return;
        case QUELONGNAME :
            setQueLongName((String)value);
            return;
        case QUEDEIDSEQ :
            setQueDeIdseq((String)value);
            return;
        default :
            super.setAttrInvokeAccessor(index, value, attrDef);
            return;
        }
    }

  /**
   * 
   * Gets the attribute value for the calculated attribute QueDeIdseq
   */
  public String getQueDeIdseq() {
    return (String)getAttributeInternal(QUEDEIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute QueDeIdseq
   */
  public void setQueDeIdseq(String value) {
    setAttributeInternal(QUEDEIDSEQ, value);
  }
}