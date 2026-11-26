package com.oopConcept;

public class Employee {
	static String company="ABC Technologies";
	static//A static block executes automatically when the class is loaded. You don't need to call it.
	{
		System.out.println("company information loaded");
	}
	//An instance block executes every time an object is created.
	{
		System.out.println("employee object created");
	}
	int empId;
	String empName;
	double salary;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		emp1.empId=101;
		emp1.empName="ram";
		emp1.salary=60000;
		emp2.empId=102;
		emp2.empName="lakshman";
		emp2.salary=50000;
		emp3.empId=103;
		emp3.empName="hanu";
		emp3.salary=70000;
		
		System.out.println(company);
		System.out.println("Employee 1");
		System.out.println("ID:"+emp1.empId);
		System.out.println("Name:"+emp1.empName);
		System.out.println("Salary:"+emp1.salary);
		System.out.println("Employee 2");
		System.out.println("ID:"+emp2.empId);
		System.out.println("Name:"+emp2.empName);
		System.out.println("Salary:"+emp2.salary);
		System.out.println("Employee 3");
		System.out.println("ID:"+emp3.empId);
		System.out.println("Name:"+emp3.empName);
		System.out.println("Salary:"+emp3.salary);
		
		
		
		

	}

}
