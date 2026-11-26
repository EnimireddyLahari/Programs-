package com.arraypPractice;
import java.util.Scanner;
public class GivenElePrntInArrayorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an element");
		int num=sc.nextInt();
		int arr[]= {12,45,23,13,46,78};
		boolean b=false;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				b=true;
				break;
			}
			
		}
		if(b==true)
		{
			System.out.println("element is present");
		}
		else {
			System.out.println("element is not present");
		}
		
		

	}

}
