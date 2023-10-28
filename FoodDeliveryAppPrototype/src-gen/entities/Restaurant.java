package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Restaurant implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Name;
	private String Description;
	private String Cuisine;
	private boolean Status;
	private String Phone;
	private String Email;
	private String Address;
	
	/* all references */
	private List<UpdateMenu> RestauranttoUpdateMenu = new LinkedList<UpdateMenu>(); 
	private RestaurantOwner RestauranttoRestaurantOwner; 
	private Menu RestauranttoMenu; 
	private List<Review> RestauranttoReview = new LinkedList<Review>(); 
	private List<Order> RestauranttoOrder = new LinkedList<Order>(); 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public String getName() {
		return Name;
	}	
	
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return Description;
	}	
	
	public void setDescription(String description) {
		this.Description = description;
	}
	public String getCuisine() {
		return Cuisine;
	}	
	
	public void setCuisine(String cuisine) {
		this.Cuisine = cuisine;
	}
	public boolean getStatus() {
		return Status;
	}	
	
	public void setStatus(boolean status) {
		this.Status = status;
	}
	public String getPhone() {
		return Phone;
	}	
	
	public void setPhone(String phone) {
		this.Phone = phone;
	}
	public String getEmail() {
		return Email;
	}	
	
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getAddress() {
		return Address;
	}	
	
	public void setAddress(String address) {
		this.Address = address;
	}
	
	/* all functions for reference*/
	public List<UpdateMenu> getRestauranttoUpdateMenu() {
		return RestauranttoUpdateMenu;
	}	
	
	public void addRestauranttoUpdateMenu(UpdateMenu updatemenu) {
		this.RestauranttoUpdateMenu.add(updatemenu);
	}
	
	public void deleteRestauranttoUpdateMenu(UpdateMenu updatemenu) {
		this.RestauranttoUpdateMenu.remove(updatemenu);
	}
	public RestaurantOwner getRestauranttoRestaurantOwner() {
		return RestauranttoRestaurantOwner;
	}	
	
	public void setRestauranttoRestaurantOwner(RestaurantOwner restaurantowner) {
		this.RestauranttoRestaurantOwner = restaurantowner;
	}			
	public Menu getRestauranttoMenu() {
		return RestauranttoMenu;
	}	
	
	public void setRestauranttoMenu(Menu menu) {
		this.RestauranttoMenu = menu;
	}			
	public List<Review> getRestauranttoReview() {
		return RestauranttoReview;
	}	
	
	public void addRestauranttoReview(Review review) {
		this.RestauranttoReview.add(review);
	}
	
	public void deleteRestauranttoReview(Review review) {
		this.RestauranttoReview.remove(review);
	}
	public List<Order> getRestauranttoOrder() {
		return RestauranttoOrder;
	}	
	
	public void addRestauranttoOrder(Order order) {
		this.RestauranttoOrder.add(order);
	}
	
	public void deleteRestauranttoOrder(Order order) {
		this.RestauranttoOrder.remove(order);
	}
	


}
