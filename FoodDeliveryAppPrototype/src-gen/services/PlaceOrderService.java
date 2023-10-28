package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface PlaceOrderService {

	/* all system operations of the use case*/
	boolean selectRestaurant(String restaurantID) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean browseMenu(String restaurantID) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean addItemsToCart(String item, String quantity) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean reviewCart() throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean proceedToCheckout() throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean selectPaymentMethod(String paymentMethod) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean providePaymentDetails(String paymentDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean placeOrder(String orderDetails, String paymentDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean confirmOrder(String orderID) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
