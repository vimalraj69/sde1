package com.handson;

import java.util.Scanner;

public class ReverseBits {
	static int reverse(int n ) {
		return Integer.reverse(n);
		
	}
	
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num:");
		int n=sc.nextInt();
	
		System.out.print("reversed: "+reverse(n));
		sc.close();
	}
}
