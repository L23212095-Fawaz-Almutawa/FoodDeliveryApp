package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class TrackOrder implements Serializable {
	
	/* all primary attributes */
	private int OrderID;
	private String DeliveryAddress;
	private int DeliveryDriverID;
	private String CustomerID;
	private String RestaurantID;
	private String OrderNumber;
	private String OrderDescription;
	
	/* all references */
	private Order TackOrdertoOrder; 
	
	/* all get and set functions */
	public int getOrderID() {
		return OrderID;
	}	
	
	public void setOrderID(int orderid) {
		this.OrderID = orderid;
	}
	public String getDeliveryAddress() {
		return DeliveryAddress;
	}	
	
	public void setDeliveryAddress(String deliveryaddress) {
		this.DeliveryAddress = deliveryaddress;
	}
	public int getDeliveryDriverID() {
		return DeliveryDriverID;
	}	
	
	public void setDeliveryDriverID(int deliverydriverid) {
		this.DeliveryDriverID = deliverydriverid;
	}
	public String getCustomerID() {
		return CustomerID;
	}	
	
	public void setCustomerID(String customerid) {
		this.CustomerID = customerid;
	}
	public String getRestaurantID() {
		return RestaurantID;
	}	
	
	public void setRestaurantID(String restaurantid) {
		this.RestaurantID = restaurantid;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}	
	
	public void setOrderNumber(String ordernumber) {
		this.OrderNumber = ordernumber;
	}
	public String getOrderDescription() {
		return OrderDescription;
	}	
	
	public void setOrderDescription(String orderdescription) {
		this.OrderDescription = orderdescription;
	}
	
	/* all functions for reference*/
	public Order getTackOrdertoOrder() {
		return TackOrdertoOrder;
	}	
	
	public void setTackOrdertoOrder(Order order) {
		this.TackOrdertoOrder = order;
	}			
	


}
