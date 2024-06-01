package com.handson;

import java.util.Scanner;

public class NumberFoHandshakes {
	static int totalhandShakes (int num) {
		
		int total = (num*(num-1))/2;
		
		return total;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is Total no of handShakes :"+ totalhandShakes(num));
		
		
		sc.close();

	}
}
