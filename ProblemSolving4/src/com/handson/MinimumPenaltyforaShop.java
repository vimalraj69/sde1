package com.handson;

import java.util.Scanner;

public class MinimumPenaltyforaShop {
	static int  minPenalty (String s) {
		
		int min=Integer.MAX_VALUE;
		int hour=0;
		
		for(int i =0; i<s.length();i++) {
			int count=0;
			for(int j =0;j<s.length();j++) {
				if(j<i) {
					if(s.charAt(j)=='N') {
						count++;
					}
				}else {
					if(s.charAt(j)=='Y') {
						count++;
					}
				}
			}
			if(count<min) {
				min=count;
				hour=i;
			}
			
		}
		return hour;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String s =sc.next();
		
		
		
		System.out.print(" minmum time to close the shop :"+ minPenalty (s));
		
		
		sc.close();

	}
}
