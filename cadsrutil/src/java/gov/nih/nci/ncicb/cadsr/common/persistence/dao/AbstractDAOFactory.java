/*L
 * Copyright Oracle inc, SAIC-F
 *
 * Distributed under the OSI-approved BSD 3-Clause License.
 * See http://ncip.github.com/cadsr-util/LICENSE.txt for details.
 */

package gov.nih.nci.ncicb.cadsr.common.persistence.dao;

import gov.nih.nci.ncicb.cadsr.common.persistence.PersistenceConstants;
import gov.nih.nci.ncicb.cadsr.common.persistence.dao.ReferenceDocumentTypeDAO;
import gov.nih.nci.ncicb.cadsr.common.servicelocator.ServiceLocator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public abstract class AbstractDAOFactory implements PersistenceConstants {
  private static Map cache = Collections.synchronizedMap(new HashMap());
  protected ServiceLocator serviceLocator;

  public AbstractDAOFactory() {
  }

  public abstract FormDAO getFormDAO();
  
  public abstract FormV2DAO getFormV2DAO();

  public abstract AdminComponentDAO getAdminComponentDAO();

  public abstract ClassificationSchemeDAO getClassificationSchemeDAO();
  
  public abstract ModuleDAO getModuleDAO();

  public abstract ModuleV2DAO getModuleV2DAO();

  public abstract QuestionDAO getQuestionDAO();
  
  public abstract QuestionRepititionDAO getQuestionRepititionDAO();

  public abstract FormValidValueDAO getFormValidValueDAO();

  public abstract UserManagerDAO getUserManagerDAO();

  public abstract ContextDAO getContextDAO();

  public abstract FormCategoryDAO getFormCategoryDAO();

  public abstract WorkFlowStatusDAO getWorkFlowStatusDAO();

  public abstract FormInstructionDAO getFormInstructionDAO ();

  public abstract ModuleInstructionDAO getModuleInstructionDAO ();

  public abstract QuestionInstructionDAO getQuestionInstructionDAO ();

  public abstract FormValidValueInstructionDAO getFormValidValueInstructionDAO ();

  public abstract CDECartDAO getCDECartDAO ();
  
  public abstract ValueDomainDAO getValueDomainDAO ();
  
  public abstract ValueDomainV2DAO getValueDomainV2DAO ();
  
  public abstract DerivedDataElementDAO getDerivedDataElementDAO ();
  
  public abstract ConceptDAO getConceptDAO ();
   
  public abstract ReferenceDocumentDAO getReferenceDocumentDAO ();
  
  public abstract UtilDAO getUtilDAO();

  public abstract ReferenceDocumentTypeDAO getReferenceDocumentTypeDAO ();
   
  public abstract ProtocolDAO getProtocolDAO ();
  
  public abstract TriggerActionDAO getTriggerActionDAO ();
  
  public abstract DataElementDAO getDataElementDAO();

  public abstract ContactCommunicationV2DAO getContactCommunicationV2DAO();

  public static AbstractDAOFactory getDAOFactory(ServiceLocator locator)
    throws DAOCreateException {
    AbstractDAOFactory factory = null;
    String daoFactoryClassName = locator.getString(DAO_FACTORY_CLASS_KEY);

    factory = getDAOFactory(daoFactoryClassName);
    factory.setServiceLocator(locator);

    return factory;
  }

  public static AbstractDAOFactory getDAOFactory(String daoFactoryClassName)
    throws DAOCreateException {
    AbstractDAOFactory factory = null;

    factory = (AbstractDAOFactory) cache.get(daoFactoryClassName);

    if (factory == null) {
      try {
        Class factoryClass = Class.forName(daoFactoryClassName);
        factory = (AbstractDAOFactory) factoryClass.newInstance();
        cache.put(factory.getClass().getName(), factory);
      }
      catch (Exception ex) {
        ex.printStackTrace();
        throw new DAOCreateException(
          "Unable to create specified DAOFactory implementation", ex);
      }
    }

    return factory;
  }

  public void setServiceLocator(ServiceLocator newServiceLocator) {
    serviceLocator = newServiceLocator;
  }

  public ServiceLocator getServiceLocator() {
    return serviceLocator;
  }
}
