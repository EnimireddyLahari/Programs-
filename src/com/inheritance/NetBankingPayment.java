package com.inheritance;

public class NetBankingPayment extends Payment{
	@Override
	public void processPayment(double amount)
	{
		System.out.println("processing net banking payment:"+amount);
		
	}

 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pm=new UPIPayment();
		Payment pm1=new CreditcardPayment();
		Payment pm2=new NetBankingPayment();
		pm.processPayment(5000);
		pm1.processPayment(5000);
		pm2.processPayment(5000);

	}

}
