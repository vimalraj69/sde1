package com.handson;

import java.util.Scanner;

public class LongestPalindromicSubstring {
	static String  longPalindrome (String s) {
		
		String ans="";
		
		for(int i =0;i< s.length();i++) {
			for(int j =i+1;j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(isPalindrome(sub) && ans.length()<sub.length()) {
					ans=sub;
					
				}
			}
		}
		
		return ans;
	}
	private static boolean isPalindrome(String s) {
		
		int i =0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;j--;
		}
		return true;
	}
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String s =sc.next();
		
		
		
		System.out.print(" palindrome:"+ longPalindrome (s));
		
		
		sc.close();

	}
}
