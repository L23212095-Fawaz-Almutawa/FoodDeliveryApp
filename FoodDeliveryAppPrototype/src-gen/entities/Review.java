package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Review implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private int CustomerID;
	private int RestaurantID;
	private int DeliveryDriverID;
	private int Rating;
	private String Comment;
	
	/* all references */
	private Customer ReviewtoCustomer; 
	private Restaurant ReviewtoRestaurant; 
	private DeliveryDriver ReviewtoDeliveryDriver; 
	
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
	public int getRestaurantID() {
		return RestaurantID;
	}	
	
	public void setRestaurantID(int restaurantid) {
		this.RestaurantID = restaurantid;
	}
	public int getDeliveryDriverID() {
		return DeliveryDriverID;
	}	
	
	public void setDeliveryDriverID(int deliverydriverid) {
		this.DeliveryDriverID = deliverydriverid;
	}
	public int getRating() {
		return Rating;
	}	
	
	public void setRating(int rating) {
		this.Rating = rating;
	}
	public String getComment() {
		return Comment;
	}	
	
	public void setComment(String comment) {
		this.Comment = comment;
	}
	
	/* all functions for reference*/
	public Customer getReviewtoCustomer() {
		return ReviewtoCustomer;
	}	
	
	public void setReviewtoCustomer(Customer customer) {
		this.ReviewtoCustomer = customer;
	}			
	public Restaurant getReviewtoRestaurant() {
		return ReviewtoRestaurant;
	}	
	
	public void setReviewtoRestaurant(Restaurant restaurant) {
		this.ReviewtoRestaurant = restaurant;
	}			
	public DeliveryDriver getReviewtoDeliveryDriver() {
		return ReviewtoDeliveryDriver;
	}	
	
	public void setReviewtoDeliveryDriver(DeliveryDriver deliverydriver) {
		this.ReviewtoDeliveryDriver = deliverydriver;
	}			
	


}
