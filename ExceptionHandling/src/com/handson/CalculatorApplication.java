package com.handson;

import java.util.InputMismatchException;
import java.util.Scanner;

class NotOneorZero extends Exception{
	NotOneorZero(String s){
		super(s);
	}
}
class NotZero extends Exception{
	NotZero(String s){
		super(s);
	}
}
public class CalculatorApplication {
	
	public int addition (int a , int b) {
		return a+b;
	}
	public int subtraction (int a , int b) {
		return a-b;
	}
	public int multiplication (int a , int b) throws NotOneorZero {
		if(a==1 || a==0 || b==0 || b==1 ) {
			throw new NotOneorZero("number should not be 0 or 1");
		}
		return a*b;
	}
	public int division (int num , int demoninator) throws NotZero {
		if(demoninator==0 ) {
			throw new NotZero("number should not be 0");
		}
		return num/demoninator;
	}
	
	public static void main (String args []) {
		CalculatorApplication c = new CalculatorApplication();
		Scanner sc = new Scanner (System.in);
		
		
			try {
			System.out.println("Enter number 1 for Addition :");
			System.out.println("Enter number 2 for Subtraction :");
			System.out.println("Enter number 3 for multiplication :");
			System.out.println("Enter number 4 for division :");
			int n =sc.nextInt();
			
				System.out.print("Enter the number 1:");
				int a = sc.nextInt();
				System.out.print("Enter the number 2:");
				int b= sc.nextInt();
				if(n ==1) {
					System.out.println("Output :"+c.addition(a,b));
				}else if (n ==2 ) {
					System.out.println("Output :"+c.subtraction(a,b));

				}else if (n==3) {
					System.out.println("Output :"+c.multiplication(a,b));
				}else {
					System.out.println("Output :"+c.division(a,b));

				}
			}
			catch(InputMismatchException e) {
				System.out.println(e+"\n");
			}
			catch(Exception e) {
				System.out.println(e+"\n");
			}
			

		
	}
	
}
