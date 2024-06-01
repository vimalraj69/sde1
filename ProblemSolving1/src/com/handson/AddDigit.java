package com.handson;

import java.util.Scanner;

public class AddDigit {
	static int addDigit(int num) {
		
		for(int i=0 ;i< 10000 ;i++) {
			if(num<10) {
				return num;
			}
			int m=num;
			int ans=0;
			while(m!=0) {
				int rem = m%10;
				ans+=rem;
				m/=10;
			}
			num=ans;
		}
		
		return 0;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print(addDigit(num));
		
		sc.close();

	}
}
