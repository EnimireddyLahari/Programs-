package com.inheritance;

public class UPIPayment extends Payment{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("processing UPI payment:"+amount);
		
	}

	

}
