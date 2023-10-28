package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Order implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private LocalDate OrderDate;
	private String OrderDescription;
	private String Status;
	private int CustomerID;
	private String OrderNumber;
	
	/* all references */
	private Customer OrdertoCustomer; 
	private Restaurant OrdertoRestaurant; 
	private TrackOrder OrdertoTackOrder; 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public LocalDate getOrderDate() {
		return OrderDate;
	}	
	
	public void setOrderDate(LocalDate orderdate) {
		this.OrderDate = orderdate;
	}
	public String getOrderDescription() {
		return OrderDescription;
	}	
	
	public void setOrderDescription(String orderdescription) {
		this.OrderDescription = orderdescription;
	}
	public String getStatus() {
		return Status;
	}	
	
	public void setStatus(String status) {
		this.Status = status;
	}
	public int getCustomerID() {
		return CustomerID;
	}	
	
	public void setCustomerID(int customerid) {
		this.CustomerID = customerid;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}	
	
	public void setOrderNumber(String ordernumber) {
		this.OrderNumber = ordernumber;
	}
	
	/* all functions for reference*/
	public Customer getOrdertoCustomer() {
		return OrdertoCustomer;
	}	
	
	public void setOrdertoCustomer(Customer customer) {
		this.OrdertoCustomer = customer;
	}			
	public Restaurant getOrdertoRestaurant() {
		return OrdertoRestaurant;
	}	
	
	public void setOrdertoRestaurant(Restaurant restaurant) {
		this.OrdertoRestaurant = restaurant;
	}			
	public TrackOrder getOrdertoTackOrder() {
		return OrdertoTackOrder;
	}	
	
	public void setOrdertoTackOrder(TrackOrder trackorder) {
		this.OrdertoTackOrder = trackorder;
	}			
	


}
