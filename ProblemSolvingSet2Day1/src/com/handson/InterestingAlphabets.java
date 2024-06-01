package com.handson;

import java.util.Scanner;

public class InterestingAlphabets {
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter n times to Excute: ");
		int times =sc.nextInt();
		
		for(int k=0; k < times; k++) {
			System.out.print("Enter the num :");
			int n = sc.nextInt();
			int m=n;
			
			for (int i = 1; i <= n; i++) {
				 m=m-i;			 
				for (int j =1; j <= i; j++) {
					System.out.print((char)('A'+m)+" ");
					m++;
				}
				System.out.println();
			}
		}
		
	}

}
