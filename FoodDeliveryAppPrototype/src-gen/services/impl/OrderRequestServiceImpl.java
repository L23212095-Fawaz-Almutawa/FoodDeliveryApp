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

public class OrderRequestServiceImpl implements OrderRequestService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public OrderRequestServiceImpl() {
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
	public boolean acceptOrder(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get orre
		 orre = null;
		//no nested iterator --  iterator: any previous:any
		for ( re : (List<Delivery>)EntityManager.getAllInstancesOf("Delivery"))
		{
			if (re.getorderID())
			{
				orre = re;
				break;
			}
				
			
		}
		/* previous state in post-condition*/
 
		/* check precondition */
		if (true) 
		{ 
			/* Logic here */
			if ((StandardOPs.oclIsundefined(orre) == false))
			{
				this.setID(true);
				this.setOrderID(orderID);
				
				refresh();
				// post-condition checking
				if (!(((StandardOPs.oclIsundefined(orre) == false) ? this.getID() == true
				 && 
				this.getOrderID() == orderID
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
			 	if (!(((StandardOPs.oclIsundefined(orre) == false) ? this.getID() == true
			 	 && 
			 	this.getOrderID() == orderID
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
		//string parameters: [orderID] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("acceptOrder", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean getDeliveryDetails(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getID() == true && StandardOPs.oclIsundefined(this.getorderID()) == false) 
		{ 
			/* Logic here */
			this.setAddress(true);
			
			
			refresh();
			// post-condition checking
			if (!(this.getAddress() == true)) {
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
	
	static {opINVRelatedEntity.put("getDeliveryDetails", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean navigate(String destination) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getaddress() == true) 
		{ 
			/* Logic here */
			this.setAddress(destination);
			
			
			refresh();
			// post-condition checking
			if (!(this.getAddress() == destination)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [destination] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("navigate", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean updateDeliveryStatus(String orderID, String status) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(this.getaddress()) == false && this.getorderID() == true) 
		{ 
			/* Logic here */
			this.setStatus(true);
			this.setStatus(status);
			
			
			refresh();
			// post-condition checking
			if (!(this.getStatus() == true
			 && 
			this.getStatus() == status)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [orderID, status] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("updateDeliveryStatus", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean updateLocation(String location) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(this.getstatus()) == false && this.getstatus() == true) 
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
		//string parameters: [location] 
	}  
	
	 
	@SuppressWarnings("unchecked")
	public boolean contactCustomer(String phoneNumber) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
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
		//string parameters: [phoneNumber] 
	}  
	
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
