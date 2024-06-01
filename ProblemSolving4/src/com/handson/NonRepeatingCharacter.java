package com.handson;

import java.util.Scanner;

public class NonRepeatingCharacter {
	static String  nonRepeating (String s) {
		
		for(int  i=0;i< s.length();i++) {
			int count=0;
			for(int j =i+1; j< s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count==0) {
				return String.valueOf(s.charAt(i));
			}
		}
		return "$";
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String str =sc.next();
		
		System.out.print("non repeating:"+ nonRepeating(str));
		
		
		sc.close();

	}
}
