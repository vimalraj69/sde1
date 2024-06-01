package com.selfpractice;

import java.util.Scanner;

public class OnlyAlphabets {
	static void onlyAlphabets( String word) {
		String ans="";
		
		for(char c : word.toCharArray()) {
			if((c>=65 && c<=90 )|| (c>=97 && c<=122 )) {
				ans+=c;
			}
		}
		System.out.print(ans);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  word :");
		
		String word =sc.next();
		onlyAlphabets( word);
		sc.close();

	}
}
