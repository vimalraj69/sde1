package com.selfpractice;

import java.util.Scanner;

public class TaxOnSalary {
	double salary;
	boolean isPanSubmitted ;
	
	
	TaxOnSalary (){
		
			salary=0.0;
			isPanSubmitted=false;
		
	}
	TaxOnSalary (double salary){
		
		this.salary=salary;
		
	
}
	
	TaxOnSalary (boolean isPanSubmitted){
		if(isPanSubmitted) {
			salary=1000;
		}
	}
	
	public double calculateTax() {
		if(salary < 180000 && isPanSubmitted)  {
			return 0.0;
		}
		if(salary < 180000 && !isPanSubmitted)  {
			return 0.05*salary;
		}
		if(salary > 180000 && salary <500000 )  {
			return 0.10*salary;
		}
		if(salary > 500000 && salary <1000000 )  {
			return 0.20*salary;
		}
		if(1000000 <= salary ) {
			return 0.3*salary;
		}
		return 0;
	}
	public void inputSalary(double salary) {
		this.salary=salary;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the tax 1 and tax 2 :");
		double tax1= sc.nextDouble();
		double tax2=sc.nextDouble();
		TaxOnSalary t1 = new TaxOnSalary(tax1);
		TaxOnSalary t2 = new TaxOnSalary(tax2);
		
		System.out.println("tax1 :"+t1.calculateTax());
		System.out.println("tax2 :"+t2.calculateTax());

		
		
	}

}
