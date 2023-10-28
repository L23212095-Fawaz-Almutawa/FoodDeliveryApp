package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class RestaurantOwner implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Phone;
	private String Email;
	private int RestaurantID;
	
	/* all references */
	private List<Restaurant> RestaurantOwnertoRestaurant = new LinkedList<Restaurant>(); 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
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
	public int getRestaurantID() {
		return RestaurantID;
	}	
	
	public void setRestaurantID(int restaurantid) {
		this.RestaurantID = restaurantid;
	}
	
	/* all functions for reference*/
	public List<Restaurant> getRestaurantOwnertoRestaurant() {
		return RestaurantOwnertoRestaurant;
	}	
	
	public void addRestaurantOwnertoRestaurant(Restaurant restaurant) {
		this.RestaurantOwnertoRestaurant.add(restaurant);
	}
	
	public void deleteRestaurantOwnertoRestaurant(Restaurant restaurant) {
		this.RestaurantOwnertoRestaurant.remove(restaurant);
	}
	


}
