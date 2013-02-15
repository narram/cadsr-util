package gov.nih.nci.ncicb.cadsr.common.persistence.dao;


import gov.nih.nci.ncicb.cadsr.common.resource.ValueDomainV2;


public interface ValueDomainV2DAO extends AdminComponentDAO {
  
  public ValueDomainV2 getValueDomainV2ById(String vdId);
  
}
