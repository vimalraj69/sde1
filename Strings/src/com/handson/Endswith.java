package com.handson;

import java.util.Scanner;

public class Endswith {
	static void checkEnd( String word) {
		
		String res = word.endsWith("ly") ? "true" : "false";
		
		System.out.print(res);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String word =sc.next();
		checkEnd( word);
		sc.close();
	}
}
