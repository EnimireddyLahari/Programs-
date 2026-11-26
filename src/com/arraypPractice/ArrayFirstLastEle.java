package com.arraypPractice;
import java.util.Scanner;
public class ArrayFirstLastEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array elements:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);

	}

}
