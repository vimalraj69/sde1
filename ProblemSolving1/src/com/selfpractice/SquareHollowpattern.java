package com.selfpractice;

import java.util.Scanner;

public class SquareHollowpattern {
	static void pattern(int n ) {
		for(int i =0;i<n;i++) {
			for(int j=0;j<n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num :");
		
		int n =sc.nextInt();
		pattern(n);
		sc.close();
	}
}
