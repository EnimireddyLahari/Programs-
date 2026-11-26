package com.arraypPractice;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter customer"+(i+1)+" " + "bill:");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0 && arr[i]<100)
			{
				System.out.println("bill is:"+arr[i]*2);
			}
			else if(arr[i]>100 && arr[i]<200)
			{
				System.out.println("bill is:"+arr[i]*3);
			}
			else
			{
				System.out.println("bill is:"+arr[i]*4);
			}
		}
		

	}

}
