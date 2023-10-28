package services.impl;

import services.*;
import entities.*;
import java.util.List;
import java.util.LinkedList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.Arrays;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.SerializationUtils;
import java.util.Iterator;

public class UpdateMenuServiceImpl implements UpdateMenuService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public UpdateMenuServiceImpl() {
		services = new ThirdPartyServicesImpl();
	}

	
	//Shared variable from system services
	
	/* Shared variable from system services and get()/set() methods */
			
	/* all get and set functions for temp property*/
				
	
	
	/* Generate inject for sharing temp variables between use cases in system service */
	public void refresh() {
		FoodDeliveryAppSystem fooddeliveryappsystem_service = (FoodDeliveryAppSystem) ServiceManager.getAllInstancesOf("FoodDeliveryAppSystem").get(0);
	}
	
	/* Generate buiness logic according to functional requirement */
	@SuppressWarnings("unchecked")
	public boolean updateMenu(String menuDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get mu
		 mu = null;
		//no nested iterator --  iterator: any previous:any
		for ( m : (List<Menu>)EntityManager.getAllInstancesOf("Menu"))
		{
			if (m.getMenuID() == menuID)
			{
				mu = m;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			if ((StandardOPs.oclIsundefined(mu) == false))
			{
				this.setRestaurantID(true);
				this.setRestaurantOwnerID(true);
				
				refresh();
				// post-condition checking
				if (!(((StandardOPs.oclIsundefined(mu) == false) ? this.getRestaurantID() == true
				 && 
				this.getRestaurantOwnerID() == true
				 && 
				true : this.getRestaurantID() == false
				 && 
				true))) {
					throw new PostconditionException();
				}
				
				//return code
				refresh();
				return true;
			}
			else
			{
			 	this.setRestaurantID(false);
			 	
			 	refresh();
			 	// post-condition checking
			 	if (!(((StandardOPs.oclIsundefined(mu) == false) ? this.getRestaurantID() == true
			 	 && 
			 	this.getRestaurantOwnerID() == true
			 	 && 
			 	true : this.getRestaurantID() == false
			 	 && 
			 	true))) {
			 		throw new PostconditionException();
			 	}
			 	
			 	//return code
			 	refresh();
			 	return false;
			}
			
			
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [menuDetails] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("updateMenu", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean validateMenu(String menuDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getrestaurantID() == true && StandardOPs.oclIsundefined(this.getrestaurantOwnerID()) == false) 
		{ 
			/* Logic here */
			if (this.getnewPrice() == true)
			{
				
				refresh();
				// post-condition checking
				if (!((this.getNewPrice() == true ? true : true))) {
					throw new PostconditionException();
				}
				
				//return code
				refresh();
				return this.getnewPrice();
			}
			else
			{
			 	
			 	refresh();
			 	// post-condition checking
			 	if (!((this.getNewPrice() == true ? true : true))) {
			 		throw new PostconditionException();
			 	}
			 	
			 	//return code
			 	refresh();
			 	return 0;
			}
			
			
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [menuDetails] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("validateMenu", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean saveMenu(String menuDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getnewPrice() == true && StandardOPs.oclIsundefined(this.getnewPrice()) == false) 
		{ 
			/* Logic here */
			
			
			refresh();
			// post-condition checking
			if (!(true)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [menuDetails] 
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean notifyCustomers(String menuUpdateNotification) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getnewPrice() == true && this.getrestaurantID() == true && this.getrestaurantOwnerID() == true && this.getmenuID() == true) 
		{ 
			/* Logic here */
			this.setDescription(true);
			
			
			refresh();
			// post-condition checking
			if (!(this.getDescription() == true)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [menuUpdateNotification] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("notifyCustomers", Arrays.asList(""));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
