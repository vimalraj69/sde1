package com.handson;

import java.util.Scanner;

public class NumberOfEvenandOddBits {
	static void countBit (int num) {
		
		String str = Integer.toBinaryString(num);
		
		int even =0, odd=0;
		
		for(int i =0 ; i< str.length(); i++) {
			if(i % 2==0 && str.charAt(i)=='1') {
				even++;
			}else if(i % 2 !=0 && str.charAt(i)=='1') {
				odd++;
			}
		}
		System.out.print("["+even+","+odd+"]");
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		countBit(num);
		
		
		sc.close();

	}
}
