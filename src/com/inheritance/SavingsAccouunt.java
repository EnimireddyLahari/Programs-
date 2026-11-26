package com.inheritance;

public class SavingsAccouunt extends BankAccount{
	public void calculateInterest(double amount)
	{
		double interest = amount * 4 / 100;
		System.out.println("Savings Account Interest:"+interest);
	}

}
