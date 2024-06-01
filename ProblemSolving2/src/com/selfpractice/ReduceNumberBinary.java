package com.selfpractice;

import java.util.Scanner;

public class ReduceNumberBinary {
	static int minSteps(String s) {
		int n=s.length()-1;
		int ans=0;
		
		for(int i =0; i<s.length(); i++) {
			ans+=(Character.getNumericValue(s.charAt(n))*Math.pow(2, i));
			n--;
		}
		int count=0;
		while(ans!=1) {
			if(ans % 2 !=0) {
				ans+=1;
			}else {
				ans/=2;
			}
			count++;
		}
		return count;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String:");
		
		String  s =sc.next();
		
		System.out.print("min steps: "+minSteps(s));
		sc.close();
	}
}
