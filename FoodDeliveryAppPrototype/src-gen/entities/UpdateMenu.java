package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class UpdateMenu implements Serializable {
	
	/* all primary attributes */
	private int RestaurantID;
	private int RestaurantOwnerID;
	private String Description;
	private int MenuID;
	private float NewPrice;
	
	/* all references */
	private Restaurant UpdateMenutoRestaurant; 
	
	/* all get and set functions */
	public int getRestaurantID() {
		return RestaurantID;
	}	
	
	public void setRestaurantID(int restaurantid) {
		this.RestaurantID = restaurantid;
	}
	public int getRestaurantOwnerID() {
		return RestaurantOwnerID;
	}	
	
	public void setRestaurantOwnerID(int restaurantownerid) {
		this.RestaurantOwnerID = restaurantownerid;
	}
	public String getDescription() {
		return Description;
	}	
	
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getMenuID() {
		return MenuID;
	}	
	
	public void setMenuID(int menuid) {
		this.MenuID = menuid;
	}
	public float getNewPrice() {
		return NewPrice;
	}	
	
	public void setNewPrice(float newprice) {
		this.NewPrice = newprice;
	}
	
	/* all functions for reference*/
	public Restaurant getUpdateMenutoRestaurant() {
		return UpdateMenutoRestaurant;
	}	
	
	public void setUpdateMenutoRestaurant(Restaurant restaurant) {
		this.UpdateMenutoRestaurant = restaurant;
	}			
	


}
