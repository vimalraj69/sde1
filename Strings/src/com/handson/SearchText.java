package com.handson;

import java.util.Scanner;

public class SearchText {
	static void returnCount( String words [] , String word) {
		int count=0;
		
		for(String s : words ) {
			if(s.equals(word) ) {
				count ++;
			}
		}
		System.out.print("occurence of " + word +" is "+count );
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Sentence:");
		
		String words []=sc.nextLine().split(" ");
		
		System.out.println("Enter the word:");
		
		String word = sc.next();
		returnCount(words , word);
		sc.close();

	}
}
