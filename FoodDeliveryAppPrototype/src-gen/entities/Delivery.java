package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Delivery implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private int CustomerID;
	private String Address;
	private String Description;
	private int DeliveryDriverID;
	
	/* all references */
	private DeliveryDriver DeliverytoDeliveryDriver; 
	private Customer DeliverytoCustomer; 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public int getCustomerID() {
		return CustomerID;
	}	
	
	public void setCustomerID(int customerid) {
		this.CustomerID = customerid;
	}
	public String getAddress() {
		return Address;
	}	
	
	public void setAddress(String address) {
		this.Address = address;
	}
	public String getDescription() {
		return Description;
	}	
	
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getDeliveryDriverID() {
		return DeliveryDriverID;
	}	
	
	public void setDeliveryDriverID(int deliverydriverid) {
		this.DeliveryDriverID = deliverydriverid;
	}
	
	/* all functions for reference*/
	public DeliveryDriver getDeliverytoDeliveryDriver() {
		return DeliverytoDeliveryDriver;
	}	
	
	public void setDeliverytoDeliveryDriver(DeliveryDriver deliverydriver) {
		this.DeliverytoDeliveryDriver = deliverydriver;
	}			
	public Customer getDeliverytoCustomer() {
		return DeliverytoCustomer;
	}	
	
	public void setDeliverytoCustomer(Customer customer) {
		this.DeliverytoCustomer = customer;
	}			
	


}
