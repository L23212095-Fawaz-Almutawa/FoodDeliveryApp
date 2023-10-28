package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Cart implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private int Quantity;
	private String Products;
	private float Price;
	private float Total;
	
	/* all references */
	private Customer CarttoCustomer; 
	private List<Item> CarttoItem = new LinkedList<Item>(); 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public int getQuantity() {
		return Quantity;
	}	
	
	public void setQuantity(int quantity) {
		this.Quantity = quantity;
	}
	public String getProducts() {
		return Products;
	}	
	
	public void setProducts(String products) {
		this.Products = products;
	}
	public float getPrice() {
		return Price;
	}	
	
	public void setPrice(float price) {
		this.Price = price;
	}
	public float getTotal() {
		return Total;
	}	
	
	public void setTotal(float total) {
		this.Total = total;
	}
	
	/* all functions for reference*/
	public Customer getCarttoCustomer() {
		return CarttoCustomer;
	}	
	
	public void setCarttoCustomer(Customer customer) {
		this.CarttoCustomer = customer;
	}			
	public List<Item> getCarttoItem() {
		return CarttoItem;
	}	
	
	public void addCarttoItem(Item item) {
		this.CarttoItem.add(item);
	}
	
	public void deleteCarttoItem(Item item) {
		this.CarttoItem.remove(item);
	}
	


}
