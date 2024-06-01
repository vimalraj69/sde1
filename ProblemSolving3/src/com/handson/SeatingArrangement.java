package com.handson;

import java.util.Scanner;

public class SeatingArrangement {
	static int arrangement (int n, int r) {
		
		int ans=factorial(n)/(factorial(r)*factorial(n-r));
		return ans;
		
	}
	
	static int factorial(int n) {
		int ans=1;
		for(int i =1; i<=n; i++) {
			ans*=i;
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter n ans r :");
		
		int c =sc.nextInt();
		int r =sc.nextInt();

		
		System.out.print("The possible Arrangement:"+ arrangement(c, r));
		
		
		sc.close();

	}
}
