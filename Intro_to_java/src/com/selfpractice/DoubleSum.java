package com.selfpractice;

import java.util.Scanner;

public class DoubleSum {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Numbers :");
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		if(num1==num2) {
			System.out.println((num1+num2)*2);
		}else {
			System.out.println(num1+num2);
		}

		
	}

}
