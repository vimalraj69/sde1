package com.handson;

import java.util.Scanner;

public class ThreeCopies {
	static void print(String word) {
		
		if(word.length()>1) {
			for(int i =0 ;i< 3; i++) {
				
				System.out.print(word.substring(word.length()-2));
			}
		}else {
			System.out.print("String length should be atleast two");
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  word :");
		
		String word =sc.next();
		print( word);
		sc.close();
	}
}
