/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.bc4j;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.RowIterator;
import oracle.jbo.AttributeList;
import oracle.jbo.server.TransactionEvent;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import oracle.jbo.Key;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class QuestContentsExtImpl extends EntityImpl  {
  public static final int QCIDSEQ = 0;
  public static final int VERSION = 1;
  public static final int QTLNAME = 2;
  public static final int CONTEIDSEQ = 3;
  public static final int ASLNAME = 4;
  public static final int PREFERREDNAME = 5;
  public static final int PREFERREDDEFINITION = 6;
  public static final int PROTOIDSEQ = 7;
  public static final int DEIDSEQ = 8;
  public static final int VPIDSEQ = 9;
  public static final int QCMATCHIDSEQ = 10;
  public static final int QCIDENTIFIER = 11;
  public static final int QCDLNAME = 12;
  public static final int LONGNAME = 13;
  public static final int LATESTVERSIONIND = 14;
  public static final int DELETEDIND = 15;
  public static final int BEGINDATE = 16;
  public static final int ENDDATE = 17;
  public static final int MATCHIND = 18;
  public static final int NEWQCIND = 19;
  public static final int HIGHLIGHTIND = 20;
  public static final int REVIEWERFEEDBACKACTION = 21;
  public static final int REVIEWERFEEDBACKINTERNAL = 22;
  public static final int REVIEWERFEEDBACKEXTERNAL = 23;
  public static final int SYSTEMMSGS = 24;
  public static final int REVIEWEDBY = 25;
  public static final int REVIEWEDDATE = 26;
  public static final int APPROVEDBY = 27;
  public static final int APPROVEDDATE = 28;
  public static final int CDEDICTIONARYID = 29;
  public static final int DATECREATED = 30;
  public static final int CREATEDBY = 31;
  public static final int DATEMODIFIED = 32;
  public static final int MODIFIEDBY = 33;
  public static final int CHANGENOTE = 34;
  public static final int SUBMITTEDLONGCDENAME = 35;
  public static final int GROUPCOMMENTS = 36;
  public static final int SRCNAME = 37;
  public static final int PMODIDSEQ = 38;
  public static final int PQSTIDSEQ = 39;
  public static final int PVALIDSEQ = 40;
  public static final int DNCRFIDSEQ = 41;
  public static final int DNVDIDSEQ = 42;
  public static final int DISPLAYIND = 43;
  public static final int GROUPACTION = 44;
  public static final int DELONGNAME = 45;
  public static final int VDLONGNAME = 46;
  public static final int DECLONGNAME = 47;
  public static final int DISPLAYORDER = 48;
  public static final int ORIGIN = 49;
  public static final int QCID = 50;
  public static final int CONTEXTS = 51;
  public static final int DATAELEMENTS = 52;
  public static final int VDPVS = 53;
  public static final int PROTOCOL = 54;
  public static final int QCRECSEXT = 55;
  public static final int QCRECSEXT1 = 56;
  //protected static final int PROTOCOLSEXT = 51;













































  private static EntityDefImpl mDefinitionObject;

  /**
   * 
   * This is the default constructor (do not remove)
   */
  public QuestContentsExtImpl() {
  }

  /**
   * 
   *  Retrieves the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    if (mDefinitionObject == null)
    {
      mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("gov.nih.nci.ncicb.cadsr.common.persistence.bc4j.QuestContentsExt");
    }
    return mDefinitionObject;
  }














































  /**
   * 
   * Add attribute defaulting logic in this method.
   */
  protected void create(AttributeList attributeList) {
    super.create(attributeList);
  }

  /**
   * 
   * Add entity remove logic in this method.
   */
  public void remove() {
    super.remove();
  }

  /**
   * 
   * Add Entity validation code in this method.
   */
  protected void validateEntity() {
    super.validateEntity();
  }

  /**
   * 
   * Add locking logic here.
   */
  public void lock() {
    super.lock();
  }

  /**
   * 
   * Custom DML update/insert/delete logic here.
   */
  protected void doDML(int operation, TransactionEvent e) {
    super.doDML(operation, e);
  }

  /**
   * 
   * Gets the attribute value for QcIdseq, using the alias name QcIdseq
   */
  public String getQcIdseq() {
    return (String)getAttributeInternal(QCIDSEQ);
  }


  /**
   * 
   * Gets the attribute value for Version, using the alias name Version
   */
  public Number getVersion() {
    return (Number)getAttributeInternal(VERSION);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Version
   */
  public void setVersion(Number value) {
    setAttributeInternal(VERSION, value);
  }

  /**
   * 
   * Gets the attribute value for QtlName, using the alias name QtlName
   */
  public String getQtlName() {
    return (String)getAttributeInternal(QTLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for QtlName
   */
  public void setQtlName(String value) {
    setAttributeInternal(QTLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for ConteIdseq, using the alias name ConteIdseq
   */
  public String getConteIdseq() {
    return (String)getAttributeInternal(CONTEIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ConteIdseq
   */
  public void setConteIdseq(String value) {
    setAttributeInternal(CONTEIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for AslName, using the alias name AslName
   */
  public String getAslName() {
    return (String)getAttributeInternal(ASLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for AslName
   */
  public void setAslName(String value) {
    setAttributeInternal(ASLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for PreferredName, using the alias name PreferredName
   */
  public String getPreferredName() {
    return (String)getAttributeInternal(PREFERREDNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for PreferredName
   */
  public void setPreferredName(String value) {
    setAttributeInternal(PREFERREDNAME, value);
  }

  /**
   * 
   * Gets the attribute value for PreferredDefinition, using the alias name PreferredDefinition
   */
  public String getPreferredDefinition() {
    return (String)getAttributeInternal(PREFERREDDEFINITION);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for PreferredDefinition
   */
  public void setPreferredDefinition(String value) {
    setAttributeInternal(PREFERREDDEFINITION, value);
  }

  /**
   * 
   * Gets the attribute value for ProtoIdseq, using the alias name ProtoIdseq
   */
  public String getProtoIdseq() {
    return (String)getAttributeInternal(PROTOIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ProtoIdseq
   */
  public void setProtoIdseq(String value) {
    setAttributeInternal(PROTOIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DeIdseq, using the alias name DeIdseq
   */
  public String getDeIdseq() {
    return (String)getAttributeInternal(DEIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DeIdseq
   */
  public void setDeIdseq(String value) {
    setAttributeInternal(DEIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for VpIdseq, using the alias name VpIdseq
   */
  public String getVpIdseq() {
    return (String)getAttributeInternal(VPIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for VpIdseq
   */
  public void setVpIdseq(String value) {
    setAttributeInternal(VPIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for QcMatchIdseq, using the alias name QcMatchIdseq
   */
  public String getQcMatchIdseq() {
    return (String)getAttributeInternal(QCMATCHIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for QcMatchIdseq
   */
  public void setQcMatchIdseq(String value) {
    setAttributeInternal(QCMATCHIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for QcIdentifier, using the alias name QcIdentifier
   */
  public String getQcIdentifier() {
    return (String)getAttributeInternal(QCIDENTIFIER);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for QcIdentifier
   */
  public void setQcIdentifier(String value) {
    setAttributeInternal(QCIDENTIFIER, value);
  }

  /**
   * 
   * Gets the attribute value for QcdlName, using the alias name QcdlName
   */
  public String getQcdlName() {
    return (String)getAttributeInternal(QCDLNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for QcdlName
   */
  public void setQcdlName(String value) {
    setAttributeInternal(QCDLNAME, value);
  }

  /**
   * 
   * Gets the attribute value for LongName, using the alias name LongName
   */
  public String getLongName() {
    return (String)getAttributeInternal(LONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for LongName
   */
  public void setLongName(String value) {
    setAttributeInternal(LONGNAME, value);
  }

  /**
   * 
   * Gets the attribute value for LatestVersionInd, using the alias name LatestVersionInd
   */
  public String getLatestVersionInd() {
    return (String)getAttributeInternal(LATESTVERSIONIND);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for LatestVersionInd
   */
  public void setLatestVersionInd(String value) {
    setAttributeInternal(LATESTVERSIONIND, value);
  }

  /**
   * 
   * Gets the attribute value for DeletedInd, using the alias name DeletedInd
   */
  public String getDeletedInd() {
    return (String)getAttributeInternal(DELETEDIND);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DeletedInd
   */
  public void setDeletedInd(String value) {
    setAttributeInternal(DELETEDIND, value);
  }

  /**
   * 
   * Gets the attribute value for BeginDate, using the alias name BeginDate
   */
  public Date getBeginDate() {
    return (Date)getAttributeInternal(BEGINDATE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for BeginDate
   */
  public void setBeginDate(Date value) {
    setAttributeInternal(BEGINDATE, value);
  }

  /**
   * 
   * Gets the attribute value for EndDate, using the alias name EndDate
   */
  public Date getEndDate() {
    return (Date)getAttributeInternal(ENDDATE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for EndDate
   */
  public void setEndDate(Date value) {
    setAttributeInternal(ENDDATE, value);
  }

  /**
   * 
   * Gets the attribute value for MatchInd, using the alias name MatchInd
   */
  public String getMatchInd() {
    return (String)getAttributeInternal(MATCHIND);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for MatchInd
   */
  public void setMatchInd(String value) {
    setAttributeInternal(MATCHIND, value);
  }

  /**
   * 
   * Gets the attribute value for NewQcInd, using the alias name NewQcInd
   */
  public String getNewQcInd() {
    return (String)getAttributeInternal(NEWQCIND);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for NewQcInd
   */
  public void setNewQcInd(String value) {
    setAttributeInternal(NEWQCIND, value);
  }

  /**
   * 
   * Gets the attribute value for HighlightInd, using the alias name HighlightInd
   */
  public String getHighlightInd() {
    return (String)getAttributeInternal(HIGHLIGHTIND);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for HighlightInd
   */
  public void setHighlightInd(String value) {
    setAttributeInternal(HIGHLIGHTIND, value);
  }

  /**
   * 
   * Gets the attribute value for ReviewerFeedbackAction, using the alias name ReviewerFeedbackAction
   */
  public String getReviewerFeedbackAction() {
    return (String)getAttributeInternal(REVIEWERFEEDBACKACTION);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ReviewerFeedbackAction
   */
  public void setReviewerFeedbackAction(String value) {
    setAttributeInternal(REVIEWERFEEDBACKACTION, value);
  }

  /**
   * 
   * Gets the attribute value for ReviewerFeedbackInternal, using the alias name ReviewerFeedbackInternal
   */
  public String getReviewerFeedbackInternal() {
    return (String)getAttributeInternal(REVIEWERFEEDBACKINTERNAL);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ReviewerFeedbackInternal
   */
  public void setReviewerFeedbackInternal(String value) {
    setAttributeInternal(REVIEWERFEEDBACKINTERNAL, value);
  }

  /**
   * 
   * Gets the attribute value for ReviewerFeedbackExternal, using the alias name ReviewerFeedbackExternal
   */
  public String getReviewerFeedbackExternal() {
    return (String)getAttributeInternal(REVIEWERFEEDBACKEXTERNAL);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ReviewerFeedbackExternal
   */
  public void setReviewerFeedbackExternal(String value) {
    setAttributeInternal(REVIEWERFEEDBACKEXTERNAL, value);
  }

  /**
   * 
   * Gets the attribute value for SystemMsgs, using the alias name SystemMsgs
   */
  public String getSystemMsgs() {
    return (String)getAttributeInternal(SYSTEMMSGS);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for SystemMsgs
   */
  public void setSystemMsgs(String value) {
    setAttributeInternal(SYSTEMMSGS, value);
  }

  /**
   * 
   * Gets the attribute value for ReviewedBy, using the alias name ReviewedBy
   */
  public String getReviewedBy() {
    return (String)getAttributeInternal(REVIEWEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ReviewedBy
   */
  public void setReviewedBy(String value) {
    setAttributeInternal(REVIEWEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for ReviewedDate, using the alias name ReviewedDate
   */
  public Date getReviewedDate() {
    return (Date)getAttributeInternal(REVIEWEDDATE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ReviewedDate
   */
  public void setReviewedDate(Date value) {
    setAttributeInternal(REVIEWEDDATE, value);
  }

  /**
   * 
   * Gets the attribute value for ApprovedBy, using the alias name ApprovedBy
   */
  public String getApprovedBy() {
    return (String)getAttributeInternal(APPROVEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ApprovedBy
   */
  public void setApprovedBy(String value) {
    setAttributeInternal(APPROVEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for ApprovedDate, using the alias name ApprovedDate
   */
  public Date getApprovedDate() {
    return (Date)getAttributeInternal(APPROVEDDATE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ApprovedDate
   */
  public void setApprovedDate(Date value) {
    setAttributeInternal(APPROVEDDATE, value);
  }

  /**
   * 
   * Gets the attribute value for CdeDictionaryId, using the alias name CdeDictionaryId
   */
  public Number getCdeDictionaryId() {
    return (Number)getAttributeInternal(CDEDICTIONARYID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for CdeDictionaryId
   */
  public void setCdeDictionaryId(Number value) {
    setAttributeInternal(CDEDICTIONARYID, value);
  }

  /**
   * 
   * Gets the attribute value for DateCreated, using the alias name DateCreated
   */
  public Date getDateCreated() {
    return (Date)getAttributeInternal(DATECREATED);
  }


  /**
   * 
   * Gets the attribute value for CreatedBy, using the alias name CreatedBy
   */
  public String getCreatedBy() {
    return (String)getAttributeInternal(CREATEDBY);
  }


  /**
   * 
   * Gets the attribute value for DateModified, using the alias name DateModified
   */
  public Date getDateModified() {
    return (Date)getAttributeInternal(DATEMODIFIED);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DateModified
   */
  public void setDateModified(Date value) {
    setAttributeInternal(DATEMODIFIED, value);
  }

  /**
   * 
   * Gets the attribute value for ModifiedBy, using the alias name ModifiedBy
   */
  public String getModifiedBy() {
    return (String)getAttributeInternal(MODIFIEDBY);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ModifiedBy
   */
  public void setModifiedBy(String value) {
    setAttributeInternal(MODIFIEDBY, value);
  }

  /**
   * 
   * Gets the attribute value for ChangeNote, using the alias name ChangeNote
   */
  public String getChangeNote() {
    return (String)getAttributeInternal(CHANGENOTE);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for ChangeNote
   */
  public void setChangeNote(String value) {
    setAttributeInternal(CHANGENOTE, value);
  }

  /**
   * 
   * Gets the attribute value for SubmittedLongCdeName, using the alias name SubmittedLongCdeName
   */
  public String getSubmittedLongCdeName() {
    return (String)getAttributeInternal(SUBMITTEDLONGCDENAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for SubmittedLongCdeName
   */
  public void setSubmittedLongCdeName(String value) {
    setAttributeInternal(SUBMITTEDLONGCDENAME, value);
  }

  /**
   * 
   * Gets the attribute value for GroupComments, using the alias name GroupComments
   */
  public String getGroupComments() {
    return (String)getAttributeInternal(GROUPCOMMENTS);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for GroupComments
   */
  public void setGroupComments(String value) {
    setAttributeInternal(GROUPCOMMENTS, value);
  }

  /**
   * 
   * Gets the attribute value for SrcName, using the alias name SrcName
   */
  public String getSrcName() {
    return (String)getAttributeInternal(SRCNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for SrcName
   */
  public void setSrcName(String value) {
    setAttributeInternal(SRCNAME, value);
  }

  /**
   * 
   * Gets the attribute value for PModIdseq, using the alias name PModIdseq
   */
  public String getPModIdseq() {
    return (String)getAttributeInternal(PMODIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for PModIdseq
   */
  public void setPModIdseq(String value) {
    setAttributeInternal(PMODIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for PQstIdseq, using the alias name PQstIdseq
   */
  public String getPQstIdseq() {
    return (String)getAttributeInternal(PQSTIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for PQstIdseq
   */
  public void setPQstIdseq(String value) {
    setAttributeInternal(PQSTIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for PValIdseq, using the alias name PValIdseq
   */
  public String getPValIdseq() {
    return (String)getAttributeInternal(PVALIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for PValIdseq
   */
  public void setPValIdseq(String value) {
    setAttributeInternal(PVALIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DnCrfIdseq, using the alias name DnCrfIdseq
   */
  public String getDnCrfIdseq() {
    return (String)getAttributeInternal(DNCRFIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DnCrfIdseq
   */
  public void setDnCrfIdseq(String value) {
    setAttributeInternal(DNCRFIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DnVdIdseq, using the alias name DnVdIdseq
   */
  public String getDnVdIdseq() {
    return (String)getAttributeInternal(DNVDIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DnVdIdseq
   */
  public void setDnVdIdseq(String value) {
    setAttributeInternal(DNVDIDSEQ, value);
  }

  /**
   * 
   * Gets the attribute value for DisplayInd, using the alias name DisplayInd
   */
  public String getDisplayInd() {
    return (String)getAttributeInternal(DISPLAYIND);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DisplayInd
   */
  public void setDisplayInd(String value) {
    setAttributeInternal(DISPLAYIND, value);
  }

  /**
   * 
   * Gets the attribute value for GroupAction, using the alias name GroupAction
   */
  public String getGroupAction() {
    return (String)getAttributeInternal(GROUPACTION);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for GroupAction
   */
  public void setGroupAction(String value) {
    setAttributeInternal(GROUPACTION, value);
  }

  /**
   * 
   * Gets the attribute value for DeLongName, using the alias name DeLongName
   */
  public String getDeLongName() {
    return (String)getAttributeInternal(DELONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DeLongName
   */
  public void setDeLongName(String value) {
    setAttributeInternal(DELONGNAME, value);
  }

  /**
   * 
   * Gets the attribute value for VdLongName, using the alias name VdLongName
   */
  public String getVdLongName() {
    return (String)getAttributeInternal(VDLONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for VdLongName
   */
  public void setVdLongName(String value) {
    setAttributeInternal(VDLONGNAME, value);
  }

  /**
   * 
   * Gets the attribute value for DecLongName, using the alias name DecLongName
   */
  public String getDecLongName() {
    return (String)getAttributeInternal(DECLONGNAME);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DecLongName
   */
  public void setDecLongName(String value) {
    setAttributeInternal(DECLONGNAME, value);
  }

  /**
   * 
   * Gets the attribute value for DisplayOrder, using the alias name DisplayOrder
   */
  public Number getDisplayOrder() {
    return (Number)getAttributeInternal(DISPLAYORDER);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for DisplayOrder
   */
  public void setDisplayOrder(Number value) {
    setAttributeInternal(DISPLAYORDER, value);
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
      case PROTOIDSEQ:
        return getProtoIdseq();
      case DEIDSEQ:
        return getDeIdseq();
      case VPIDSEQ:
        return getVpIdseq();
      case QCMATCHIDSEQ:
        return getQcMatchIdseq();
      case QCIDENTIFIER:
        return getQcIdentifier();
      case QCDLNAME:
        return getQcdlName();
      case LONGNAME:
        return getLongName();
      case LATESTVERSIONIND:
        return getLatestVersionInd();
      case DELETEDIND:
        return getDeletedInd();
      case BEGINDATE:
        return getBeginDate();
      case ENDDATE:
        return getEndDate();
      case MATCHIND:
        return getMatchInd();
      case NEWQCIND:
        return getNewQcInd();
      case HIGHLIGHTIND:
        return getHighlightInd();
      case REVIEWERFEEDBACKACTION:
        return getReviewerFeedbackAction();
      case REVIEWERFEEDBACKINTERNAL:
        return getReviewerFeedbackInternal();
      case REVIEWERFEEDBACKEXTERNAL:
        return getReviewerFeedbackExternal();
      case SYSTEMMSGS:
        return getSystemMsgs();
      case REVIEWEDBY:
        return getReviewedBy();
      case REVIEWEDDATE:
        return getReviewedDate();
      case APPROVEDBY:
        return getApprovedBy();
      case APPROVEDDATE:
        return getApprovedDate();
      case CDEDICTIONARYID:
        return getCdeDictionaryId();
      case DATECREATED:
        return getDateCreated();
      case CREATEDBY:
        return getCreatedBy();
      case DATEMODIFIED:
        return getDateModified();
      case MODIFIEDBY:
        return getModifiedBy();
      case CHANGENOTE:
        return getChangeNote();
      case SUBMITTEDLONGCDENAME:
        return getSubmittedLongCdeName();
      case GROUPCOMMENTS:
        return getGroupComments();
      case SRCNAME:
        return getSrcName();
      case PMODIDSEQ:
        return getPModIdseq();
      case PQSTIDSEQ:
        return getPQstIdseq();
      case PVALIDSEQ:
        return getPValIdseq();
      case DNCRFIDSEQ:
        return getDnCrfIdseq();
      case DNVDIDSEQ:
        return getDnVdIdseq();
      case DISPLAYIND:
        return getDisplayInd();
      case GROUPACTION:
        return getGroupAction();
      case DELONGNAME:
        return getDeLongName();
      case VDLONGNAME:
        return getVdLongName();
      case DECLONGNAME:
        return getDecLongName();
      case DISPLAYORDER:
        return getDisplayOrder();
      case ORIGIN:
        return getOrigin();
      case QCID:
        return getQcId();
      case QCRECSEXT:
        return getQcRecsExt();
      case QCRECSEXT1:
        return getQcRecsExt1();
      case CONTEXTS:
        return getContexts();
      case DATAELEMENTS:
        return getDataElements();
      case VDPVS:
        return getVdPvs();
      case PROTOCOL:
        return getProtocol();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
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
      case PROTOIDSEQ:
        setProtoIdseq((String)value);
        return;
      case DEIDSEQ:
        setDeIdseq((String)value);
        return;
      case VPIDSEQ:
        setVpIdseq((String)value);
        return;
      case QCMATCHIDSEQ:
        setQcMatchIdseq((String)value);
        return;
      case QCIDENTIFIER:
        setQcIdentifier((String)value);
        return;
      case QCDLNAME:
        setQcdlName((String)value);
        return;
      case LONGNAME:
        setLongName((String)value);
        return;
      case LATESTVERSIONIND:
        setLatestVersionInd((String)value);
        return;
      case DELETEDIND:
        setDeletedInd((String)value);
        return;
      case BEGINDATE:
        setBeginDate((Date)value);
        return;
      case ENDDATE:
        setEndDate((Date)value);
        return;
      case MATCHIND:
        setMatchInd((String)value);
        return;
      case NEWQCIND:
        setNewQcInd((String)value);
        return;
      case HIGHLIGHTIND:
        setHighlightInd((String)value);
        return;
      case REVIEWERFEEDBACKACTION:
        setReviewerFeedbackAction((String)value);
        return;
      case REVIEWERFEEDBACKINTERNAL:
        setReviewerFeedbackInternal((String)value);
        return;
      case REVIEWERFEEDBACKEXTERNAL:
        setReviewerFeedbackExternal((String)value);
        return;
      case SYSTEMMSGS:
        setSystemMsgs((String)value);
        return;
      case REVIEWEDBY:
        setReviewedBy((String)value);
        return;
      case REVIEWEDDATE:
        setReviewedDate((Date)value);
        return;
      case APPROVEDBY:
        setApprovedBy((String)value);
        return;
      case APPROVEDDATE:
        setApprovedDate((Date)value);
        return;
      case CDEDICTIONARYID:
        setCdeDictionaryId((Number)value);
        return;
      case DATEMODIFIED:
        setDateModified((Date)value);
        return;
      case MODIFIEDBY:
        setModifiedBy((String)value);
        return;
      case CHANGENOTE:
        setChangeNote((String)value);
        return;
      case SUBMITTEDLONGCDENAME:
        setSubmittedLongCdeName((String)value);
        return;
      case GROUPCOMMENTS:
        setGroupComments((String)value);
        return;
      case SRCNAME:
        setSrcName((String)value);
        return;
      case PMODIDSEQ:
        setPModIdseq((String)value);
        return;
      case PQSTIDSEQ:
        setPQstIdseq((String)value);
        return;
      case PVALIDSEQ:
        setPValIdseq((String)value);
        return;
      case DNCRFIDSEQ:
        setDnCrfIdseq((String)value);
        return;
      case DNVDIDSEQ:
        setDnVdIdseq((String)value);
        return;
      case DISPLAYIND:
        setDisplayInd((String)value);
        return;
      case GROUPACTION:
        setGroupAction((String)value);
        return;
      case DELONGNAME:
        setDeLongName((String)value);
        return;
      case VDLONGNAME:
        setVdLongName((String)value);
        return;
      case DECLONGNAME:
        setDecLongName((String)value);
        return;
      case DISPLAYORDER:
        setDisplayOrder((Number)value);
        return;
      case ORIGIN:
        setOrigin((String)value);
        return;
      case QCID:
        setQcId((Number)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }

  /**
   * 
   * Gets the associated entity ContextsImpl
   */
  public ContextsImpl getContexts() {
    return (ContextsImpl)getAttributeInternal(CONTEXTS);
  }

  /**
   * 
   * Sets <code>value</code> as the associated entity ContextsImpl
   */
  public void setContexts(ContextsImpl value) {
    setAttributeInternal(CONTEXTS, value);
  }

  /**
   * 
   * Gets the associated entity DataElementsImpl
   */
  public DataElementsImpl getDataElements() {
    return (DataElementsImpl)getAttributeInternal(DATAELEMENTS);
  }

  /**
   * 
   * Sets <code>value</code> as the associated entity DataElementsImpl
   */
  public void setDataElements(DataElementsImpl value) {
    setAttributeInternal(DATAELEMENTS, value);
  }

  /**
   * 
   * Gets the associated entity ProtocolsExtImpl
   */
  /*public ProtocolsExtImpl getProtocolsExt() {
    return (ProtocolsExtImpl)getAttributeInternal(PROTOCOLSEXT);
  }*/

  /**
   * 
   * Sets <code>value</code> as the associated entity ProtocolsExtImpl
   */
  /*public void setProtocolsExt(ProtocolsExtImpl value) {
    setAttributeInternal(PROTOCOLSEXT, value);
  }*/

  /**
   * 
   * Gets the associated entity VdPvsImpl
   */
  public VdPvsImpl getVdPvs() {
    return (VdPvsImpl)getAttributeInternal(VDPVS);
  }

  /**
   * 
   * Sets <code>value</code> as the associated entity VdPvsImpl
   */
  public void setVdPvs(VdPvsImpl value) {
    setAttributeInternal(VDPVS, value);
  }


  /**
   * 
   * Gets the associated entity ProtocolImpl
   */
  public ProtocolImpl getProtocol() {
    return (ProtocolImpl)getAttributeInternal(PROTOCOL);
  }

  /**
   * 
   * Sets <code>value</code> as the associated entity ProtocolImpl
   */
  public void setProtocol(ProtocolImpl value) {
    setAttributeInternal(PROTOCOL, value);
  }


  /**
   * 
   * Gets the attribute value for Origin, using the alias name Origin
   */
  public String getOrigin()
  {
    return (String)getAttributeInternal(ORIGIN);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for Origin
   */
  public void setOrigin(String value)
  {
    setAttributeInternal(ORIGIN, value);
  }

  /**
   * 
   * Gets the attribute value for QcId, using the alias name QcId
   */
  public Number getQcId()
  {
    return (Number)getAttributeInternal(QCID);
  }

  /**
   * 
   * Sets <code>value</code> as the attribute value for QcId
   */
  public void setQcId(Number value)
  {
    setAttributeInternal(QCID, value);
  }


  /**
   * 
   * Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getQcRecsExt()
  {
    return (RowIterator)getAttributeInternal(QCRECSEXT);
  }

  /**
   * 
   * Gets the associated entity oracle.jbo.RowIterator
   */
  public RowIterator getQcRecsExt1()
  {
    return (RowIterator)getAttributeInternal(QCRECSEXT1);
  }

  /**
   * 
   *  Creates a Key object based on given key constituents
   */
  public static Key createPrimaryKey(String qcIdseq)
  {
    return new Key(new Object[] {qcIdseq});
  }











































}