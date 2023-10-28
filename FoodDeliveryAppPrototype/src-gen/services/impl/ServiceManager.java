package services.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import services.*;
	
public class ServiceManager {
	
	private static Map<String, List> AllServiceInstance = new HashMap<String, List>();
	
	private static List<Agent> AgentInstances = new LinkedList<Agent>();
	private static List<ThirdPartyServices> ThirdPartyServicesInstances = new LinkedList<ThirdPartyServices>();
	private static List<OrderRequestService> OrderRequestServiceInstances = new LinkedList<OrderRequestService>();
	private static List<TrackOrderProfilesService> TrackOrderProfilesServiceInstances = new LinkedList<TrackOrderProfilesService>();
	private static List<UpdateMenuService> UpdateMenuServiceInstances = new LinkedList<UpdateMenuService>();
	private static List<PlaceOrderService> PlaceOrderServiceInstances = new LinkedList<PlaceOrderService>();
	private static List<FoodDeliveryAppSystem> FoodDeliveryAppSystemInstances = new LinkedList<FoodDeliveryAppSystem>();
	
	static {
		AllServiceInstance.put("Agent", AgentInstances);
		AllServiceInstance.put("ThirdPartyServices", ThirdPartyServicesInstances);
		AllServiceInstance.put("OrderRequestService", OrderRequestServiceInstances);
		AllServiceInstance.put("TrackOrderProfilesService", TrackOrderProfilesServiceInstances);
		AllServiceInstance.put("UpdateMenuService", UpdateMenuServiceInstances);
		AllServiceInstance.put("PlaceOrderService", PlaceOrderServiceInstances);
		AllServiceInstance.put("FoodDeliveryAppSystem", FoodDeliveryAppSystemInstances);
	} 
	
	public static List getAllInstancesOf(String ClassName) {
			 return AllServiceInstance.get(ClassName);
	}	
	
	public static Agent createAgent() {
		Agent s = new AgentImpl();
		AgentInstances.add(s);
		return s;
	}
	public static ThirdPartyServices createThirdPartyServices() {
		ThirdPartyServices s = new ThirdPartyServicesImpl();
		ThirdPartyServicesInstances.add(s);
		return s;
	}
	public static OrderRequestService createOrderRequestService() {
		OrderRequestService s = new OrderRequestServiceImpl();
		OrderRequestServiceInstances.add(s);
		return s;
	}
	public static TrackOrderProfilesService createTrackOrderProfilesService() {
		TrackOrderProfilesService s = new TrackOrderProfilesServiceImpl();
		TrackOrderProfilesServiceInstances.add(s);
		return s;
	}
	public static UpdateMenuService createUpdateMenuService() {
		UpdateMenuService s = new UpdateMenuServiceImpl();
		UpdateMenuServiceInstances.add(s);
		return s;
	}
	public static PlaceOrderService createPlaceOrderService() {
		PlaceOrderService s = new PlaceOrderServiceImpl();
		PlaceOrderServiceInstances.add(s);
		return s;
	}
	public static FoodDeliveryAppSystem createFoodDeliveryAppSystem() {
		FoodDeliveryAppSystem s = new FoodDeliveryAppSystemImpl();
		FoodDeliveryAppSystemInstances.add(s);
		return s;
	}
}	
