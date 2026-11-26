package com.oopConcept;

public class LaptopInventory {
	String brand;
	String model;
	double price;
	public LaptopInventory(String brand,String model,double price)
	{
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public LaptopInventory(LaptopInventory l)
	{
		this.brand=l.brand;
		this.model=l.model;
		this.price=l.price;
		
	}
	public void display()
	
	{
		//System.out.println();
		System.out.println("Brand:"+" "+brand);
		System.out.println("model:"+model);
		System.out.println("price:"+price);
	}


	public static void main(String[] args) {
		System.out.println("Laptop 1");
		System.out.println();
		LaptopInventory li=new LaptopInventory("Dell","Insperon 15",60000);
		System.out.println();
		li.display();
		System.out.println();
        System.out.println("Laptop 2");
        System.out.println();
		LaptopInventory li1=new LaptopInventory(li);
		li1.display();
		

	}

}
