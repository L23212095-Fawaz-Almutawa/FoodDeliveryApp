package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Guest implements Serializable {
	
	/* all primary attributes */
	
	/* all references */
	private List<Login> GuesttoLogin = new LinkedList<Login>(); 
	
	/* all get and set functions */
	
	/* all functions for reference*/
	public List<Login> getGuesttoLogin() {
		return GuesttoLogin;
	}	
	
	public void addGuesttoLogin(Login login) {
		this.GuesttoLogin.add(login);
	}
	
	public void deleteGuesttoLogin(Login login) {
		this.GuesttoLogin.remove(login);
	}
	


}
