/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;

import java.util.List;

public interface TriggerActionChanges
{
    public void setTriggerActionId(String triggerActionId);

    public String getTriggerActionId();

    public void setNewInstruction(String newInstruction);

    public String getNewInstruction();

    public void setAddProtocols(List<String> addProtocols);

    public List<String> getAddProtocols();

    public void setAddCsis(List<String> addCsis);

    public List<String> getAddCsis();

    public void setDeleteProtocols(List<String> deleteProtocols);

    public List<String> getDeleteProtocols();

    public void setDeleteCsis(List<String> deleteCsis);

    public List<String> getDeleteCsis();

    public void setNewTargetId(String newTargetId);

    public String getNewTargetId();
}
