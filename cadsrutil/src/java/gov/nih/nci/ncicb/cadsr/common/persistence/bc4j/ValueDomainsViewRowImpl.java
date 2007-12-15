package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import gov.nih.nci.ncicb.cadsr.common.util.logging.Log;
import gov.nih.nci.ncicb.cadsr.common.util.logging.LogFactory;
import oracle.jbo.server.ViewRowImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class ValueDomainsViewRowImpl extends ViewRowImpl  {

  public static final int VDIDSEQ = 0;
  public static final int VERSION = 1;
  public static final int PREFERREDNAME = 2;
  public static final int CONTEIDSEQ = 3;
  public static final int PREFERREDDEFINITION = 4;
  public static final int DTLNAME = 5;
  public static final int BEGINDATE = 6;
  public static final int CDIDSEQ = 7;
  public static final int ENDDATE = 8;
  public static final int VDTYPEFLAG = 9;
  public static final int ASLNAME = 10;
  public static final int CHANGENOTE = 11;
  public static final int UOMLNAME = 12;
  public static final int LONGNAME = 13;
  public static final int FORMLNAME = 14;
  public static final int MAXLENGTHNUM = 15;
  public static final int MINLENGTHNUM = 16;
  public static final int DECIMALPLACE = 17;
  public static final int LATESTVERSIONIND = 18;
  public static final int DELETEDIND = 19;
  public static final int DATECREATED = 20;
  public static final int CREATEDBY = 21;
  public static final int DATEMODIFIED = 22;
  public static final int MODIFIEDBY = 23;
  public static final int CHARSETNAME = 24;
  public static final int HIGHVALUENUM = 25;
  public static final int LOWVALUENUM = 26;
  public static final int QUALIFIERNAME = 27;
  public static final int ORIGIN = 28;
  public static final int VDID = 29;
  public static final int REPIDSEQ = 30;
  public static final int CONDRIDSEQ = 31;
  public static final int CONCEPTUALDOMAINSROW = 32;
  public static final int DATAELEMENTSVIEW = 33;
  public static final int VDPVSVIEW = 34;
  public static final int REPRESENTATIONVIEWOBJ = 35;
  protected static final int REPRESENTATIONROW = 36;
  private static Log log = LogFactory.getLog(ValueDomainsViewRowImpl.class.getName());

  /**
   * 
   * This is the default constructor (do not remove)
   */
  public ValueDomainsViewRowImpl() {
  }

  /**
   * 
   * Gets ValueDomains entity object.
   */
  public ValueDomainsImpl getValueDomains() {
    return (ValueDomainsImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for VD_IDSEQ using the alias name VdIdseq
   */
  public String getVdIdseq() {
    return (String)getAttributeInternal(VDIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for VD_IDSEQ using the alias name VdIdseq
   */
  public void setVdIdseq(String value) {
    setAttributeInternal(VDIDSEQ, value);
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
   * Gets the attribute value for DTL_NAME using the alias name DtlName
   */
  public String getDtlName() {
    return (String)getAttributeInternal(DTLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DTL_NAME using the alias name DtlName
   */
  public void setDtlName(String value) {
    setAttributeInternal(DTLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for BEGIN_DATE using the alias name BeginDate
   */
  public Date getBeginDate() {
    return (Date)getAttributeInternal(BEGINDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for BEGIN_DATE using the alias name BeginDate
   */
  public void setBeginDate(Date value) {
    setAttributeInternal(BEGINDATE, value);
  }

  /**
   * 
   * Gets the attribute value for CD_IDSEQ using the alias name CdIdseq
   */
  public String getCdIdseq() {
    return (String)getAttributeInternal(CDIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CD_IDSEQ using the alias name CdIdseq
   */
  public void setCdIdseq(String value) {
    setAttributeInternal(CDIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for END_DATE using the alias name EndDate
   */
  public Date getEndDate() {
    return (Date)getAttributeInternal(ENDDATE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for END_DATE using the alias name EndDate
   */
  public void setEndDate(Date value) {
    setAttributeInternal(ENDDATE, value);
  }

  /**
   * 
   * Gets the attribute value for VD_TYPE_FLAG using the alias name VdTypeFlag
   */
  public String getVdTypeFlag() {
    return (String)getAttributeInternal(VDTYPEFLAG);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for VD_TYPE_FLAG using the alias name VdTypeFlag
   */
  public void setVdTypeFlag(String value) {
    setAttributeInternal(VDTYPEFLAG, value);
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
   * Gets the attribute value for CHANGE_NOTE using the alias name ChangeNote
   */
  public String getChangeNote() {
    return (String)getAttributeInternal(CHANGENOTE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CHANGE_NOTE using the alias name ChangeNote
   */
  public void setChangeNote(String value) {
    setAttributeInternal(CHANGENOTE, value);
  }

  /**
   * 
   * Gets the attribute value for UOML_NAME using the alias name UomlName
   */
  public String getUomlName() {
    return (String)getAttributeInternal(UOMLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for UOML_NAME using the alias name UomlName
   */
  public void setUomlName(String value) {
    setAttributeInternal(UOMLNAME, value);
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
   * Gets the attribute value for FORML_NAME using the alias name FormlName
   */
  public String getFormlName() {
    return (String)getAttributeInternal(FORMLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for FORML_NAME using the alias name FormlName
   */
  public void setFormlName(String value) {
    setAttributeInternal(FORMLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for MAX_LENGTH_NUM using the alias name MaxLengthNum
   */
  public Number getMaxLengthNum() {
    return (Number)getAttributeInternal(MAXLENGTHNUM);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for MAX_LENGTH_NUM using the alias name MaxLengthNum
   */
  public void setMaxLengthNum(Number value) {
    setAttributeInternal(MAXLENGTHNUM, value);
  }

  /**
   * 
   * Gets the attribute value for MIN_LENGTH_NUM using the alias name MinLengthNum
   */
  public Number getMinLengthNum() {
    return (Number)getAttributeInternal(MINLENGTHNUM);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for MIN_LENGTH_NUM using the alias name MinLengthNum
   */
  public void setMinLengthNum(Number value) {
    setAttributeInternal(MINLENGTHNUM, value);
  }

  /**
   * 
   * Gets the attribute value for DECIMAL_PLACE using the alias name DecimalPlace
   */
  public Number getDecimalPlace() {
    return (Number)getAttributeInternal(DECIMALPLACE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DECIMAL_PLACE using the alias name DecimalPlace
   */
  public void setDecimalPlace(Number value) {
    setAttributeInternal(DECIMALPLACE, value);
  }

  /**
   * 
   * Gets the attribute value for LATEST_VERSION_IND using the alias name LatestVersionInd
   */
  public String getLatestVersionInd() {
    return (String)getAttributeInternal(LATESTVERSIONIND);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LATEST_VERSION_IND using the alias name LatestVersionInd
   */
  public void setLatestVersionInd(String value) {
    setAttributeInternal(LATESTVERSIONIND, value);
  }

  /**
   * 
   * Gets the attribute value for DELETED_IND using the alias name DeletedInd
   */
  public String getDeletedInd() {
    return (String)getAttributeInternal(DELETEDIND);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DELETED_IND using the alias name DeletedInd
   */
  public void setDeletedInd(String value) {
    setAttributeInternal(DELETEDIND, value);
  }

  /**
   * 
   * Gets the attribute value for DATE_CREATED using the alias name DateCreated
   */
  public Date getDateCreated() {
    return (Date)getAttributeInternal(DATECREATED);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DATE_CREATED using the alias name DateCreated
   */
  public void setDateCreated(Date value) {
    setAttributeInternal(DATECREATED, value);
  }

  /**
   * 
   * Gets the attribute value for CREATED_BY using the alias name CreatedBy
   */
  public String getCreatedBy() {
    return (String)getAttributeInternal(CREATEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy
   */
  public void setCreatedBy(String value) {
    setAttributeInternal(CREATEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for DATE_MODIFIED using the alias name DateModified
   */
  public Date getDateModified() {
    return (Date)getAttributeInternal(DATEMODIFIED);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DATE_MODIFIED using the alias name DateModified
   */
  public void setDateModified(Date value) {
    setAttributeInternal(DATEMODIFIED, value);
  }

  /**
   * 
   * Gets the attribute value for MODIFIED_BY using the alias name ModifiedBy
   */
  public String getModifiedBy() {
    return (String)getAttributeInternal(MODIFIEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for MODIFIED_BY using the alias name ModifiedBy
   */
  public void setModifiedBy(String value) {
    setAttributeInternal(MODIFIEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for CHAR_SET_NAME using the alias name CharSetName
   */
  public String getCharSetName() {
    return (String)getAttributeInternal(CHARSETNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CHAR_SET_NAME using the alias name CharSetName
   */
  public void setCharSetName(String value) {
    setAttributeInternal(CHARSETNAME, value);
  }

  /**
   * 
   * Gets the attribute value for HIGH_VALUE_NUM using the alias name HighValueNum
   */
  public String getHighValueNum() {
    return (String)getAttributeInternal(HIGHVALUENUM);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for HIGH_VALUE_NUM using the alias name HighValueNum
   */
  public void setHighValueNum(String value) {
    setAttributeInternal(HIGHVALUENUM, value);
  }

  /**
   * 
   * Gets the attribute value for LOW_VALUE_NUM using the alias name LowValueNum
   */
  public String getLowValueNum() {
    return (String)getAttributeInternal(LOWVALUENUM);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LOW_VALUE_NUM using the alias name LowValueNum
   */
  public void setLowValueNum(String value) {
    setAttributeInternal(LOWVALUENUM, value);
  }

  /**
   * 
   * Gets the associated <code>RowIterator</code> using master-detail link DataElementsView
   */
  public RowIterator getDataElementsView() {
    return (RowIterator)getAttributeInternal(DATAELEMENTSVIEW);
  }

  /**
   * 
   * Gets the associated <code>RowIterator</code> using master-detail link VdPvsView
   */
  public RowIterator getVdPvsView() {
    return (RowIterator)getAttributeInternal(VDPVSVIEW);
  }
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case VDIDSEQ:
        return getVdIdseq();
      case VERSION:
        return getVersion();
      case PREFERREDNAME:
        return getPreferredName();
      case CONTEIDSEQ:
        return getConteIdseq();
      case PREFERREDDEFINITION:
        return getPreferredDefinition();
      case DTLNAME:
        return getDtlName();
      case BEGINDATE:
        return getBeginDate();
      case CDIDSEQ:
        return getCdIdseq();
      case ENDDATE:
        return getEndDate();
      case VDTYPEFLAG:
        return getVdTypeFlag();
      case ASLNAME:
        return getAslName();
      case CHANGENOTE:
        return getChangeNote();
      case UOMLNAME:
        return getUomlName();
      case LONGNAME:
        return getLongName();
      case FORMLNAME:
        return getFormlName();
      case MAXLENGTHNUM:
        return getMaxLengthNum();
      case MINLENGTHNUM:
        return getMinLengthNum();
      case DECIMALPLACE:
        return getDecimalPlace();
      case LATESTVERSIONIND:
        return getLatestVersionInd();
      case DELETEDIND:
        return getDeletedInd();
      case DATECREATED:
        return getDateCreated();
      case CREATEDBY:
        return getCreatedBy();
      case DATEMODIFIED:
        return getDateModified();
      case MODIFIEDBY:
        return getModifiedBy();
      case CHARSETNAME:
        return getCharSetName();
      case HIGHVALUENUM:
        return getHighValueNum();
      case LOWVALUENUM:
        return getLowValueNum();
      case QUALIFIERNAME:
        return getQualifierName();
      case ORIGIN:
        return getOrigin();
      case VDID:
        return getVdId();
      case REPIDSEQ:
        return getRepIdseq();
      case CONDRIDSEQ:
        return getCondrIdseq();
      case DATAELEMENTSVIEW:
        return getDataElementsView();
      case VDPVSVIEW:
        return getVdPvsView();
      case REPRESENTATIONVIEWOBJ:
        return getRepresentationViewObj();
     case REPRESENTATIONROW:
        return getRepresentationRow();
      case CONCEPTUALDOMAINSROW:
        return getConceptualDomainsRow();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case VDIDSEQ:
        setVdIdseq((String)value);
        return;
      case VERSION:
        setVersion((Number)value);
        return;
      case PREFERREDNAME:
        setPreferredName((String)value);
        return;
      case CONTEIDSEQ:
        setConteIdseq((String)value);
        return;
      case PREFERREDDEFINITION:
        setPreferredDefinition((String)value);
        return;
      case DTLNAME:
        setDtlName((String)value);
        return;
      case BEGINDATE:
        setBeginDate((Date)value);
        return;
      case CDIDSEQ:
        setCdIdseq((String)value);
        return;
      case ENDDATE:
        setEndDate((Date)value);
        return;
      case VDTYPEFLAG:
        setVdTypeFlag((String)value);
        return;
      case ASLNAME:
        setAslName((String)value);
        return;
      case CHANGENOTE:
        setChangeNote((String)value);
        return;
      case UOMLNAME:
        setUomlName((String)value);
        return;
      case LONGNAME:
        setLongName((String)value);
        return;
      case FORMLNAME:
        setFormlName((String)value);
        return;
      case MAXLENGTHNUM:
        setMaxLengthNum((Number)value);
        return;
      case MINLENGTHNUM:
        setMinLengthNum((Number)value);
        return;
      case DECIMALPLACE:
        setDecimalPlace((Number)value);
        return;
      case LATESTVERSIONIND:
        setLatestVersionInd((String)value);
        return;
      case DELETEDIND:
        setDeletedInd((String)value);
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
      case CHARSETNAME:
        setCharSetName((String)value);
        return;
      case HIGHVALUENUM:
        setHighValueNum((String)value);
        return;
      case LOWVALUENUM:
        setLowValueNum((String)value);
        return;
      case QUALIFIERNAME:
        setQualifierName((String)value);
        return;
      case ORIGIN:
        setOrigin((String)value);
        return;
      case VDID:
        setVdId((Number)value);
        return;
      case REPIDSEQ:
        setRepIdseq((String)value);
        return;
      case CONDRIDSEQ:
        setCondrIdseq((String)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   * Gets the associated <code>Row</code> using master-detail link ConceptualDomainsRow
   */
  public oracle.jbo.Row getConceptualDomainsRow() {
    return (oracle.jbo.Row)getAttributeInternal(CONCEPTUALDOMAINSROW);
  }
  /**
   * 
   * Gets the associated Conceptual Domain Preferred Name
   */
  public String getCDPrefName(){
    return (String)getConceptualDomain().getAttribute("PreferredName");
  }
  /**
   * 
   * Gets the associated Conceptual Domain Version
   */
  public Number getCDVersion(){
    return (Number)getConceptualDomain().getAttribute("Version");
  }
  /**
   * 
   * Gets the associated Conceptual Domain Context Name
   */
  public String getCDContextName(){
    return ((ConceptualDomainsViewRowImpl)getConceptualDomain())
             .getContextName();
  }
  
  public Number getCDPublicId(){
    return ((ConceptualDomainsViewRowImpl)getConceptualDomain()).getCdId();
  }
  

  public oracle.jbo.Row getConceptualDomain()
  {
    oracle.jbo.Row row = null;
    try
    {
      oracle.jbo.ViewObject cdView =
        getViewObject().getApplicationModule().findViewObject("ConceptualDomainsView");

      cdView.setWhereClause("CD_IDSEQ='"+ getCdIdseq()+"'");
      row = cdView.first();
      
    }
    catch(Exception e)
    {
      log.error("Error in getValueDomain(): ", e);
    }
    return row;
  }

  /**
   * 
   * Gets the attribute value for QUALIFIER_NAME using the alias name QualifierName
   */
  public String getQualifierName() {
    return (String)getAttributeInternal(QUALIFIERNAME);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for QUALIFIER_NAME using the alias name QualifierName
   */
  public void setQualifierName(String value) {
    setAttributeInternal(QUALIFIERNAME, value);
  }

  /**
   * 
   * Gets the attribute value for ORIGIN using the alias name Origin
   */
  public String getOrigin() {
    return (String)getAttributeInternal(ORIGIN);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for ORIGIN using the alias name Origin
   */
  public void setOrigin(String value) {
    setAttributeInternal(ORIGIN, value);
  }

  /**
   * 
   * Gets the attribute value for VD_ID using the alias name VdId
   */
  public Number getVdId() {
    return (Number)getAttributeInternal(VDID);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for VD_ID using the alias name VdId
   */
  public void setVdId(Number value) {
    setAttributeInternal(VDID, value);
  }

  /**
   * 
   *  Gets the attribute value for REP_IDSEQ using the alias name RepIdseq
   */
  public String getRepIdseq()
  {
    return (String)getAttributeInternal(REPIDSEQ);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for REP_IDSEQ using the alias name RepIdseq
   */
  public void setRepIdseq(String value)
  {
    setAttributeInternal(REPIDSEQ, value);
  }

    /**
     * Gets the associated <code>Row</code> using master-detail link
     * RepresentationRow
     */
    public oracle.jbo.Row getRepresentationRow() {
      return (oracle.jbo.Row) getAttributeInternal(REPRESENTATIONROW);
    }

  /**
   * 
   *  Gets the associated <code>Row</code> using master-detail link RepresentationViewObj
   */
  public oracle.jbo.Row getRepresentationViewObj()
  {
    return (oracle.jbo.Row)getAttributeInternal(REPRESENTATIONVIEWOBJ);
  }

  /**
   * 
   *  Gets the attribute value for CONDR_IDSEQ using the alias name CondrIdseq
   */
  public String getCondrIdseq()
  {
    return (String)getAttributeInternal(CONDRIDSEQ);
  }

  /**
   * 
   *  Sets <code>value</code> as attribute value for CONDR_IDSEQ using the alias name CondrIdseq
   */
  public void setCondrIdseq(String value)
  {
    setAttributeInternal(CONDRIDSEQ, value);
  }
  
  
    /**
     * Gets the associated Representation Preferred Name
     */
    public String getRepresentationPrefName() {
      if (getRepIdseq() != null) {
        return (String) getRepresentationRow().getAttribute("PreferredName");
      }
      else {
        return "";
      }
    }
    
    /**
     * Gets the associated  Representation Long Name
     */
    public String getRepresentationLongName() {
      if (getRepIdseq() != null) {
        return (String) getRepresentationRow().getAttribute("LongName");
      }
      else {
        return "";
      }
    }  

    /**
     * Gets the associated Representaion Context Name
     */
  /*  public String getRepresentationContextName() {
      if (getRepIdseq() != null) {
          return ((RepresentationViewObjRowImpl) getRepresentationRow()).getContextName();
           }
      else {
        return "";
      }
    }*/

    /**
     * Gets the associated Representation Version
     */
    public Number getRepresentationVersion() {
    Object test = getRepresentationRow().getAttribute("Version");
    
      if (getRepIdseq() != null) {
        return (Number) getRepresentationRow().getAttribute("Version");
      }
      else {
        return null;
      }
    }
    
    /**
     * Gets the associated Property Context Name
     */
    public String getRepresentationContextName() {
      if (getRepIdseq() != null) {
        return ((RepresentationViewObjRowImpl) getRepresentationRow()).getContextName();
      }
      else {
        return "";
      }
    }

    /**
     * Gets the associated Representation Public ID
     */
    public Number getRepresentationPublicId() {
      if (getRepIdseq() != null) {
        return (Number) getRepresentationRow().getAttribute("RepId");
      }
      else {
        return null;
      }
    }



}