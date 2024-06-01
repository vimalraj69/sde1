package com.handson;
abstract class Employee{
	int employeeid;
	String name;
	
	
	Employee(int id, String name){
		employeeid=id;
		this.name=name;
	}
	
	public void displayInfo() {
		System.out.println("Emploee id:"+employeeid);
		System.out.println("Emploee name:"+name);

	}
	abstract  double calculateSalary();
}

class FullTimeEmployee extends Employee{
	double monthlyS;
	double salary;
	
	FullTimeEmployee(double monthlyS,int id, String name){
		super(id,name);
		this.monthlyS=monthlyS;
		
	}
	
	public double calculateSalary(){
		return monthlyS;
	}
	
	public void displayInfo() {
		super.displayInfo();
		

	}
}

class PartTimeEmployee  extends Employee{
	double hourlyrate;
	int hoursWorked;
	double salary;
	PartTimeEmployee(double hourlyrate,int hoursWorked,int id, String name){
		super(id,name);
		this.hourlyrate = hourlyrate;
		this.hoursWorked = hoursWorked;
	}
	public double calculateSalary(){
		  salary =hourlyrate * hoursWorked;
		  return salary;
		
	}
	public void displayInfo() {
		super.displayInfo();
		

	}
}

class ContractEmployee extends Employee{
	int contractDuration;
	double monthlyPay;
	double salary;
	
	ContractEmployee(int contractDuration, double monthlyPay ,int id, String name) {
		super(id,name);
		
		this.contractDuration = contractDuration;
		this.monthlyPay = monthlyPay;
	}
	public double calculateSalary(){
		salary = contractDuration * monthlyPay;
		return salary;
		 
		
	}
	public void displayInfo() {
		super.displayInfo();
		

	}
}

public class company {
	public static void main (String args[]) {
		FullTimeEmployee e1= new FullTimeEmployee(100000,69,"vimal");
		PartTimeEmployee e2 = new PartTimeEmployee(150,8,34,"raj");
		ContractEmployee e3 = new ContractEmployee(340,3000,35,"wane");
		e1.displayInfo();
		System.out.println(e1.calculateSalary()+"\n");
		e2.displayInfo();
		System.out.println(e2.calculateSalary()+"\n");
		e3.displayInfo();
		System.out.println(e3.calculateSalary()+"\n");
	}
}
