/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;

import gov.nih.nci.ncicb.cadsr.common.CaDSRConstants;

import java.sql.Date;
import java.sql.Timestamp;


public interface Audit extends CaDSRConstants,Cloneable {
  public String getCreatedBy();

  public void setCreatedBy(String pCreatedBy);

  public Timestamp getDateCreated();

  public void setDateCreated(Timestamp pCreatedDate);

  public String getModifiedBy();

  public void setModifiedBy(String pModifiedBy);

  public Timestamp getDateModified();

  public void setDateModified(Timestamp pModifiedDate);

  
  public String toString();
}
