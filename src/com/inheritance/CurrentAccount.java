package com.inheritance;

public class CurrentAccount extends BankAccount{
	 @Override
	    public void calculateInterest(double amount)
	    {
	        double interest = amount * 2 / 100;
	        System.out.printf("Current Account Interest:"+ interest);
	    }

}
