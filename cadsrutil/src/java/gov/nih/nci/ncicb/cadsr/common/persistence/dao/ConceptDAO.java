/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.dao;
import gov.nih.nci.ncicb.cadsr.common.resource.ConceptDerivationRule;
import java.util.List;
import java.util.Map;

public interface ConceptDAO extends AdminComponentDAO
{

  public ConceptDerivationRule findConceptDerivationRule(String derivationId);
  
  public ConceptDerivationRule getPropertyConceptDerivationRuleForDEC(String decId);
  
  public ConceptDerivationRule getObjectClassConceptDerivationRuleForDEC(String decId);

  public ConceptDerivationRule getRepresentationDerivationRuleForVD(String vdId);
  
  public Map getAllDerivationRulesForIds(List cdrIdseqs);
  
  public List populateConceptsForValidValues(List vvList);
}