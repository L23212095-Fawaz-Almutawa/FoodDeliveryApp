package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Menu implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String ItemID;
	
	/* all references */
	private Restaurant MenutoRestaurant; 
	private List<Item> MenutoItem = new LinkedList<Item>(); 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public String getItemID() {
		return ItemID;
	}	
	
	public void setItemID(String itemid) {
		this.ItemID = itemid;
	}
	
	/* all functions for reference*/
	public Restaurant getMenutoRestaurant() {
		return MenutoRestaurant;
	}	
	
	public void setMenutoRestaurant(Restaurant restaurant) {
		this.MenutoRestaurant = restaurant;
	}			
	public List<Item> getMenutoItem() {
		return MenutoItem;
	}	
	
	public void addMenutoItem(Item item) {
		this.MenutoItem.add(item);
	}
	
	public void deleteMenutoItem(Item item) {
		this.MenutoItem.remove(item);
	}
	


}
