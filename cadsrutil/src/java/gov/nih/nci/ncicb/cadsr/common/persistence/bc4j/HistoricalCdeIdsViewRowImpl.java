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

public class HistoricalCdeIdsViewRowImpl extends ViewRowImpl  {


  public static final int DEIDSEQ = 0;
  public static final int NAME = 1;
  public static final int VERSION = 2;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public HistoricalCdeIdsViewRowImpl() {
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
   * Gets the attribute value for the calculated attribute Name
   */
  public String getName() {
    return (String)getAttributeInternal(NAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute Name
   */
  public void setName(String value) {
    setAttributeInternal(NAME, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case DEIDSEQ:
        return getDeIdseq();
      case NAME:
        return getName();
      case VERSION:
        return getVersion();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case DEIDSEQ:
        setDeIdseq((String)value);
        return;
      case NAME:
        setName((String)value);
        return;
      case VERSION:
        setVersion((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   * Gets the attribute value for the calculated attribute Version
   */
  public Number getVersion() {
    return (Number)getAttributeInternal(VERSION);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for the calculated attribute Version
   */
  public void setVersion(Number value) {
    setAttributeInternal(VERSION, value);
  }
}