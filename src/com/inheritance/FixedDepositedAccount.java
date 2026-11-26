package com.inheritance;

public class FixedDepositedAccount extends BankAccount {
	 @Override
	    public void calculateInterest(double amount)
	    {
	        double interest = amount * 7 / 100;
	        System.out.printf("Fixed Deposit Interest:"+ interest);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount [] accounts=new BankAccount [3] ;
		accounts[0] = new SavingsAccouunt();
        accounts[1] = new CurrentAccount();
        accounts[2] = new FixedDepositedAccount();
        for(int i=0;i<accounts.length;i++)
        {
         	accounts[i].calculateInterest(10000);
        }
        

	}

}
