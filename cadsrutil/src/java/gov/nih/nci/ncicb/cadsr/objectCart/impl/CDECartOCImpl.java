package gov.nih.nci.ncicb.cadsr.objectCart.impl;

import gov.nih.nci.ncicb.cadsr.common.CaDSRConstants;
import gov.nih.nci.ncicb.cadsr.objectCart.CDECart;
import gov.nih.nci.ncicb.cadsr.objectCart.CDECartItem;
import gov.nih.nci.ncicb.cadsr.objectCart.CDECartItemComparator;
import gov.nih.nci.objectCart.client.ClientManager;
import gov.nih.nci.objectCart.client.ObjectCartException;
import gov.nih.nci.objectCart.domain.Cart;
import gov.nih.nci.objectCart.domain.CartObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class CDECartOCImpl implements CDECart, Serializable  {

	private Cart oCart;
	private CDECartItemComparator itemComparator;
	private ClientManager cm;
	private String CLASSIFICATION_SCHEME;
	private String userId;
	private String cartName;

	public CDECartOCImpl(ClientManager cManager, String uid, String cName, String scheme) {
		oCart = new Cart();
		itemComparator = new CDECartItemComparator();
		cm = cManager;
		CLASSIFICATION_SCHEME = scheme;
		userId = uid;
		cartName = cName;
		try {
			oCart = cm.getClient(CLASSIFICATION_SCHEME).createCart(userId, cartName);
		} catch (ObjectCartException oce) {
			throw new RuntimeException("Constructor: Error creating the Object Cart with Classification Scheme: "+scheme, oce);
		}
	}  
	
	public Collection getDataElements() {

		try {
			if (oCart.getCartObjectCollection() != null){
				Collection items = cm.getClient(CLASSIFICATION_SCHEME).getPOJOCollection(CDECartItemImpl.class, oCart.getCartObjectCollection());
				List itemList = new ArrayList(items);
				Collections.sort(itemList,itemComparator);
				return itemList;
			} else 
				return new ArrayList();
		} catch (ObjectCartException oce) {
			oce.printStackTrace();
			throw new RuntimeException("getDataElements: Error restoring the POJO Collection", oce);
		}

	}	

	public void setDataElement(CDECartItem item) {
		CartObject co = this.getNativeObject(item.getId());
		if (co == null){
			try {
				oCart = cm.getClient(CLASSIFICATION_SCHEME).storePOJO(oCart, CDECartItem.class, item.getItem().getLongName(), item.getId(), item);
			} catch (ObjectCartException oce) {
				throw new RuntimeException("getDataElements: Error restoring the POJO Collection", oce);
			}
		}
	}

	public void setDataElements(Collection items) {
		Map<String, String> objectDisplayNames = new HashMap<String, String> ();
		Map<String, Object>  objects = new HashMap<String, Object>();

		for(Object o: items) {
			CDECartItem item = (CDECartItem) o;
			if(getNativeObject(item.getId()) == null){
				objectDisplayNames.put(item.getId(), item.getItem().getLongName());
				objects.put(item.getId(), item);
			}			
		}
		try {
			oCart = cm.getClient(CLASSIFICATION_SCHEME).storePOJOCollection(oCart, CDECartItemImpl.class, objectDisplayNames, objects);
		} catch (ObjectCartException oce) {
			throw new RuntimeException("getDataElements: Error restoring the POJO Collection", oce);
		}
	}
	
	public void mergeDataElements(Collection items) {
		Map<String, String> objectDisplayNames = new HashMap<String, String> ();
		Map<String, Object>  objects = new HashMap<String, Object>();
		HashSet<CartObject> forRemoval = new HashSet<CartObject>();
		
		for(Object o: items) {
			CDECartItem item = (CDECartItem) o;
			CartObject co = getNativeObject(item.getId());
			
			objectDisplayNames.put(item.getId(), item.getItem().getLongName());
			objects.put(item.getId(), item);
			
			if(co != null)
				forRemoval.add(co);
		}
		try {
			oCart = cm.getClient(CLASSIFICATION_SCHEME).removeObjectCollection(oCart, forRemoval);
			oCart = cm.getClient(CLASSIFICATION_SCHEME).storePOJOCollection(oCart, CDECartItemImpl.class, objectDisplayNames, objects);
		} catch (ObjectCartException oce) {
			throw new RuntimeException("getDataElements: Error restoring the POJO Collection", oce);
		}
	}

	public Collection getForms() {
		try {
			if (oCart.getCartObjectCollection() != null){
				return cm.getClient(CLASSIFICATION_SCHEME).getPOJOCollection(CDECartItemImpl.class, oCart.getCartObjectCollection());
			} else
				return new ArrayList();
			 
		} catch (ObjectCartException oce) {
			throw new RuntimeException("getForms: Error restoring the POJO Collection", oce);
		}
	}

	public void setForm(CDECartItem form) {
		try {
			if (getId(oCart, form.getId()) != null)
				oCart = cm.getClient(CLASSIFICATION_SCHEME).storePOJO(oCart, form.getClass(), form.getItem().getLongName(), form.getId(), form);
		} catch (ObjectCartException oce) {
			throw new RuntimeException("getForms: Error storing the POJO Collection", oce);
		}
	}

	public void setForms(Collection forms) {
		Map<String, String> objectDisplayNames = new HashMap<String, String> ();
		Map<String, Object>  objects = new HashMap<String, Object>();

		for(Object o: forms) {
			CDECartItem item = (CDECartItem) o;
			if(getNativeObject(item.getId())== null){
				objectDisplayNames.put(item.getId(), item.getItem().getLongName());
				objects.put(item.getId(), item);
			}
		}
		try {
			oCart = cm.getClient(CLASSIFICATION_SCHEME).storePOJOCollection(oCart, CDECartItemImpl.class, objectDisplayNames, objects);
		} catch (ObjectCartException oce) {
			throw new RuntimeException("getDataElements: Error restoring the POJO Collection", oce);
		}
	}

	public void mergeCart(CDECart cart) {		
		if(CaDSRConstants.CDE_CARTSCHEME.equalsIgnoreCase(CLASSIFICATION_SCHEME)){
			Collection deColl = cart.getDataElements();						
			mergeDataElements(deColl);
		}else {
			Collection formColl = cart.getForms();			
			setForms(formColl);
		}	    
	}
	
	public void removeDataElement(String itemId) {
		CartObject co = getNativeObject(itemId);
		if (co != null) {
			try {	
				oCart = cm.getClient(CLASSIFICATION_SCHEME).removeObject(oCart, co);			
			} catch (ObjectCartException oce) {
				throw new RuntimeException("removeDataElement: Error removing object with native ID:"+itemId, oce);
			}			
		}		
	}

	public void removeDataElements(Collection items) {
		List<CartObject> cList = getNativeObjects(items);
		if (!cList.isEmpty()) {
			try {	
				oCart = cm.getClient(CLASSIFICATION_SCHEME).removeObjectCollection(oCart, cList);
			} catch (ObjectCartException oce) {
				throw new RuntimeException("removeDataElements: Error removing collection of objects", oce);
			}	
		}
	}

	public CDECartItem findDataElement(String itemId) {
		CartObject item = getId(oCart, itemId);
		if ( item != null) {
			try {
				return (CDECartItem)cm.getClient(CLASSIFICATION_SCHEME).getPOJO(CDECartItemImpl.class, item);
			} catch (ObjectCartException oce) {
				throw new RuntimeException("findDataElement: Error finding objects with native Id:"+itemId, oce);
			}
		}

		return null; 
	}

	private CartObject getNativeObject(String id) {
		if (oCart.getCartObjectCollection() == null)
			return null;
		
		for(CartObject co: oCart.getCartObjectCollection()){
			if (co.getNativeId().equals(id))
				return co;
		}
		return null;
	}

	private List<CartObject> getNativeObjects(Collection ids) {
		List<CartObject> list = new ArrayList<CartObject>();
		if (oCart.getCartObjectCollection() == null)
			return list;
		for(CartObject co: oCart.getCartObjectCollection()){
			if (ids.contains(co.getNativeId()))
				list.add(co);
		}
		return list;
	}

	private CartObject getId(Cart cart, String id) {
		for(CartObject co: cart.getCartObjectCollection()){
			if (co.getNativeId().equals(id))
				return co;
		}
		return null;
	}

	public void associateCart(String userId) {	
		try {			
			 oCart = cm.getClient(CLASSIFICATION_SCHEME).associateCart(oCart, userId);
		} catch (ObjectCartException oce) {
			throw new RuntimeException("associateCart: Error associating cart ("+oCart.getUserId()+") with new User ID "+userId, oce);
		}		
	}

	public void expireCart(){
		try{
			oCart = cm.getClient(CLASSIFICATION_SCHEME).setDefaultExpiration(oCart);
		}catch(ObjectCartException oce){
			throw new RuntimeException("expireCart: Error in setting Cart for default Expiration("+oCart.getUserId()+")");
		}		
	}
	
	public void expireCart(Date expirationDate){
		try{
			oCart = cm.getClient(CLASSIFICATION_SCHEME).setCartExpiration(oCart, expirationDate);
		}catch(ObjectCartException oce){
			throw new RuntimeException("expireCart: Error in setting Cart Expiration by date("+oCart.getUserId()+")");
		}		
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the cartName
	 */
	public String getCartName() {
		return cartName;
	}

	/**
	 * @param cartName the cartName to set
	 */
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}	
	
}