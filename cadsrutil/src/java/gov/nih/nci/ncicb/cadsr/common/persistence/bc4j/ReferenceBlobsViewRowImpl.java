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
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.BlobDomain;
//  ---------------------------------------------------------------
//  ---    File generated by Oracle Business Components for Java.
//  ---------------------------------------------------------------

public class ReferenceBlobsViewRowImpl extends ViewRowImpl  {


  public static final int RDIDSEQ = 0;
  public static final int NAME = 1;
  public static final int MIMETYPE = 2;
  public static final int DOCSIZE = 3;
  public static final int DADCHARSET = 4;
  public static final int LASTUPDATED = 5;
  public static final int CONTENTTYPE = 6;
  public static final int BLOBCONTENT = 7;
  public static final int CREATEDBY = 8;
  public static final int DATECREATED = 9;
  public static final int MODIFIEDBY = 10;
  public static final int DATEMODIFIED = 11;
  /**
   * 
   * This is the default constructor (do not remove)
   */
  public ReferenceBlobsViewRowImpl() {
  }

  /**
   * 
   * Gets ReferenceBlobs entity object.
   */
  public ReferenceBlobsImpl getReferenceBlobs() {
    return (ReferenceBlobsImpl)getEntity(0);
  }

  /**
   * 
   * Gets the attribute value for RD_IDSEQ using the alias name RdIdseq
   */
  public String getRdIdseq() {
    return (String)getAttributeInternal(RDIDSEQ);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for RD_IDSEQ using the alias name RdIdseq
   */
  public void setRdIdseq(String value) {
    setAttributeInternal(RDIDSEQ, value);
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
   * Sets <code>value</code> as attribute value for NAME using the alias name Name
   */
  public void setName(String value) {
    setAttributeInternal(NAME, value);
  }

  /**
   * 
   * Gets the attribute value for MIME_TYPE using the alias name MimeType
   */
  public String getMimeType() {
    return (String)getAttributeInternal(MIMETYPE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for MIME_TYPE using the alias name MimeType
   */
  public void setMimeType(String value) {
    setAttributeInternal(MIMETYPE, value);
  }

  /**
   * 
   * Gets the attribute value for DOC_SIZE using the alias name DocSize
   */
  public Number getDocSize() {
    return (Number)getAttributeInternal(DOCSIZE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DOC_SIZE using the alias name DocSize
   */
  public void setDocSize(Number value) {
    setAttributeInternal(DOCSIZE, value);
  }

  /**
   * 
   * Gets the attribute value for DAD_CHARSET using the alias name DadCharset
   */
  public String getDadCharset() {
    return (String)getAttributeInternal(DADCHARSET);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for DAD_CHARSET using the alias name DadCharset
   */
  public void setDadCharset(String value) {
    setAttributeInternal(DADCHARSET, value);
  }

  /**
   * 
   * Gets the attribute value for LAST_UPDATED using the alias name LastUpdated
   */
  public Date getLastUpdated() {
    return (Date)getAttributeInternal(LASTUPDATED);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for LAST_UPDATED using the alias name LastUpdated
   */
  public void setLastUpdated(Date value) {
    setAttributeInternal(LASTUPDATED, value);
  }

  /**
   * 
   * Gets the attribute value for CONTENT_TYPE using the alias name ContentType
   */
  public String getContentType() {
    return (String)getAttributeInternal(CONTENTTYPE);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for CONTENT_TYPE using the alias name ContentType
   */
  public void setContentType(String value) {
    setAttributeInternal(CONTENTTYPE, value);
  }

  /**
   * 
   * Gets the attribute value for BLOB_CONTENT using the alias name BlobContent
   */
  public BlobDomain getBlobContent() {
    return (BlobDomain)getAttributeInternal(BLOBCONTENT);
  }

  /**
   * 
   * Sets <code>value</code> as attribute value for BLOB_CONTENT using the alias name BlobContent
   */
  public void setBlobContent(BlobDomain value) {
    setAttributeInternal(BLOBCONTENT, value);
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
  //  Generated method. Do not modify.

  protected Object getAttrInvokeAccessor(int index, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case RDIDSEQ:
        return getRdIdseq();
      case NAME:
        return getName();
      case MIMETYPE:
        return getMimeType();
      case DOCSIZE:
        return getDocSize();
      case DADCHARSET:
        return getDadCharset();
      case LASTUPDATED:
        return getLastUpdated();
      case CONTENTTYPE:
        return getContentType();
      case BLOBCONTENT:
        return getBlobContent();
      case CREATEDBY:
        return getCreatedBy();
      case DATECREATED:
        return getDateCreated();
      case MODIFIEDBY:
        return getModifiedBy();
      case DATEMODIFIED:
        return getDateModified();
      default:
        return super.getAttrInvokeAccessor(index, attrDef);
      }
  }
  //  Generated method. Do not modify.

  protected void setAttrInvokeAccessor(int index, Object value, AttributeDefImpl attrDef) throws Exception {
    switch (index)
      {
      case RDIDSEQ:
        setRdIdseq((String)value);
        return;
      case NAME:
        setName((String)value);
        return;
      case MIMETYPE:
        setMimeType((String)value);
        return;
      case DOCSIZE:
        setDocSize((Number)value);
        return;
      case DADCHARSET:
        setDadCharset((String)value);
        return;
      case LASTUPDATED:
        setLastUpdated((Date)value);
        return;
      case CONTENTTYPE:
        setContentType((String)value);
        return;
      case BLOBCONTENT:
        setBlobContent((BlobDomain)value);
        return;
      case CREATEDBY:
        setCreatedBy((String)value);
        return;
      case DATECREATED:
        setDateCreated((Date)value);
        return;
      case MODIFIEDBY:
        setModifiedBy((String)value);
        return;
      case DATEMODIFIED:
        setDateModified((Date)value);
        return;
      default:
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
      }
  }
}