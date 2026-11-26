package com.arraypPractice;
import java.util.Scanner;
public class ReverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an array elements:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
