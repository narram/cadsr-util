package gov.nih.nci.ncicb.cadsr.common.resource;

import gov.nih.nci.ncicb.cadsr.common.resource.CDECartItem;

import java.util.Collection;

public interface CDECart  {
  public Collection getDataElements();
  public void setDataElements(Collection items);
  public void setDataElement(CDECartItem item);

  public Collection getForms();
  public void setForm(CDECartItem form);
  public void setForms(Collection forms);

  public void removeDataElement(String itemId);
  public void removeDataElements(Collection items);

  public CDECartItem findDataElement(String itemId);

  public void mergeCart(CDECart cart);
}