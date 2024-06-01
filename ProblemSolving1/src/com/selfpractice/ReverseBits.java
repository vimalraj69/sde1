package com.selfpractice;

import java.util.Scanner;

public class ReverseBits {
	static int reverse(int n ) {
		StringBuilder s = new StringBuilder();
		int i =0;
		while(i<32) {
			int val=n % 2;
			s.insert(0, val);
			n/=2;
			i++;
		}
		s.reverse();
		 int result = 0;
	     int power = 0;
	        
	        for (int j = s.length()- 1;j>= 0; j--) {
	            int digit = s.charAt(j) - '0';
	            result += digit*Math.pow(2, power);
	            power++;
	        }
	        
	        return result;
		
	}
	
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num:");
		int n=sc.nextInt();
	
		System.out.print("reversed: "+reverse(n));
		sc.close();
	}
}
