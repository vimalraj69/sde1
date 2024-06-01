package com.handson;

import java.util.Scanner;

public class BinaryString {
	static int totalOne (String s) {
		int count=0;
		for(int i =0;i< s.length();i++) {
			for(int  j=i+1; j< s.length(); j++) {
				if(isStartEndOne(s.substring(i,j))) {
					count++;
				}
			}
		}
		return count;
	}
	
	private static boolean isStartEndOne (String s) {
		if(s.charAt(0)=='1' && s.charAt(s.length()-1)=='1') {
			return true;
		}
			return false;
		
	}
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String num =sc.next();
		
		System.out.print("Total substring start and end with one:"+ totalOne(num));
		
		
		sc.close();

	}
}
