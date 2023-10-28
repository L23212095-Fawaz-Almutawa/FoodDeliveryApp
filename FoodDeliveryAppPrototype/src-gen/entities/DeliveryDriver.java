package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class DeliveryDriver implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Name;
	private String Phone;
	
	/* all references */
	private List<Delivery> DeliveryDrivertoDelivery = new LinkedList<Delivery>(); 
	private List<Review> DeliveryDrivertoReview = new LinkedList<Review>(); 
	
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
	public String getPhone() {
		return Phone;
	}	
	
	public void setPhone(String phone) {
		this.Phone = phone;
	}
	
	/* all functions for reference*/
	public List<Delivery> getDeliveryDrivertoDelivery() {
		return DeliveryDrivertoDelivery;
	}	
	
	public void addDeliveryDrivertoDelivery(Delivery delivery) {
		this.DeliveryDrivertoDelivery.add(delivery);
	}
	
	public void deleteDeliveryDrivertoDelivery(Delivery delivery) {
		this.DeliveryDrivertoDelivery.remove(delivery);
	}
	public List<Review> getDeliveryDrivertoReview() {
		return DeliveryDrivertoReview;
	}	
	
	public void addDeliveryDrivertoReview(Review review) {
		this.DeliveryDrivertoReview.add(review);
	}
	
	public void deleteDeliveryDrivertoReview(Review review) {
		this.DeliveryDrivertoReview.remove(review);
	}
	


}
