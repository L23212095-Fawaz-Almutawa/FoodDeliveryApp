package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Contact implements Serializable {
	
	/* all primary attributes */
	private int ID;
	private int MessagerID;
	private int MessageeID;
	private String Message;
	
	/* all references */
	private CustomerServiceAgent ContacttoCustomerServiceAgent; 
	
	/* all get and set functions */
	public int getID() {
		return ID;
	}	
	
	public void setID(int id) {
		this.ID = id;
	}
	public int getMessagerID() {
		return MessagerID;
	}	
	
	public void setMessagerID(int messagerid) {
		this.MessagerID = messagerid;
	}
	public int getMessageeID() {
		return MessageeID;
	}	
	
	public void setMessageeID(int messageeid) {
		this.MessageeID = messageeid;
	}
	public String getMessage() {
		return Message;
	}	
	
	public void setMessage(String message) {
		this.Message = message;
	}
	
	/* all functions for reference*/
	public CustomerServiceAgent getContacttoCustomerServiceAgent() {
		return ContacttoCustomerServiceAgent;
	}	
	
	public void setContacttoCustomerServiceAgent(CustomerServiceAgent customerserviceagent) {
		this.ContacttoCustomerServiceAgent = customerserviceagent;
	}			
	


}
