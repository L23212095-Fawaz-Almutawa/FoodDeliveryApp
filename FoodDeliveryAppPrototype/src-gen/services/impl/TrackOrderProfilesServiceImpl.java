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

public class TrackOrderProfilesServiceImpl implements TrackOrderProfilesService, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public TrackOrderProfilesServiceImpl() {
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
	public boolean receiveCutomerRequest(String requestDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* Code generated for contract definition */
		//Get to
		 to = null;
		//no nested iterator --  iterator: any previous:any
		for ( t : (List<TrackOrder>)EntityManager.getAllInstancesOf("TrackOrder"))
		{
			if (t.getOrderID() == orderID)
			{
				to = t;
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
				this.setRequestDetails(requestDetails);
				
				refresh();
				// post-condition checking
				if (!(((StandardOPs.oclIsundefined(mu) == false) ? this.getRequestDetails() == requestDetails
				 && 
				true : true))) {
					throw new PostconditionException();
				}
				
				//return code
				refresh();
				return true;
			}
			else
			{
			 	
			 	refresh();
			 	// post-condition checking
			 	if (!(((StandardOPs.oclIsundefined(mu) == false) ? this.getRequestDetails() == requestDetails
			 	 && 
			 	true : true))) {
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
		//string parameters: [requestDetails] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("receiveCutomerRequest", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean processRequest(String requestDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if ((this.getrequestDetails().equals(requestDetails) && StandardOPs.oclIsundefined(this.getrequestDetails()) == false ? return == true : true)) 
		{ 
			/* Logic here */
			this.setOrderID(true);
			
			
			refresh();
			// post-condition checking
			if (!(this.getOrderID() == true)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [requestDetails] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("processRequest", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean retrieveOrderInformation(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if ((this.getOrderID() == true && StandardOPs.oclIsundefined(this.getOrderID()) == false ? return == true : true)) 
		{ 
			/* Logic here */
			this.setNewStatus(true);
			
			
			refresh();
			// post-condition checking
			if (!(this.getNewStatus() == true)) {
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
	
	static {opINVRelatedEntity.put("retrieveOrderInformation", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean updateOrderStatus(String orderID, String newStatus) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (this.getOrderID() == true) 
		{ 
			/* Logic here */
			StandardOPs.oclIsundefined(this.setnewStatus) = false;
			this.setNewStatus(true);
			
			
			refresh();
			// post-condition checking
			if (!(StandardOPs.oclIsundefined(this.getnewStatus()) == false
			 && 
			this.getNewStatus() == true)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [orderID, newStatus] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("updateOrderStatus", Arrays.asList(""));}
	 
	@SuppressWarnings("unchecked")
	public boolean provideCustomerResponse(String responseDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException {
		
		
		/* previous state in post-condition*/
 
		/* check precondition */
		if (StandardOPs.oclIsundefined(this.getnewStatus()) == false && this.getnewStatus() == true) 
		{ 
			/* Logic here */
			this.setOrderDescription(responseDetails);
			
			
			refresh();
			// post-condition checking
			if (!(this.getOrderDescription() == responseDetails)) {
				throw new PostconditionException();
			}
			
		
		}
		else
		{
			throw new PreconditionException();
		}
		//string parameters: [responseDetails] 
		//all relevant vars : this
		//all relevant entities : 
	}  
	
	static {opINVRelatedEntity.put("provideCustomerResponse", Arrays.asList(""));}
	 
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
