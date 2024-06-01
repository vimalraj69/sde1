package com.selfpractice;

import java.util.Scanner;

public class SumDigit {
	static void sum( String word) {
		int sum =0;
		
		for(char c : word.toCharArray()) {
			if(Character.isDigit(c)) {
				int a =Character.getNumericValue(c);
				sum+=a;
			}
		}
		System.out.print("Enter the Element :"+sum);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String word =sc.next();
		sum( word);
		sc.close();

	}
}
