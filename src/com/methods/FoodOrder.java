package com.methods;
import java.util.Scanner;
public class FoodOrder {
	public void displayMenu(String item,int price,String item1,int price1,String item2,int price2,String item3,int price3,String item4,int price4)
	{
		System.out.println(item + " : " + price);
        System.out.println(item1 + " : " + price1);
        System.out.println(item2 + " : " + price2);
        System.out.println(item3 + " : " + price3);
        System.out.println(item4 + " : " + price4);
		 
	}
	public double calculateBill(int quantity, int price)
	{
		double bill=quantity*price;
		return bill;
	}
	public double calculateDiscount(double bill)
	{
		double discount=0;
		if(bill>1000)
		{
			discount=bill*10/100;
			//bill=bill-discount;
		}
		double finalBill=bill-discount;
		return finalBill;
	}
	 public void printBill(double bill, double finalBill) {

	        System.out.println("Original Bill: " + bill);
	        System.out.println("Final Bill: " + finalBill);
	    }



	public static void main(String[] args) {
		// TODO Auto-generated method 
		FoodOrder fo=new FoodOrder();
		System.out.println("====menu====");
		fo.displayMenu("biryani",450,"chicken fry",300,"mutton biryani",500,"butternon",200,"prawns biryani",600);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice:");
		int choice=sc.nextInt();
		int price=0;
		switch(choice)
		{
		case 1:
			price=450;
			System.out.println(price);
			break;
		case 2:
			//System.out.println();
			 price=300;
			System.out.println(price);
			break;
		case 3:
			price=500;
			System.out.println(price);
			break;
		case 4:
			price=200;
			System.out.println(price);
			break;
		case 5:
			price=600;
			System.out.println(price);
			break;
		default:
		{
			System.out.println("invalid choice");
		}
			
		}
		System.out.println("enter your quantity:");
		int quant=sc.nextInt();
		//fo.displayMenu("biryani",450,"chicken fry",300,"mutton biryani",500,"butternon",200,"prawns biryani",600);
		//System.out.println(fo.calculateBill(choice,quant));
		//System.out.println(fo.calculateDiscount(quant,price));
		double bill = fo.calculateBill(quant, price);
		double finalBill = fo.calculateDiscount(bill);
		fo.printBill(bill, finalBill);
		//System.out.println(fo.calculateBill(2,300));
		//System.out.println(fo.calculateDiscount(bill));
		
		
		
		
		
		

	}

}
