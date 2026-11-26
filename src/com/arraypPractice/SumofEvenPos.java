package com.arraypPractice;
import java.util.Scanner;
public class SumofEvenPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an array elements:");
		int arr[]=new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);

		
	}

}
