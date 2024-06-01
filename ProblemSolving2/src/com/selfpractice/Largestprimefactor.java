package com.selfpractice;

import java.util.Scanner;

public class Largestprimefactor {
	 
	static int largestPrime(int n ) {
		for(int i=n ; i>0;i--) {
			if(n % i ==0 && isPrime(i)) {
				return i;
			}
		}
		return 1;
		
	}
		private static boolean isPrime(int n) {
			for(int i =2; i< n; i++) {
				if(n % i ==0 ) {
					return false;
				}
			}
			return true;
		}
		
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num: ");
		
		int n =sc.nextInt();

		
		System.out.print("largest prime factor: "+largestPrime(n ));
		sc.close();
	}
}
