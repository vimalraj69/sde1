package com.handson;

import java.util.Scanner;

public class ReplaceZ {
	static void replace( String word) {
		
		System.out.print(word.replaceAll("[aeiou]", "z"));
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Word :");
		
		String word =sc.next();
		replace( word);
		sc.close();
	}
}
