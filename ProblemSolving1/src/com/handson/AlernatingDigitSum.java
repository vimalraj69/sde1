package com.handson;

import java.util.Scanner;

public class AlernatingDigitSum {
	static int alternateDigit(int num1) {
		int ans=0;
		
		int i =1;
		
		String str = String.valueOf(num1);
		String rev="";
		for(char c : str.toCharArray() ) {
			rev =c+rev;
		}
		
		
		
		int num =Integer.valueOf(rev);
		
		while(num !=0) {
			int rem = num % 10;
			
			if( i % 2 != 0) {
				ans+=rem;
				i++;
			}else {
				
				ans-=rem;
				i++;
			}
			num/=10;
		}
		
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print(alternateDigit(num));
		
		sc.close();

	}
}
