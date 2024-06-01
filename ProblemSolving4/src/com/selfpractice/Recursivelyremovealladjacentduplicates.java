package com.selfpractice;

import java.util.*;

public class Recursivelyremovealladjacentduplicates {
	static String remove(String s) {
		
		StringBuilder ans = new StringBuilder();
		
		for(char c : s.toCharArray()) {
			if(ans.length() >0  && ans.charAt(ans.length()-1)==c) {
				ans.deleteCharAt(ans.length()-1);
			}else {
				ans.append(c);
			}
		}
		return ans.toString();
		

	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String :");
		
		String s =sc.next();
	
		System.out.print("Recursively remove all adjacent duplicates: "+remove(s));
		sc.close();
	}
}
