package com.handson;

import java.util.Scanner;
import java.util.Stack;

public class FindtheclosestPalindrome {
	private static boolean isPalindrome(String s){
		
		int i =0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	
	public static String closest(String s) {
		boolean back=false;
		boolean front =false;
		int backward=Integer.valueOf(s);
		int forward=Integer.valueOf(s);
		while(!back && !front) {
			forward++;
			
			if(isPalindrome(String.valueOf(forward))) {
				front=true;
			}
			backward--;
			if(isPalindrome(String.valueOf(backward))) {
				back=true;
			}
		}
		if(front && back) {
			int ans=Math.min(forward, backward);
			return String.valueOf(ans);
		}
		if(front) {
			return String.valueOf(forward);
		}
		
		return String.valueOf(backward);

		
	}


	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String s =sc.next();
		
		
		
		System.out.print(" Closest Integer:"+ closest (s));
		
		
		
		sc.close();

	}
}
