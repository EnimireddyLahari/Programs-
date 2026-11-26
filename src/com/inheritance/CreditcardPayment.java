package com.inheritance;

public class CreditcardPayment extends Payment {
	@Override
	public void processPayment(double amount)
	{
		System.out.println("processing credit card payment:"+amount);
		
	}


}
