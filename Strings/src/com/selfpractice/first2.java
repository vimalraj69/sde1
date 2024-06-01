package com.selfpractice;

import java.util.Scanner;

public class first2 {
	static void firstTwo(String word) {
		
		if(word.length()>2) {
			System.out.print(word.substring(0,2));
		}else if(word.length()==1) {
			System.out.print(word+"@");
		}else {
			System.out.print("@@");
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String word=sc.nextLine();
		firstTwo(word);
		sc.close();

	}
}
