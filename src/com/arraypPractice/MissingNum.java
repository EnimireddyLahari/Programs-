package com.arraypPractice;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {22,17,4,66,8,2,87};
		
		for(int i=0;i<=100;i++)
		{
			boolean found=false;
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])
				{
					found=true;
				}
			}
			if(found==false)
			{
				System.out.println(i);
			}
			
		}
		

	}

}
