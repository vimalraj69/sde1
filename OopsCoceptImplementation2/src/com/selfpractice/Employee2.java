package com.selfpractice;

public class Employee2 {
	protected String id;
	protected String name;
	protected double salary;
	Employee2(String id , String name, double salary) {
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
	
	public void tostring() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
		System.out.println("salary :"+salary);

	}
	public static void main(String args []) {
		Employee2 e= new Employee2("303","vimal",1000000);
		Employee2 e1= new Employee2("303","naruto",7000);
		Employee2 e2= new Employee2("303","luffy",80000);
		Employee2 e3= new Employee2("303","goku",130000);
		
		System.out.println(e.calulateYearlySalary(1000000));
		System.out.println(e1.calulateYearlySalary(250.0,360));
		System.out.println(e.calulateYearlySalary(3000,250.0));
		
		e3.tostring();


		
	}
}
