package com.handson;

import java.util.Scanner;

public class Butterflystarpattern {
	static void  pattern (int num) {
		for(int i =1;i<=num;i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			for(int j=i; j<num; j++ ) {
				System.out.print(" ");
			}
			for(int j=i; j<num; j++ ) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =2;i<=num;i++) {
			for(int j=i; j<=num; j++ ) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++ ) {
				System.out.print(" ");
			}
			for(int j=2; j<=i; j++ ) {
				System.out.print(" ");
			}
			for(int j=i; j<=num; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
	    pattern(num);
		
		
		sc.close();

	}
}
