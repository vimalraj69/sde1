package com.handson;

import java.util.Scanner;

public class OnefulPairs {
	static String isPair (int a, int b) {
		
		int val=(a+b)+(a*b);
		if(val==111) {
			return "Yes";
		}
		return "No";
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter nums a and b:");
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		System.out.print("is OneFul Pair:"+ isPair(a,b));
		
		
		sc.close();

	}
}
