package com.selfpractice;

import java.util.Scanner;

public class RemainingString {
	static String remainStr(String  s , char c ,int count) {
		
		for(int i =0; i< s.length(); i++) {
			char ch =s.charAt(i);
			if(ch == c) {
				count--;
			}
			if(count ==0) {
				if(i<s.length()-1) {
					return s.substring(i+1);
				}
			}
		}
		return "Enmpty String";
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String and char and count:");
		
		String s =sc.nextLine();
		char c =sc.next().charAt(0);
		int count =sc.nextInt();
		System.out.print("Remaing : "+remainStr(s ,c, count));
		sc.close();
	}
}

