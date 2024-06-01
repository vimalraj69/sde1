package com.selfpractice;

import java.util.Scanner;

public class Kpattern {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the height :");
		
		int k = sc.nextInt();
		
		for(int i =0 ;i< k;i++) {
			for(int j =i; j< k; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1 ;i< k;i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
