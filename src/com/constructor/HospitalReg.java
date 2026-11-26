package com.constructor;

public class HospitalReg {
	int patientId;
	String patientName;
	String disease;
	double billAmount;
	public HospitalReg(int patientId)
	{
		this.patientId=patientId;
		System.out.println("Patient Registration Started");
		
	}
	public HospitalReg(int patientId,String patientName)
	{
		this(patientId);
		this.patientName=patientName;
	}
	public HospitalReg(int patientId,String patientName,String disease)
	{
		this(patientId,patientName);
		this.disease=disease;
	}
	public HospitalReg(int patientId,String patientName,String disease,double billAmount)
	{
		this(patientId,patientName,disease);
		this.billAmount=billAmount;
	}
	public void display()
	{
		System.out.println("patient id:"+patientId);
		System.out.println("patient name:"+patientName);
		System.out.println("disease:"+disease);
		System.out.println("total amount:"+billAmount);
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalReg hr=new HospitalReg(101, "Rahul", "Fever", 2500);
		hr.display();
		

	}

}
