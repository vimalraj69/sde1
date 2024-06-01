package com.handson;

import java.util.Scanner;

public class MinimumOneBitOperationstoMakeIntegersZero {
	static int toZero (int num) {
		
		int ans =0;
		while(num!=0) {
			ans=ans ^ num;
			num=num>>1;
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Minimum no  :"+ toZero(num));
		
		
		sc.close();

	}
}
