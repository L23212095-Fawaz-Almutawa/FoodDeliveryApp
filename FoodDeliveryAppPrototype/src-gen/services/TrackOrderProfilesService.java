package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface TrackOrderProfilesService {

	/* all system operations of the use case*/
	boolean receiveCutomerRequest(String requestDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean processRequest(String requestDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean retrieveOrderInformation(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean updateOrderStatus(String orderID, String newStatus) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean provideCustomerResponse(String responseDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
