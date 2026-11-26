package com.inheritance;

public class Vehicle {
	int vehNum;
	String brand;
	String colour;
public Vehicle(int vehNum,String brand,String colour)
{
	this.vehNum=vehNum;
	this.brand=brand;
	this.colour=colour;
}
public void display()
{
	System.out.println("vehicle num:"+vehNum);
	System.out.println("brand name:"+brand);
	System.out.println("colour:"+colour);
}

}
