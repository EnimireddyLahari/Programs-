package com.methods;
import java.util.Scanner;

public class ResultManSys {
	public void acceptMarks(int arr[])
	{
		System.out.println("accept marks Succesfully");
	}
	public int totalMarks(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public int avgMarks(int arr[])
	{
		int avg=totalMarks(arr)/arr.length;
		return avg;
	}
	public char findGrade(int avgMarks)
	{
		char ch;
		if(avgMarks>80&&avgMarks<100)
		{
			ch='A';
		}
		else if(avgMarks>=70 && avgMarks<=80)
		{
			ch='B';
		}
		else if(avgMarks>=50 && avgMarks<70)
		{
			ch='C';
		}
		else if(avgMarks>=36 && avgMarks<=50)
		{
			ch='D';
		}
		else
		{
			ch='F';
		}
		return ch;
	}
	public void display(int arr[])
	{
		int avgres=avgMarks(arr);
		char grade=findGrade(avgres);
		System.out.println("grade:"+grade);
		
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ResultManSys rs=new ResultManSys();
		//rs.display(arr);
		//rs.display(arr);
		System.out.println("total marks:"+rs.totalMarks(arr));
		System.out.println("average marks:"+rs.avgMarks(arr));
		//System.out.println(rs.findGrade(avgres));
		rs.display(arr);
		

	}

}
