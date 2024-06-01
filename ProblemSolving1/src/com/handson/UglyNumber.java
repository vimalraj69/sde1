package com.handson;

import java.util.Scanner;

public class UglyNumber {
	static boolean isuglynum (int num) {
		
		int i=6;
		
		while (i<=num) {
			if ( isPrime(i) && num % i == 0 && i>5) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	static boolean isPrime(int num) {
		for(int i =2 ; i<num ; i ++) {
			if(num % i ==0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is Ugly Number :"+ isuglynum(num));
		
		
		sc.close();

	}
}
