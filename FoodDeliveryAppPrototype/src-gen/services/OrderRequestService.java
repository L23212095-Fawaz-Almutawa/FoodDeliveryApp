package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface OrderRequestService {

	/* all system operations of the use case*/
	boolean acceptOrder(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean getDeliveryDetails(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean navigate(String destination) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean updateDeliveryStatus(String orderID, String status) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean updateLocation(String location) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean contactCustomer(String phoneNumber) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
