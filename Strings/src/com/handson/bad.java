package com.handson;

import java.util.Scanner;

public class bad {
	static void checkBad( String word) {
		if(word.contains("bad") ) {
			if(word.indexOf("bad") ==0 || word.indexOf("bad") ==1 ) {
				System.out.print("true");
			}else {
				System.out.print("false");

			}
		}else {
			System.out.print("false");

		}
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String word =sc.next();
		checkBad( word);
		sc.close();
	}
}
