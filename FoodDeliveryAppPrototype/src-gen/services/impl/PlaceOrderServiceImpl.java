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

public class PlaceOrderServiceImpl implements PlaceOrderService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public PlaceOrderServiceImpl() {
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
	public boolean selectRestaurant(String restaurantID) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get po
		 po = null;
		//no nested iterator --  iterator: any previous:any
		for ( o : (List<Order>)EntityManager.getAllInstancesOf("Order"))
		{
			if (o.getrestaurantID())
			{
				po = o;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			if ((StandardOPs.oclIsundefined(po) == false))
			{
				this.setID(true);
				
				refresh();
				// post-condition checking
				if (!(((StandardOPs.oclIsundefined(po) == false) ? this.getID() == true
				 && 
				true : this.getID() == false
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
			 	this.setID(false);
			 	
			 	refresh();
			 	// post-condition checking
			 	if (!(((StandardOPs.oclIsundefined(po) == false) ? this.getID() == true
			 	 && 
			 	true : this.getID() == false
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
		//string parameters: [restaurantID] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("selectRestaurant", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean browseMenu(String restaurantID) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(this.getrestaurant()) == false && this.getID() == true) 
		{ 
			/* Logic here */
			this.setItem(true);
			this.setQuantity(true);
			
			
			refresh();
			// post-condition checking
			if (!(this.getItem() == true
			 && 
			this.getQuantity() == true)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [restaurantID] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("browseMenu", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean addItemsToCart(String item, String quantity) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getitem() == true && this.getquantity() == true) 
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
		//string parameters: [item, quantity] 
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean reviewCart() throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			this.setOrderNumber(true);
			
			
			refresh();
			// post-condition checking
			if (!(this.getOrderNumber() == true)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("reviewCart", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean proceedToCheckout() throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
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
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean selectPaymentMethod(String paymentMethod) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getOrderNumber() == true) 
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
		//string parameters: [paymentMethod] 
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean providePaymentDetails(String paymentDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			this.setOrderNumber(paymentDetails);
			
			
			refresh();
			// post-condition checking
			if (!(this.getOrderNumber() == paymentDetails)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [paymentDetails] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("providePaymentDetails", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean placeOrder(String orderDetails, String paymentDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
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
		//string parameters: [orderDetails, paymentDetails] 
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean confirmOrder(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			this.setID(orderID);
			
			
			refresh();
			// post-condition checking
			if (!(this.getID() == orderID)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [orderID] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("confirmOrder", Arrays.asList(""));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
