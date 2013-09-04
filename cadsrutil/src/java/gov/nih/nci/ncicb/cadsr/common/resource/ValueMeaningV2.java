/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;

import java.util.List;


public interface ValueMeaningV2 extends ValueMeaning {

	public void setPreferredDefinition(String preferredDefinition);

	public String getPreferredDefinition();
}
