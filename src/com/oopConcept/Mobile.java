package com.oopConcept;

public class Mobile {
	int mobileid; 
	String brand;
	String model;    
	double price;
	public Mobile()
	{
		
	    this.mobileid=1001;
		this.brand="Samsung";
		this.model="Galaxy A35";    
		this.price=28000;
	}
	public Mobile(int mobileid,String brand,String model,double price)
	{
		this.mobileid=mobileid;
		this.brand=brand;
		this.model=model;    
		this.price=price;
		
	}
	public Mobile(Mobile mb)
	{
		this.mobileid=mb.mobileid;
		this.brand=mb.brand;
		this.model=mb.model;    
		this.price=mb.price;
		
	}
	public void display()
	{
		System.out.println("Mobile ID:"+mobileid);
		System.out.println("brand:"+brand);
		System.out.println("Model:"+model);
		System.out.println("price:"+price);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mobile 1");
		Mobile mb=new Mobile();
		mb.display();
		System.out.println("Mobile 2");
		Mobile mb1=new Mobile(1002,"OnePlus","Nord CE 5",24999);
		mb1.display();
		System.out.println("Mobile 3");
		Mobile mb2=new Mobile(mb1);
		
		mb2.display();
		mb2.price=23000;
		mb2.display();
		
		

	}

}
