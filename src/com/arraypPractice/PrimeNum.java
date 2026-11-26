package com.arraypPractice;
import java.util.*;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=arr[i];j++)
			{
				if(arr[i]% j ==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println(arr[i]+" ");
			}
		}
		

	}

}
