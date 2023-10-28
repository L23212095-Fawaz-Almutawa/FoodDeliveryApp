package entities;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.lang.reflect.Method;
import java.util.Map;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.File;

public class EntityManager {

	private static Map<String, List> AllInstance = new HashMap<String, List>();
	
	private static List<Customer> CustomerInstances = new LinkedList<Customer>();
	private static List<DeliveryDriver> DeliveryDriverInstances = new LinkedList<DeliveryDriver>();
	private static List<RestaurantOwner> RestaurantOwnerInstances = new LinkedList<RestaurantOwner>();
	private static List<CustomerServiceAgent> CustomerServiceAgentInstances = new LinkedList<CustomerServiceAgent>();
	private static List<CashPayment> CashPaymentInstances = new LinkedList<CashPayment>();
	private static List<CardPayment> CardPaymentInstances = new LinkedList<CardPayment>();
	private static List<Payment> PaymentInstances = new LinkedList<Payment>();
	private static List<Cart> CartInstances = new LinkedList<Cart>();
	private static List<Review> ReviewInstances = new LinkedList<Review>();
	private static List<Order> OrderInstances = new LinkedList<Order>();
	private static List<Delivery> DeliveryInstances = new LinkedList<Delivery>();
	private static List<Restaurant> RestaurantInstances = new LinkedList<Restaurant>();
	private static List<Category> CategoryInstances = new LinkedList<Category>();
	private static List<UpdateMenu> UpdateMenuInstances = new LinkedList<UpdateMenu>();
	private static List<Contact> ContactInstances = new LinkedList<Contact>();
	private static List<Guest> GuestInstances = new LinkedList<Guest>();
	private static List<Login> LoginInstances = new LinkedList<Login>();
	private static List<Item> ItemInstances = new LinkedList<Item>();
	private static List<Menu> MenuInstances = new LinkedList<Menu>();
	private static List<TrackOrder> TrackOrderInstances = new LinkedList<TrackOrder>();

	
	/* Put instances list into Map */
	static {
		AllInstance.put("Customer", CustomerInstances);
		AllInstance.put("DeliveryDriver", DeliveryDriverInstances);
		AllInstance.put("RestaurantOwner", RestaurantOwnerInstances);
		AllInstance.put("CustomerServiceAgent", CustomerServiceAgentInstances);
		AllInstance.put("CashPayment", CashPaymentInstances);
		AllInstance.put("CardPayment", CardPaymentInstances);
		AllInstance.put("Payment", PaymentInstances);
		AllInstance.put("Cart", CartInstances);
		AllInstance.put("Review", ReviewInstances);
		AllInstance.put("Order", OrderInstances);
		AllInstance.put("Delivery", DeliveryInstances);
		AllInstance.put("Restaurant", RestaurantInstances);
		AllInstance.put("Category", CategoryInstances);
		AllInstance.put("UpdateMenu", UpdateMenuInstances);
		AllInstance.put("Contact", ContactInstances);
		AllInstance.put("Guest", GuestInstances);
		AllInstance.put("Login", LoginInstances);
		AllInstance.put("Item", ItemInstances);
		AllInstance.put("Menu", MenuInstances);
		AllInstance.put("TrackOrder", TrackOrderInstances);
	} 
		
	/* Save State */
	public static void save(File file) {
		
		try {
			
			ObjectOutputStream stateSave = new ObjectOutputStream(new FileOutputStream(file));
			
			stateSave.writeObject(CustomerInstances);
			stateSave.writeObject(DeliveryDriverInstances);
			stateSave.writeObject(RestaurantOwnerInstances);
			stateSave.writeObject(CustomerServiceAgentInstances);
			stateSave.writeObject(CashPaymentInstances);
			stateSave.writeObject(CardPaymentInstances);
			stateSave.writeObject(PaymentInstances);
			stateSave.writeObject(CartInstances);
			stateSave.writeObject(ReviewInstances);
			stateSave.writeObject(OrderInstances);
			stateSave.writeObject(DeliveryInstances);
			stateSave.writeObject(RestaurantInstances);
			stateSave.writeObject(CategoryInstances);
			stateSave.writeObject(UpdateMenuInstances);
			stateSave.writeObject(ContactInstances);
			stateSave.writeObject(GuestInstances);
			stateSave.writeObject(LoginInstances);
			stateSave.writeObject(ItemInstances);
			stateSave.writeObject(MenuInstances);
			stateSave.writeObject(TrackOrderInstances);
			
			stateSave.close();
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* Load State */
	public static void load(File file) {
		
		try {
			
			ObjectInputStream stateLoad = new ObjectInputStream(new FileInputStream(file));
			
			try {
				
				CustomerInstances =  (List<Customer>) stateLoad.readObject();
				AllInstance.put("Customer", CustomerInstances);
				DeliveryDriverInstances =  (List<DeliveryDriver>) stateLoad.readObject();
				AllInstance.put("DeliveryDriver", DeliveryDriverInstances);
				RestaurantOwnerInstances =  (List<RestaurantOwner>) stateLoad.readObject();
				AllInstance.put("RestaurantOwner", RestaurantOwnerInstances);
				CustomerServiceAgentInstances =  (List<CustomerServiceAgent>) stateLoad.readObject();
				AllInstance.put("CustomerServiceAgent", CustomerServiceAgentInstances);
				CashPaymentInstances =  (List<CashPayment>) stateLoad.readObject();
				AllInstance.put("CashPayment", CashPaymentInstances);
				CardPaymentInstances =  (List<CardPayment>) stateLoad.readObject();
				AllInstance.put("CardPayment", CardPaymentInstances);
				PaymentInstances =  (List<Payment>) stateLoad.readObject();
				AllInstance.put("Payment", PaymentInstances);
				CartInstances =  (List<Cart>) stateLoad.readObject();
				AllInstance.put("Cart", CartInstances);
				ReviewInstances =  (List<Review>) stateLoad.readObject();
				AllInstance.put("Review", ReviewInstances);
				OrderInstances =  (List<Order>) stateLoad.readObject();
				AllInstance.put("Order", OrderInstances);
				DeliveryInstances =  (List<Delivery>) stateLoad.readObject();
				AllInstance.put("Delivery", DeliveryInstances);
				RestaurantInstances =  (List<Restaurant>) stateLoad.readObject();
				AllInstance.put("Restaurant", RestaurantInstances);
				CategoryInstances =  (List<Category>) stateLoad.readObject();
				AllInstance.put("Category", CategoryInstances);
				UpdateMenuInstances =  (List<UpdateMenu>) stateLoad.readObject();
				AllInstance.put("UpdateMenu", UpdateMenuInstances);
				ContactInstances =  (List<Contact>) stateLoad.readObject();
				AllInstance.put("Contact", ContactInstances);
				GuestInstances =  (List<Guest>) stateLoad.readObject();
				AllInstance.put("Guest", GuestInstances);
				LoginInstances =  (List<Login>) stateLoad.readObject();
				AllInstance.put("Login", LoginInstances);
				ItemInstances =  (List<Item>) stateLoad.readObject();
				AllInstance.put("Item", ItemInstances);
				MenuInstances =  (List<Menu>) stateLoad.readObject();
				AllInstance.put("Menu", MenuInstances);
				TrackOrderInstances =  (List<TrackOrder>) stateLoad.readObject();
				AllInstance.put("TrackOrder", TrackOrderInstances);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	/* create object */  
	public static Object createObject(String Classifer) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method createObjectMethod = c.getDeclaredMethod("create" + Classifer + "Object");
			return createObjectMethod.invoke(c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/* add object */  
	public static Object addObject(String Classifer, Object ob) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method addObjectMethod = c.getDeclaredMethod("add" + Classifer + "Object", Class.forName("entities." + Classifer));
			return  (boolean) addObjectMethod.invoke(c, ob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}	
	
	/* add objects */  
	public static Object addObjects(String Classifer, List obs) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method addObjectsMethod = c.getDeclaredMethod("add" + Classifer + "Objects", Class.forName("java.util.List"));
			return  (boolean) addObjectsMethod.invoke(c, obs);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	/* Release object */
	public static boolean deleteObject(String Classifer, Object ob) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method deleteObjectMethod = c.getDeclaredMethod("delete" + Classifer + "Object", Class.forName("entities." + Classifer));
			return  (boolean) deleteObjectMethod.invoke(c, ob);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	/* Release objects */
	public static boolean deleteObjects(String Classifer, List obs) {
		try
		{
			Class c = Class.forName("entities.EntityManager");
			Method deleteObjectMethod = c.getDeclaredMethod("delete" + Classifer + "Objects", Class.forName("java.util.List"));
			return  (boolean) deleteObjectMethod.invoke(c, obs);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}		 	
	
	 /* Get all objects belongs to same class */
	public static List getAllInstancesOf(String ClassName) {
			 return AllInstance.get(ClassName);
	}	

   /* Sub-create object */
	public static Customer createCustomerObject() {
		Customer o = new Customer();
		return o;
	}
	
	public static boolean addCustomerObject(Customer o) {
		return CustomerInstances.add(o);
	}
	
	public static boolean addCustomerObjects(List<Customer> os) {
		return CustomerInstances.addAll(os);
	}
	
	public static boolean deleteCustomerObject(Customer o) {
		return CustomerInstances.remove(o);
	}
	
	public static boolean deleteCustomerObjects(List<Customer> os) {
		return CustomerInstances.removeAll(os);
	}
	public static DeliveryDriver createDeliveryDriverObject() {
		DeliveryDriver o = new DeliveryDriver();
		return o;
	}
	
	public static boolean addDeliveryDriverObject(DeliveryDriver o) {
		return DeliveryDriverInstances.add(o);
	}
	
	public static boolean addDeliveryDriverObjects(List<DeliveryDriver> os) {
		return DeliveryDriverInstances.addAll(os);
	}
	
	public static boolean deleteDeliveryDriverObject(DeliveryDriver o) {
		return DeliveryDriverInstances.remove(o);
	}
	
	public static boolean deleteDeliveryDriverObjects(List<DeliveryDriver> os) {
		return DeliveryDriverInstances.removeAll(os);
	}
	public static RestaurantOwner createRestaurantOwnerObject() {
		RestaurantOwner o = new RestaurantOwner();
		return o;
	}
	
	public static boolean addRestaurantOwnerObject(RestaurantOwner o) {
		return RestaurantOwnerInstances.add(o);
	}
	
	public static boolean addRestaurantOwnerObjects(List<RestaurantOwner> os) {
		return RestaurantOwnerInstances.addAll(os);
	}
	
	public static boolean deleteRestaurantOwnerObject(RestaurantOwner o) {
		return RestaurantOwnerInstances.remove(o);
	}
	
	public static boolean deleteRestaurantOwnerObjects(List<RestaurantOwner> os) {
		return RestaurantOwnerInstances.removeAll(os);
	}
	public static CustomerServiceAgent createCustomerServiceAgentObject() {
		CustomerServiceAgent o = new CustomerServiceAgent();
		return o;
	}
	
	public static boolean addCustomerServiceAgentObject(CustomerServiceAgent o) {
		return CustomerServiceAgentInstances.add(o);
	}
	
	public static boolean addCustomerServiceAgentObjects(List<CustomerServiceAgent> os) {
		return CustomerServiceAgentInstances.addAll(os);
	}
	
	public static boolean deleteCustomerServiceAgentObject(CustomerServiceAgent o) {
		return CustomerServiceAgentInstances.remove(o);
	}
	
	public static boolean deleteCustomerServiceAgentObjects(List<CustomerServiceAgent> os) {
		return CustomerServiceAgentInstances.removeAll(os);
	}
	public static CashPayment createCashPaymentObject() {
		CashPayment o = new CashPayment();
		return o;
	}
	
	public static boolean addCashPaymentObject(CashPayment o) {
		return CashPaymentInstances.add(o);
	}
	
	public static boolean addCashPaymentObjects(List<CashPayment> os) {
		return CashPaymentInstances.addAll(os);
	}
	
	public static boolean deleteCashPaymentObject(CashPayment o) {
		return CashPaymentInstances.remove(o);
	}
	
	public static boolean deleteCashPaymentObjects(List<CashPayment> os) {
		return CashPaymentInstances.removeAll(os);
	}
	public static CardPayment createCardPaymentObject() {
		CardPayment o = new CardPayment();
		return o;
	}
	
	public static boolean addCardPaymentObject(CardPayment o) {
		return CardPaymentInstances.add(o);
	}
	
	public static boolean addCardPaymentObjects(List<CardPayment> os) {
		return CardPaymentInstances.addAll(os);
	}
	
	public static boolean deleteCardPaymentObject(CardPayment o) {
		return CardPaymentInstances.remove(o);
	}
	
	public static boolean deleteCardPaymentObjects(List<CardPayment> os) {
		return CardPaymentInstances.removeAll(os);
	}
	public static Payment createPaymentObject() {
		Payment o = new Payment();
		return o;
	}
	
	public static boolean addPaymentObject(Payment o) {
		return PaymentInstances.add(o);
	}
	
	public static boolean addPaymentObjects(List<Payment> os) {
		return PaymentInstances.addAll(os);
	}
	
	public static boolean deletePaymentObject(Payment o) {
		return PaymentInstances.remove(o);
	}
	
	public static boolean deletePaymentObjects(List<Payment> os) {
		return PaymentInstances.removeAll(os);
	}
	public static Cart createCartObject() {
		Cart o = new Cart();
		return o;
	}
	
	public static boolean addCartObject(Cart o) {
		return CartInstances.add(o);
	}
	
	public static boolean addCartObjects(List<Cart> os) {
		return CartInstances.addAll(os);
	}
	
	public static boolean deleteCartObject(Cart o) {
		return CartInstances.remove(o);
	}
	
	public static boolean deleteCartObjects(List<Cart> os) {
		return CartInstances.removeAll(os);
	}
	public static Review createReviewObject() {
		Review o = new Review();
		return o;
	}
	
	public static boolean addReviewObject(Review o) {
		return ReviewInstances.add(o);
	}
	
	public static boolean addReviewObjects(List<Review> os) {
		return ReviewInstances.addAll(os);
	}
	
	public static boolean deleteReviewObject(Review o) {
		return ReviewInstances.remove(o);
	}
	
	public static boolean deleteReviewObjects(List<Review> os) {
		return ReviewInstances.removeAll(os);
	}
	public static Order createOrderObject() {
		Order o = new Order();
		return o;
	}
	
	public static boolean addOrderObject(Order o) {
		return OrderInstances.add(o);
	}
	
	public static boolean addOrderObjects(List<Order> os) {
		return OrderInstances.addAll(os);
	}
	
	public static boolean deleteOrderObject(Order o) {
		return OrderInstances.remove(o);
	}
	
	public static boolean deleteOrderObjects(List<Order> os) {
		return OrderInstances.removeAll(os);
	}
	public static Delivery createDeliveryObject() {
		Delivery o = new Delivery();
		return o;
	}
	
	public static boolean addDeliveryObject(Delivery o) {
		return DeliveryInstances.add(o);
	}
	
	public static boolean addDeliveryObjects(List<Delivery> os) {
		return DeliveryInstances.addAll(os);
	}
	
	public static boolean deleteDeliveryObject(Delivery o) {
		return DeliveryInstances.remove(o);
	}
	
	public static boolean deleteDeliveryObjects(List<Delivery> os) {
		return DeliveryInstances.removeAll(os);
	}
	public static Restaurant createRestaurantObject() {
		Restaurant o = new Restaurant();
		return o;
	}
	
	public static boolean addRestaurantObject(Restaurant o) {
		return RestaurantInstances.add(o);
	}
	
	public static boolean addRestaurantObjects(List<Restaurant> os) {
		return RestaurantInstances.addAll(os);
	}
	
	public static boolean deleteRestaurantObject(Restaurant o) {
		return RestaurantInstances.remove(o);
	}
	
	public static boolean deleteRestaurantObjects(List<Restaurant> os) {
		return RestaurantInstances.removeAll(os);
	}
	public static Category createCategoryObject() {
		Category o = new Category();
		return o;
	}
	
	public static boolean addCategoryObject(Category o) {
		return CategoryInstances.add(o);
	}
	
	public static boolean addCategoryObjects(List<Category> os) {
		return CategoryInstances.addAll(os);
	}
	
	public static boolean deleteCategoryObject(Category o) {
		return CategoryInstances.remove(o);
	}
	
	public static boolean deleteCategoryObjects(List<Category> os) {
		return CategoryInstances.removeAll(os);
	}
	public static UpdateMenu createUpdateMenuObject() {
		UpdateMenu o = new UpdateMenu();
		return o;
	}
	
	public static boolean addUpdateMenuObject(UpdateMenu o) {
		return UpdateMenuInstances.add(o);
	}
	
	public static boolean addUpdateMenuObjects(List<UpdateMenu> os) {
		return UpdateMenuInstances.addAll(os);
	}
	
	public static boolean deleteUpdateMenuObject(UpdateMenu o) {
		return UpdateMenuInstances.remove(o);
	}
	
	public static boolean deleteUpdateMenuObjects(List<UpdateMenu> os) {
		return UpdateMenuInstances.removeAll(os);
	}
	public static Contact createContactObject() {
		Contact o = new Contact();
		return o;
	}
	
	public static boolean addContactObject(Contact o) {
		return ContactInstances.add(o);
	}
	
	public static boolean addContactObjects(List<Contact> os) {
		return ContactInstances.addAll(os);
	}
	
	public static boolean deleteContactObject(Contact o) {
		return ContactInstances.remove(o);
	}
	
	public static boolean deleteContactObjects(List<Contact> os) {
		return ContactInstances.removeAll(os);
	}
	public static Guest createGuestObject() {
		Guest o = new Guest();
		return o;
	}
	
	public static boolean addGuestObject(Guest o) {
		return GuestInstances.add(o);
	}
	
	public static boolean addGuestObjects(List<Guest> os) {
		return GuestInstances.addAll(os);
	}
	
	public static boolean deleteGuestObject(Guest o) {
		return GuestInstances.remove(o);
	}
	
	public static boolean deleteGuestObjects(List<Guest> os) {
		return GuestInstances.removeAll(os);
	}
	public static Login createLoginObject() {
		Login o = new Login();
		return o;
	}
	
	public static boolean addLoginObject(Login o) {
		return LoginInstances.add(o);
	}
	
	public static boolean addLoginObjects(List<Login> os) {
		return LoginInstances.addAll(os);
	}
	
	public static boolean deleteLoginObject(Login o) {
		return LoginInstances.remove(o);
	}
	
	public static boolean deleteLoginObjects(List<Login> os) {
		return LoginInstances.removeAll(os);
	}
	public static Item createItemObject() {
		Item o = new Item();
		return o;
	}
	
	public static boolean addItemObject(Item o) {
		return ItemInstances.add(o);
	}
	
	public static boolean addItemObjects(List<Item> os) {
		return ItemInstances.addAll(os);
	}
	
	public static boolean deleteItemObject(Item o) {
		return ItemInstances.remove(o);
	}
	
	public static boolean deleteItemObjects(List<Item> os) {
		return ItemInstances.removeAll(os);
	}
	public static Menu createMenuObject() {
		Menu o = new Menu();
		return o;
	}
	
	public static boolean addMenuObject(Menu o) {
		return MenuInstances.add(o);
	}
	
	public static boolean addMenuObjects(List<Menu> os) {
		return MenuInstances.addAll(os);
	}
	
	public static boolean deleteMenuObject(Menu o) {
		return MenuInstances.remove(o);
	}
	
	public static boolean deleteMenuObjects(List<Menu> os) {
		return MenuInstances.removeAll(os);
	}
	public static TrackOrder createTrackOrderObject() {
		TrackOrder o = new TrackOrder();
		return o;
	}
	
	public static boolean addTrackOrderObject(TrackOrder o) {
		return TrackOrderInstances.add(o);
	}
	
	public static boolean addTrackOrderObjects(List<TrackOrder> os) {
		return TrackOrderInstances.addAll(os);
	}
	
	public static boolean deleteTrackOrderObject(TrackOrder o) {
		return TrackOrderInstances.remove(o);
	}
	
	public static boolean deleteTrackOrderObjects(List<TrackOrder> os) {
		return TrackOrderInstances.removeAll(os);
	}
  
}

