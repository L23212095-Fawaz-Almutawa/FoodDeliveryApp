package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class CardPayment implements Serializable {
	
	/* all primary attributes */
	private String CardNumber;
	private LocalDate ExpirationDate;
	
	/* all references */
	private Payment CardPaymenttoPayment; 
	
	/* all get and set functions */
	public String getCardNumber() {
		return CardNumber;
	}	
	
	public void setCardNumber(String cardnumber) {
		this.CardNumber = cardnumber;
	}
	public LocalDate getExpirationDate() {
		return ExpirationDate;
	}	
	
	public void setExpirationDate(LocalDate expirationdate) {
		this.ExpirationDate = expirationdate;
	}
	
	/* all functions for reference*/
	public Payment getCardPaymenttoPayment() {
		return CardPaymenttoPayment;
	}	
	
	public void setCardPaymenttoPayment(Payment payment) {
		this.CardPaymenttoPayment = payment;
	}			
	


}
