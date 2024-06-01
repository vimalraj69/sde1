package com.handson;

import java.util.Scanner;

public class SpecialNumbers {
	static int splNo (int num) {
		
		String s="02345";
		int i=0;
		int ans=0;
		int count=1;
		while(count<num) {
			int n=i%10;
			String s2= String.valueOf(n);
			if(s.contains(s2)) {
				count++;
				ans=i;
			}
			i++;
		}
		return ans;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is Special No :"+ splNo(num));
		
		
		sc.close();

	}
}
