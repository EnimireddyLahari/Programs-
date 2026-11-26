package com.oopConcept;

public class Student {
	static
	{ 
		System.out.println("Student Management System Started");
		
		System.out.println();
	}
	
	{
		System.out.println("Student object created");
	}
	int id;
	String name;
	String course;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		Student st2=new Student();
		System.out.println();
		st1.id=100;
		st2.name="ram";
		st1.name="seetha";
		st2.id=101;
		st2.course="Java";
		st1.course="Full Stack";
		System.out.println();
		System.out.println("Student 1");
		//System.out.println();
		System.out.println("Student:"+st1.name);
		System.out.println("Id:"+st1.id);
		System.out.println("Course:"+st1.course);
		System.out.println();
		System.out.println("Student 2");
		System.out.println("Student:"+st2.name);
		System.out.println("Id:"+st2.id);
		System.out.println("Course:"+st2.course);
		
		
		

	}

}
