package com.assessmentNo1;

import java.util.Scanner;

public class 	Lengthofthelongestsubstring {
	
	static int lengthLongSubString(String s) {
		
		int len=0;
		
		for(int i =0;i< s.length(); i++) {
			for(int j =i;j <=s.length(); j++) {
				String sub= s.substring(i,j);
				
				if(check(sub)) {
					len=Math.max(len, sub.length());
				}
			}
		}
		
		return len;
	}
	
	private static boolean check(String sub ) {
		
		for(int i =0 ;i< sub.length();i++) {
			for(int j =i+1; j< sub.length(); j++) {
				if(sub.charAt(i)==sub.charAt(j)) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter String :");
		String s = sc.next();
		System.out.print("length of long SubString: "+lengthLongSubString(s));
		
		
		 
	}

}
