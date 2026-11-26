package com.inheritance;

public class Car extends Vehicle{
	int price;
	int numofDoors;
public Car(int vehNum,String brand,String colour,int price,int numofDoors)
{
	super(vehNum, brand, colour);
	this.price=price;
	this.numofDoors=numofDoors;
}
public void display()
{
	System.out.println("price:"+price);
	System.out.println("num of doors:"+numofDoors);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle veh=new Vehicle (101,"BMW","black");
		
		veh.display();
		Car cr=new Car(101,"BMW","black",300000,4);
		cr.display();
		
		

	}

}
