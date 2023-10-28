package entities;

import services.impl.StandardOPs;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.io.Serializable;
import java.lang.reflect.Method;

public class Payment implements Serializable {
	
	/* all primary attributes */
	private PaymentMethod AmountTendered;
	
	/* all references */
	private Customer PaymenttoCustomer; 
	private CashPayment PaymenttoCashPayment; 
	private CardPayment PaymenttoCardPayment; 
	
	/* all get and set functions */
	public PaymentMethod getAmountTendered() {
		return AmountTendered;
	}	
	
	public void setAmountTendered(PaymentMethod amounttendered) {
		this.AmountTendered = amounttendered;
	}
	
	/* all functions for reference*/
	public Customer getPaymenttoCustomer() {
		return PaymenttoCustomer;
	}	
	
	public void setPaymenttoCustomer(Customer customer) {
		this.PaymenttoCustomer = customer;
	}			
	public CashPayment getPaymenttoCashPayment() {
		return PaymenttoCashPayment;
	}	
	
	public void setPaymenttoCashPayment(CashPayment cashpayment) {
		this.PaymenttoCashPayment = cashpayment;
	}			
	public CardPayment getPaymenttoCardPayment() {
		return PaymenttoCardPayment;
	}	
	
	public void setPaymenttoCardPayment(CardPayment cardpayment) {
		this.PaymenttoCardPayment = cardpayment;
	}			
	


}
