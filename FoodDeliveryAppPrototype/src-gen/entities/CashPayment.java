package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class CashPayment implements Serializable {
	
	/* all primary attributes */
	private float Balance;
	
	/* all references */
	private Payment CashPaymenttoPayment; 
	
	/* all get and set functions */
	public float getBalance() {
		return Balance;
	}	
	
	public void setBalance(float balance) {
		this.Balance = balance;
	}
	
	/* all functions for reference*/
	public Payment getCashPaymenttoPayment() {
		return CashPaymenttoPayment;
	}	
	
	public void setCashPaymenttoPayment(Payment payment) {
		this.CashPaymenttoPayment = payment;
	}			
	


}
