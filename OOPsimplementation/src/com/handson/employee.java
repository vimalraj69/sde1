package com.handson;

import java.util.Scanner;

public class employee {
	
	double salary;
	double workHours;
	
	public void getInfo(double sal , double hour) {
		salary=sal;
		workHours=hour;
	}
	public double addSal() {
	  if(salary<500) {
		  salary+=10;
	  }
	  return salary;
	}
	
	public double addWork() {
		  if(workHours>6) {
			  salary+=5;
		  }
		  return salary;
	}	
	
	public static void main (String args[]) {
		employee e = new employee();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the salary and work hours :");
		int l =sc.nextInt();
		int b=sc.nextInt();
		
		e.getInfo(l,b);
		
		
		System.out.println("Adding salary check by salary:"+e.addSal());
		System.out.println("Adding salary check by work hour:"+e.addWork());
	}

}
