package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Customer implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Name;
	private String Address;
	private String Phone;
	private String Email;
	private String Username;
	private String Password;
	
	/* all references */
	private Cart CustomertoCart; 
	private List<Review> CustomertoReview = new LinkedList<Review>(); 
	private List<Order> CustomertoOrder = new LinkedList<Order>(); 
	private List<Delivery> CustomertoDelivery = new LinkedList<Delivery>(); 
	private List<Login> CustomertoLogin = new LinkedList<Login>(); 
	private List<Payment> CustomertoPayment = new LinkedList<Payment>(); 
	
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
	public String getAddress() {
		return Address;
	}	
	
	public void setAddress(String address) {
		this.Address = address;
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
	public String getUsername() {
		return Username;
	}	
	
	public void setUsername(String username) {
		this.Username = username;
	}
	public String getPassword() {
		return Password;
	}	
	
	public void setPassword(String password) {
		this.Password = password;
	}
	
	/* all functions for reference*/
	public Cart getCustomertoCart() {
		return CustomertoCart;
	}	
	
	public void setCustomertoCart(Cart cart) {
		this.CustomertoCart = cart;
	}			
	public List<Review> getCustomertoReview() {
		return CustomertoReview;
	}	
	
	public void addCustomertoReview(Review review) {
		this.CustomertoReview.add(review);
	}
	
	public void deleteCustomertoReview(Review review) {
		this.CustomertoReview.remove(review);
	}
	public List<Order> getCustomertoOrder() {
		return CustomertoOrder;
	}	
	
	public void addCustomertoOrder(Order order) {
		this.CustomertoOrder.add(order);
	}
	
	public void deleteCustomertoOrder(Order order) {
		this.CustomertoOrder.remove(order);
	}
	public List<Delivery> getCustomertoDelivery() {
		return CustomertoDelivery;
	}	
	
	public void addCustomertoDelivery(Delivery delivery) {
		this.CustomertoDelivery.add(delivery);
	}
	
	public void deleteCustomertoDelivery(Delivery delivery) {
		this.CustomertoDelivery.remove(delivery);
	}
	public List<Login> getCustomertoLogin() {
		return CustomertoLogin;
	}	
	
	public void addCustomertoLogin(Login login) {
		this.CustomertoLogin.add(login);
	}
	
	public void deleteCustomertoLogin(Login login) {
		this.CustomertoLogin.remove(login);
	}
	public List<Payment> getCustomertoPayment() {
		return CustomertoPayment;
	}	
	
	public void addCustomertoPayment(Payment payment) {
		this.CustomertoPayment.add(payment);
	}
	
	public void deleteCustomertoPayment(Payment payment) {
		this.CustomertoPayment.remove(payment);
	}
	


}
