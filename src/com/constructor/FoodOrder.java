package com.constructor;

public class FoodOrder {
	int orderId;
	String restaurantName;
	String foodItem;
	String deliveryAddress;
	public FoodOrder(int orderId)
	{
		this.orderId=orderId;
		System.out.println("customer gets order id");
	}
	public FoodOrder(int orderId,String restaurantName)
	{
		this(orderId);
		this.restaurantName=restaurantName;
	}
	public FoodOrder(int orderId,
	String restaurantName,
	String foodItem)
	{
		this(orderId,restaurantName);
		this.foodItem=foodItem;
	}
	public FoodOrder(int orderId,
	String restaurantName,
	String foodItem,
	String deliveryAddress)
	{
		this(orderId,restaurantName,foodItem);
		this.deliveryAddress=deliveryAddress;
		
	}
	public void display()
	{
		System.out.println("order id:"+orderId);
		System.out.println("Restaurant Name:"+restaurantName);
		System.out.println("Food Item:"+foodItem);
		System.out.println("Delivery Adress:"+deliveryAddress);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodOrder fo=new FoodOrder(101,"chillis","Biryani","secundrabad");
		FoodOrder fo1=new FoodOrder(102,"paradise","Mutton Biryani","hyderabad");
		FoodOrder fo2=new FoodOrder(103,"dominos","pizza","kukatpally");
		fo.display();
		fo1.display();
		fo2.display();
		
		
		

	}

}
