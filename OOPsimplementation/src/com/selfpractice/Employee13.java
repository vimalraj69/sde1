package com.selfpractice;

public class Employee13 {
	protected String id;
	protected String name;
	protected double salary;
	Employee13(String id , String name, double salary) {
		this.id= id;
		this.name=name;
		this.salary=salary;
	}
	
	public double calulateYearlySalary(double monthlySalary){
		return 12 * monthlySalary;
	}
	public double calulateYearlySalary(double dailySalary , int days){
		return days * dailySalary;
	}
	public double calulateYearlySalary(int hours,double hoursSalary){
		return hours * hoursSalary;
	}
	public static void main(String args []) {
		Employee13 e= new Employee13("303","vimal",1000000);
		Employee13 e1= new Employee13("303","naruto",7000);
		Employee13 e2= new Employee13("303","luffy",80000);
		Employee13 e3= new Employee13("303","goku",130000);
		
		System.out.println(e.calulateYearlySalary(1000000));
		System.out.println(e1.calulateYearlySalary(250.0,360));
		System.out.println(e.calulateYearlySalary(3000,250.0));



		
	}
}
