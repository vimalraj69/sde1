package com.handson;

import java.util.Scanner;

public class FindFirstPalindromicStringintheArray {
	static String  firstPalindrome (String arr[]) {
		
		for(String s : arr) {
			if(isPalindrome(s)) {
				return s;
			}
		}
		
		return "";
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
		
		String []arr=sc.nextLine().split(" ");
		
		
		
		System.out.print("first palindrome:"+ firstPalindrome(arr));
		
		
		sc.close();

	}
}
