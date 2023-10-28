package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Item implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Description;
	private float Price;
	private String Ingredients;
	private String Category;
	private boolean Promotion;
	private String Name;
	private boolean Customizable;
	private int RestaurantID;
	
	/* all references */
	private List<Menu> ItemtoMenu = new LinkedList<Menu>(); 
	private List<Category> ItemtoCategory = new LinkedList<Category>(); 
	private Cart ItemtoCart; 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public String getDescription() {
		return Description;
	}	
	
	public void setDescription(String description) {
		this.Description = description;
	}
	public float getPrice() {
		return Price;
	}	
	
	public void setPrice(float price) {
		this.Price = price;
	}
	public String getIngredients() {
		return Ingredients;
	}	
	
	public void setIngredients(String ingredients) {
		this.Ingredients = ingredients;
	}
	public String getCategory() {
		return Category;
	}	
	
	public void setCategory(String category) {
		this.Category = category;
	}
	public boolean getPromotion() {
		return Promotion;
	}	
	
	public void setPromotion(boolean promotion) {
		this.Promotion = promotion;
	}
	public String getName() {
		return Name;
	}	
	
	public void setName(String name) {
		this.Name = name;
	}
	public boolean getCustomizable() {
		return Customizable;
	}	
	
	public void setCustomizable(boolean customizable) {
		this.Customizable = customizable;
	}
	public int getRestaurantID() {
		return RestaurantID;
	}	
	
	public void setRestaurantID(int restaurantid) {
		this.RestaurantID = restaurantid;
	}
	
	/* all functions for reference*/
	public List<Menu> getItemtoMenu() {
		return ItemtoMenu;
	}	
	
	public void addItemtoMenu(Menu menu) {
		this.ItemtoMenu.add(menu);
	}
	
	public void deleteItemtoMenu(Menu menu) {
		this.ItemtoMenu.remove(menu);
	}
	public List<Category> getItemtoCategory() {
		return ItemtoCategory;
	}	
	
	public void addItemtoCategory(Category category) {
		this.ItemtoCategory.add(category);
	}
	
	public void deleteItemtoCategory(Category category) {
		this.ItemtoCategory.remove(category);
	}
	public Cart getItemtoCart() {
		return ItemtoCart;
	}	
	
	public void setItemtoCart(Cart cart) {
		this.ItemtoCart = cart;
	}			
	


}
