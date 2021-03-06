/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.servicelocator;

public interface Locate 
{
  public ServiceLocator getServiceLocator();

  public void setServiceLocator(ServiceLocator newServiceLocator);
}