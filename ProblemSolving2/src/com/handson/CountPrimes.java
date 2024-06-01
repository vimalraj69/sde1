package com.handson;

import java.util.Scanner;

public class CountPrimes {
	static int primes (int num) {
		int count=0;
		for(int i = 2; i< num ; i++) {
			if(isprime(i)) {
				count++;
			}
		}
		
		return count++;
	}
	
	private static boolean isprime(int n ) {
		for(int i =2 ; i< n ;i++) {
			if(n % i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("count primes:"+ primes(num));
		
		
		sc.close();

	}
}
