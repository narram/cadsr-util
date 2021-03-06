/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.resource;

public class Version{
   private String id; //uniquely identify an Admin Component
   private Float versionNumber;
   private String changeNote;
   private boolean latestVersionIndicator = false;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setVersionNumber(Float versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Float getVersionNumber() {
        return versionNumber;
    }

    public void setChangeNote(String changeNote) {
        this.changeNote = changeNote;
    }

    public String getChangeNote() {
        return changeNote;
    }

    public void setLatestVersionIndicator(boolean latestVersionIndicator) {
        this.latestVersionIndicator = latestVersionIndicator;
    }

    public boolean isLatestVersionIndicator() {
        return latestVersionIndicator;
    }
}
