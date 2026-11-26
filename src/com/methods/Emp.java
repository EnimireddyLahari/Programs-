package com.methods;

public class Emp {
	int employeeId;
	String employeeName;
	double employeeSalary;
	static String companyName="codegnan";
	public void displayEmployeeDetails(
		int employeeId,
		String employeeName,
		double employeeSalary)
	
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		
		
	}
	public double calculateAnnualSalary()
	{
		double annualSalary=12*employeeSalary;
		return annualSalary;
	}
	public static void displayCompanyName()
	{
		System.out.println(companyName);
	}
	public void display()
	{
		System.out.println("employee id:"+employeeId);
		System.out.println("employee name:"+employeeName);
		System.out.println("employee salary:"+employeeSalary);
		System.out.println("annual salary:"+calculateAnnualSalary());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		Emp emp1=new Emp();
		Emp emp2=new Emp();
		
		emp.displayEmployeeDetails(101,"ram",50000);
		emp1.displayEmployeeDetails(102,"seetha",60000);
		emp2.displayEmployeeDetails(103, "laskshman",40000);
		displayCompanyName();
		emp.display();
		emp1.display();
		emp2.display();
		
		

	}

}
