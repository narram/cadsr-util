/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.RowIterator;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class CdeIdViewRowImpl extends ViewRowImpl  {
  protected static final int ACIDSEQ = 0;


  protected static final int DESIGIDSEQ = 1;
  protected static final int NAME = 2;
  protected static final int DETLNAME = 3;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public CdeIdViewRowImpl() {
  }

  /**
   * 
   * Gets ac entity object.
   */
  public AdministeredComponentsImpl getac() {
    return (AdministeredComponentsImpl)getEntity(0);
  }

  /**
   * 
   * Gets des entity object.
   */
  public DesignationsImpl getdes() {
    return (DesignationsImpl)getEntity(1);
  }

  /**
   * 
   * Gets the attribute value for AC_IDSEQ using the alias name AcIdseq
   */
  public String getAcIdseq() {
    return (String)getAttributeInternal(ACIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for AC_IDSEQ using the alias name AcIdseq
   */
  public void setAcIdseq(String value) {
    setAttributeInternal(ACIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DESIG_IDSEQ using the alias name DesigIdseq
   */
  public String getDesigIdseq() {
    return (String)getAttributeInternal(DESIGIDSEQ);
  }

  /**
   * 
   * Gets the attribute value for NAME using the alias name Name
   */
  public String getName() {
    return (String)getAttributeInternal(NAME);
  }

  /**
   * 
   * Gets the attribute value for DETL_NAME using the alias name DetlName
   */
  public String getDetlName() {
    return (String)getAttributeInternal(DETLNAME);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ACIDSEQ:
        return getAcIdseq();
      case DESIGIDSEQ:
        return getDesigIdseq();
      case NAME:
        return getName();
      case DETLNAME:
        return getDetlName();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case ACIDSEQ:
        setAcIdseq((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }
}