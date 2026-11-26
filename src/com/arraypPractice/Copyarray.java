package com.arraypPractice;
import java.util.Scanner;
public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[]=new int[5];
		int arr1[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
			System.out.println(arr[i]);
		}
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr1[i]);
		}*/
		

	}

}
