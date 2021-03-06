/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.dao;

import java.util.Collection;
import java.util.Map;
import java.util.List;

import gov.nih.nci.ncicb.cadsr.common.resource.ValueDomain;
import gov.nih.nci.ncicb.cadsr.common.resource.ValueMeaning;

public interface ValueDomainDAO extends AdminComponentDAO {
  /**
   * Gets all Value Domains and their Valid Values
   *
   * @param <b>vdIdseqs</b> list of Value Domain Idseq.
   *
   * @return <b>Map</b> Map of Value Domain objects each having
   *   list of Valid Value objects (key: vd idseq, value: vv list)
   *   
   */
  public Map getValidValues(Collection vdIdseqs);
  
  public Map getPermissibleValues(Collection vdIdseqs);
  
  public ValueDomain getValueDomainById(String vdId);
  
  public ValueMeaning getValueMeaning(String shortMeaning);
}
