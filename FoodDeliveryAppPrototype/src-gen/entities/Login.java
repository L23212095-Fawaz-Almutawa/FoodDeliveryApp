package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Login implements Serializable {
	
	/* all primary attributes */
	private String Username;
	private String Password;
	
	/* all references */
	private Guest LogintoGuest; 
	private Customer LogintoCustomer; 
	
	/* all get and set functions */
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
	public Guest getLogintoGuest() {
		return LogintoGuest;
	}	
	
	public void setLogintoGuest(Guest guest) {
		this.LogintoGuest = guest;
	}			
	public Customer getLogintoCustomer() {
		return LogintoCustomer;
	}	
	
	public void setLogintoCustomer(Customer customer) {
		this.LogintoCustomer = customer;
	}			
	


}
