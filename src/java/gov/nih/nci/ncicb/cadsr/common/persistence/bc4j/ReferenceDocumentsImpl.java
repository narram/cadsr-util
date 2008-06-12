package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.Key;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class ReferenceDocumentsImpl extends EntityImpl 
{
  public static final int RDIDSEQ = 0;
  public static final int NAME = 1;
  public static final int ORGIDSEQ = 2;
  public static final int DCTLNAME = 3;
  public static final int ACIDSEQ = 4;
  public static final int ACHIDSEQ = 5;
  public static final int ARIDSEQ = 6;
  public static final int RDTLNAME = 7;
  public static final int DOCTEXT = 8;
  public static final int DATECREATED = 9;
  public static final int CREATEDBY = 10;
  public static final int DATEMODIFIED = 11;
  public static final int MODIFIEDBY = 12;
  public static final int URL = 13;
  public static final int LAENAME = 14;
  public static final int DISPLAYORDER = 15;
  public static final int CONTEIDSEQ = 16;
  public static final int ADMINISTEREDCOMPONENTS = 17;
  public static final int ACREGISTRATIONS = 18;
  public static final int CONTEXTS = 19;
  public static final int REFERENCEBLOBS = 20;





  private static EntityDefImpl mDefinitionObject;

  /**
   * 
   * This is the default constructor (do not remove)
   */
  public ReferenceDocumentsImpl()
  {
  }

  /**
   * 
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("gov.nih.nci.ncicb.cadsr.common.persistence.bc4j.ReferenceDocuments");
    }
    return mDefinitionObject;
  }






  /**
   * 
   * Gets the attribute value for RdIdseq, using the alias name RdIdseq
   */
  public String getRdIdseq()
  {
    return (String)getAttributeInternal(RDIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for RdIdseq
   */
  public void setRdIdseq(String value)
  {
    setAttributeInternal(RDIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for Name, using the alias name Name
   */
  public String getName()
  {
    return (String)getAttributeInternal(NAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Name
   */
  public void setName(String value)
  {
    setAttributeInternal(NAME, value);
  }

  /**
   * 
   * Gets the attribute value for OrgIdseq, using the alias name OrgIdseq
   */
  public String getOrgIdseq()
  {
    return (String)getAttributeInternal(ORGIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for OrgIdseq
   */
  public void setOrgIdseq(String value)
  {
    setAttributeInternal(ORGIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DctlName, using the alias name DctlName
   */
  public String getDctlName()
  {
    return (String)getAttributeInternal(DCTLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DctlName
   */
  public void setDctlName(String value)
  {
    setAttributeInternal(DCTLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for AcIdseq, using the alias name AcIdseq
   */
  public String getAcIdseq()
  {
    return (String)getAttributeInternal(ACIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for AcIdseq
   */
  public void setAcIdseq(String value)
  {
    setAttributeInternal(ACIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for AchIdseq, using the alias name AchIdseq
   */
  public String getAchIdseq()
  {
    return (String)getAttributeInternal(ACHIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for AchIdseq
   */
  public void setAchIdseq(String value)
  {
    setAttributeInternal(ACHIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for ArIdseq, using the alias name ArIdseq
   */
  public String getArIdseq()
  {
    return (String)getAttributeInternal(ARIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ArIdseq
   */
  public void setArIdseq(String value)
  {
    setAttributeInternal(ARIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for RdtlName, using the alias name RdtlName
   */
  public String getRdtlName()
  {
    return (String)getAttributeInternal(RDTLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for RdtlName
   */
  public void setRdtlName(String value)
  {
    setAttributeInternal(RDTLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for DocText, using the alias name DocText
   */
  public String getDocText()
  {
    return (String)getAttributeInternal(DOCTEXT);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DocText
   */
  public void setDocText(String value)
  {
    setAttributeInternal(DOCTEXT, value);
  }

  /**
   * 
   * Gets the attribute value for DateCreated, using the alias name DateCreated
   */
  public Date getDateCreated()
  {
    return (Date)getAttributeInternal(DATECREATED);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DateCreated
   */
  public void setDateCreated(Date value)
  {
    setAttributeInternal(DATECREATED, value);
  }

  /**
   * 
   * Gets the attribute value for CreatedBy, using the alias name CreatedBy
   */
  public String getCreatedBy()
  {
    return (String)getAttributeInternal(CREATEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for CreatedBy
   */
  public void setCreatedBy(String value)
  {
    setAttributeInternal(CREATEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for DateModified, using the alias name DateModified
   */
  public Date getDateModified()
  {
    return (Date)getAttributeInternal(DATEMODIFIED);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DateModified
   */
  public void setDateModified(Date value)
  {
    setAttributeInternal(DATEMODIFIED, value);
  }

  /**
   * 
   * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy
   */
  public String getModifiedBy()
  {
    return (String)getAttributeInternal(MODIFIEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ModifiedBy
   */
  public void setModifiedBy(String value)
  {
    setAttributeInternal(MODIFIEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for Url, using the alias name Url
   */
  public String getUrl()
  {
    return (String)getAttributeInternal(URL);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Url
   */
  public void setUrl(String value)
  {
    setAttributeInternal(URL, value);
  }

  /**
   * 
   * Gets the attribute value for LaeName, using the alias name LaeName
   */
  public String getLaeName()
  {
    return (String)getAttributeInternal(LAENAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for LaeName
   */
  public void setLaeName(String value)
  {
    setAttributeInternal(LAENAME, value);
  }

  /**
   * 
   * Gets the attribute value for DisplayOrder, using the alias name DisplayOrder
   */
  public Number getDisplayOrder()
  {
    return (Number)getAttributeInternal(DISPLAYORDER);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DisplayOrder
   */
  public void setDisplayOrder(Number value)
  {
    setAttributeInternal(DISPLAYORDER, value);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case RDIDSEQ:
        return getRdIdseq();
      case NAME:
        return getName();
      case ORGIDSEQ:
        return getOrgIdseq();
      case DCTLNAME:
        return getDctlName();
      case ACIDSEQ:
        return getAcIdseq();
      case ACHIDSEQ:
        return getAchIdseq();
      case ARIDSEQ:
        return getArIdseq();
      case RDTLNAME:
        return getRdtlName();
      case DOCTEXT:
        return getDocText();
      case DATECREATED:
        return getDateCreated();
      case CREATEDBY:
        return getCreatedBy();
      case DATEMODIFIED:
        return getDateModified();
      case MODIFIEDBY:
        return getModifiedBy();
      case URL:
        return getUrl();
      case LAENAME:
        return getLaeName();
      case DISPLAYORDER:
        return getDisplayOrder();
      case CONTEIDSEQ:
        return getConteIdseq();
      case REFERENCEBLOBS:
        return getReferenceBlobs();
      case ADMINISTEREDCOMPONENTS:
        return getAdministeredComponents();
      case ACREGISTRATIONS:
        return getAcRegistrations();
      case CONTEXTS:
        return getContexts();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception
  {
    switch (index)
      {
      case RDIDSEQ:
        setRdIdseq((String)value);
        return;
      case NAME:
        setName((String)value);
        return;
      case ORGIDSEQ:
        setOrgIdseq((String)value);
        return;
      case DCTLNAME:
        setDctlName((String)value);
        return;
      case ACIDSEQ:
        setAcIdseq((String)value);
        return;
      case ACHIDSEQ:
        setAchIdseq((String)value);
        return;
      case ARIDSEQ:
        setArIdseq((String)value);
        return;
      case RDTLNAME:
        setRdtlName((String)value);
        return;
      case DOCTEXT:
        setDocText((String)value);
        return;
      case DATECREATED:
        setDateCreated((Date)value);
        return;
      case CREATEDBY:
        setCreatedBy((String)value);
        return;
      case DATEMODIFIED:
        setDateModified((Date)value);
        return;
      case MODIFIEDBY:
        setModifiedBy((String)value);
        return;
      case URL:
        setUrl((String)value);
        return;
      case LAENAME:
        setLaeName((String)value);
        return;
      case DISPLAYORDER:
        setDisplayOrder((Number)value);
        return;
      case CONTEIDSEQ:
        setConteIdseq((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }


  /**
   * 
   * Gets the associated entity AdministeredComponentsImpl
   */
  public AdministeredComponentsImpl getAdministeredComponents() {
    return (AdministeredComponentsImpl)getAttributeInternal(ADMINISTEREDCOMPONENTS);
  }

  /**
   * 
   * Sets <code>value</code> as the associated entity AdministeredComponentsImpl
   */
  public void setAdministeredComponents(AdministeredComponentsImpl value) {
    setAttributeInternal(ADMINISTEREDCOMPONENTS, value);
  }

  /**
   * 
   * Gets the associated entity AcRegistrationsImpl
   */
  public AcRegistrationsImpl getAcRegistrations() {
    return (AcRegistrationsImpl)getAttributeInternal(ACREGISTRATIONS);
  }

  /**
   * 
   * Sets <code>value</code> as the associated entity AcRegistrationsImpl
   */
  public void setAcRegistrations(AcRegistrationsImpl value) {
    setAttributeInternal(ACREGISTRATIONS, value);
  }

  /**
   * 
   * Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getReferenceBlobs() {
    return (RowIterator)getAttributeInternal(REFERENCEBLOBS);
  }


  /**
   * 
   *  Gets the attribute value for ConteIdseq, using the alias name ConteIdseq
   */
  public String getConteIdseq()
  {
    return (String)getAttributeInternal(CONTEIDSEQ);
  }

  /**
   * 
   *  Sets <code>value</code> as the attribute value for ConteIdseq
   */
  public void setConteIdseq(String value)
  {
    setAttributeInternal(CONTEIDSEQ, value);
  }

  /**
   * 
   *  Gets the associated entity ContextsImpl
   */
  public ContextsImpl getContexts()
  {
    return (ContextsImpl)getAttributeInternal(CONTEXTS);
  }

  /**
   * 
   *  Sets <code>value</code> as the associated entity ContextsImpl
   */
  public void setContexts(ContextsImpl value)
  {
    setAttributeInternal(CONTEXTS, value);
  }

  /**
   * 
   *  Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(String rdIdseq)
  {
    return new Key(new Object[] {rdIdseq});
  }




}