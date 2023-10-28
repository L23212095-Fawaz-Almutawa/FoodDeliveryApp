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

public class FoodDeliveryAppSystemImpl implements FoodDeliveryAppSystem, Serializable {
	
	
	public static Map<String, List<String>> opINVRelatedEntity = new HashMap<String, List<String>>();
	
	
	ThirdPartyServices services;
			
	public FoodDeliveryAppSystemImpl() {
		services = new ThirdPartyServicesImpl();
	}

	public void refresh() {
		Agent agent_service = (Agent) ServiceManager
				.getAllInstancesOf("Agent").get(0);
		OrderRequestService orderrequestservice_service = (OrderRequestService) ServiceManager
				.getAllInstancesOf("OrderRequestService").get(0);
		TrackOrderProfilesService trackorderprofilesservice_service = (TrackOrderProfilesService) ServiceManager
				.getAllInstancesOf("TrackOrderProfilesService").get(0);
		UpdateMenuService updatemenuservice_service = (UpdateMenuService) ServiceManager
				.getAllInstancesOf("UpdateMenuService").get(0);
		PlaceOrderService placeorderservice_service = (PlaceOrderService) ServiceManager
				.getAllInstancesOf("PlaceOrderService").get(0);
	}			
	
	/* Generate buiness logic according to functional requirement */
	
	
	
	/* temp property for controller */
			
	/* all get and set functions for temp property*/
	
	/* invarints checking*/
	public final static ArrayList<String> allInvariantCheckingFunction = new ArrayList<String>(Arrays.asList());
			
}
