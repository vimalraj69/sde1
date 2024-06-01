package com.handson;

import java.util.Scanner;

public class Sumoftwoprimenumbers {
	static void twoprime (int num) {
		
		for (int i =2; i<num ; i++ ) {
			boolean f= false;
			for(int j =i; j<num ; j++) {
				if(isprime(i) && isprime(j)) {
					if(i+j==num) {
						System.out.print(i+" "+j);
						f=true;
					}
				}
			}
			if(f) {
				break;
			}
		}
		
	}
	
	private static boolean isprime (int num) {
		
		for(int i=2; i< num ;i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		twoprime(num);
		
		
		sc.close();

	}
}
