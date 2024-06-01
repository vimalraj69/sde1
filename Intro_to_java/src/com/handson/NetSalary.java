package com.handson;

import java.util.Scanner;

/*Write a Java program to calculate Net Salary. User must input 
Basic Salary and Output should be net salary calculated based on 
following allowances:
Allowances:
DA = 70% of Basic Salary
HRA = 7% of Basic Salary
MA = 2% of Basic Salary
TA = 4% of Basic Salary
Deduction:
PF = 12% of Basic Salary
Income/professional tax = User Input (e.g., 500)
Net Salary = Basic Salary + Allowances – Deduction

 * 
 */
public class NetSalary {
	public static void main(String args[]) {
		Scanner read=new Scanner(System.in);
		System.out.print("Enter basic Salary and tax : ");
		
		double basicSalary=read.nextDouble();
		double tax=read.nextDouble();
		
		double allowances=(0.7 * basicSalary)+(0.07 * basicSalary)+(0.02 * basicSalary)
							+(0.04 * basicSalary);
		double deduction=(0.12 * basicSalary)+tax;
		
		double NetSalary=basicSalary+allowances-deduction;
		
		System.out.println("Net Salary = "+NetSalary);
		
		
	}

}
