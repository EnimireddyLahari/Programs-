package com.arraypPractice;
import java.util.Scanner;
public class ArraySumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array element:");
		int arr[]=new int[5];
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=sum/arr.length;
		}
		System.out.println("the sum is:"+sum);
		System.out.println("the average is:"+avg);
		

	}

}
