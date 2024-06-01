package com.handson;

import java.util.Scanner;

public class Triangleofnumbers {
	static void pattern (int num) {
		
		for(int i =1;i<=num;i++) {
			int k=i;
			for(int s =i; s< num ; s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			k=k-2;
			for(int j=1;j<i;j++) {
				System.out.print(k);
				k--;
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
