package com.handson;

import java.util.Scanner;

public class HappyNumber {
	static boolean ishappynum (int num) {
		
		for (int i =0 ; i< 10000 ; i++ ) {
			if(num == 1) {
				return true;
			}
			int m=num;
			int ans=0;
			while (m>0) {
				int rem = m % 10;
				ans+=rem*rem;
				m/=10;
				
			}
			num=ans;
		}
		return false;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is Happy Number :"+ ishappynum(num));
		
		
		sc.close();

	}
}
