package services;

import entities.*;  
import java.util.List;
import java.time.LocalDate;


public interface UpdateMenuService {

	/* all system operations of the use case*/
	boolean updateMenu(String menuDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean validateMenu(String menuDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean saveMenu(String menuDetails) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	boolean notifyCustomers(String menuUpdateNotification) throws PreconditionException, PostconditionException, ThirdPartyServiceException;
	
	/* all get and set functions for temp property*/
	
	/* all get and set functions for temp property*/
	
	/* invariant checking function */
}
