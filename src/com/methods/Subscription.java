package com.methods;

public class Subscription {
	int userId;
	String userName;
	String platformName;
	int subscriptionPlan;
	int monthlyPrice;
	int numberofMonths;
	public Subscription(int userId,String userName,String platformName,int subscriptionPlan,int monthlyPrice,int numberofMonths)
	{
		this.userId = userId;
		this.userName = userName;
		this.platformName = platformName;
		this.subscriptionPlan = subscriptionPlan;
		this.monthlyPrice = monthlyPrice;
		this.numberofMonths = numberofMonths;
		
	}
	public int subscriptionAmnt()
	{
	    int amount = monthlyPrice * numberofMonths;

	    return amount;
	}
	public double discount()
	{
	    double amount = subscriptionAmnt();

	    double discount = 0;

	    if(numberofMonths == 12)
	    {
	        discount = amount*20/100;
	    }

	    double amnt = amount-discount;

	    return amnt;
	}
	public double gst()
	{
	    double amount = discount();

	    double gstbill = amount * 18 / 100;

	    double finalAmount = amount + gstbill;

	    return finalAmount;
	}
	
	public void display()
	{
		System.out.println("User ID:"+userId);
		System.out.println("User Name:"+userName);
		System.out.println("Platform Name:"+platformName);
		System.out.println("Subscription Plan:"+subscriptionPlan);
		System.out.println("Monthly Price:"+monthlyPrice);
		System.out.println("Number of Months:"+numberofMonths);
		System.out.println("Original Amount:"+subscriptionAmnt());

		System.out.println("Amount After Discount:"+discount());
		System.out.println("Final Payable Amount:"+gst());
		}
		
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subscription sb1=new Subscription(101,"ram","jiohotstar",12,600,12);
		Subscription sb2=new Subscription(102,"seetha","netflix",6,400,6);
		Subscription sb3=new Subscription(103,"lakshman","aaha",3,300,3);
		sb1.display();
		sb2.display();
		sb3.display();
		
		

	}

}
