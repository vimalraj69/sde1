package com.selfpractice;

import java.util.Scanner;

public class reapeatChar {
	static void reaptTwo( String word) {
		StringBuilder ans= new StringBuilder();
		
		for(char c : word.toCharArray()) {
			ans.append(c);
			ans.append(c);
		}
		
		System.out.print(ans);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  word :");
		
		String word =sc.next();
		reaptTwo( word);

	}
}
