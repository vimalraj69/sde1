package com.selfpractice;

import java.util.Scanner;

public class Countwaystoreachthenthstair {
	 static int steps=0;
	static void steps(int n ,int i ) {
		if(i>n ) {
		 return ;
		}else if (n==i) {
			steps++;
		}
		steps(n,i+1);
		steps(n,i+2);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num: ");
		
		int n =sc.nextInt();

		steps(n,0);
		System.out.print("climb the stairs total ways: "+steps);
		sc.close();
	}
}
