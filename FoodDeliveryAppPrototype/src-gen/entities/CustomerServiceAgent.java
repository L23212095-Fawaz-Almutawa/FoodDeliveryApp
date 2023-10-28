package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class CustomerServiceAgent implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private String Name;
	private String Email;
	private String Phone;
	
	/* all references */
	private List<Contact> CustomerServiceAgenttoContact = new LinkedList<Contact>(); 
	
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
	public String getEmail() {
		return Email;
	}	
	
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPhone() {
		return Phone;
	}	
	
	public void setPhone(String phone) {
		this.Phone = phone;
	}
	
	/* all functions for reference*/
	public List<Contact> getCustomerServiceAgenttoContact() {
		return CustomerServiceAgenttoContact;
	}	
	
	public void addCustomerServiceAgenttoContact(Contact contact) {
		this.CustomerServiceAgenttoContact.add(contact);
	}
	
	public void deleteCustomerServiceAgenttoContact(Contact contact) {
		this.CustomerServiceAgenttoContact.remove(contact);
	}
	


}
