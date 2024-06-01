package com.selfpractice;

import java.util.Scanner;

public class LongShortLong {
	static void longShortlong( String word1, String word2) {
		
		if(word1.length()>word2.length()) {
			System.out.print(word2+word1+word1);
		}else {
			System.out.print(word1+word2+word1);
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the words :");
				String word1 =sc.next();
				String word2 =sc.next();
		longShortlong( word1,word2);
		  sc.close();
	}
}
