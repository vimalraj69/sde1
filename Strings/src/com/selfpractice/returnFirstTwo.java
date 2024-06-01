package com.selfpractice;

import java.util.Scanner;

public class returnFirstTwo {
	static void returnTwo( String word) {
		if(word.length()>2) {
			System.out.print(word.substring(0,2));
		}else {
			System.out.print(word);
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
				String word =sc.next();
		returnTwo( word);
		sc.close();

	}
}
