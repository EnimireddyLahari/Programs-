package com.oopConcept;

public class EmployeeParametrizedCon {
	int empId;
	String empName;
	String department;
	double salary;
	public EmployeeParametrizedCon(int empId,String empName,String department,double salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Employee ID:"+empId);
		System.out.println("Name:"+empName);
		System.out.println("Department:"+department);
		System.out.println("Salary:"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeParametrizedCon emp1=new EmployeeParametrizedCon(101,"Ravi","HR",35000);
		EmployeeParametrizedCon emp2=new EmployeeParametrizedCon(102,"Priya","Developer",55000);
		EmployeeParametrizedCon emp3=new EmployeeParametrizedCon(103,"Kiran","Testing",42000);
		emp1.display();
		emp2.display();
		emp3.display();
		
		
		

	}

}
