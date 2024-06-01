package com.handson;

import java.util.Scanner;

public class NumberOf1Bits {

	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		String number = Integer.toBinaryString(num);
		
		int count =0;
		
		for(char c : number.toCharArray() ) {
			if(c =='1') {
				count++;
			}
		}
		System.out.print("bits in given number "+ count);
		
		
		sc.close();

	}
}
