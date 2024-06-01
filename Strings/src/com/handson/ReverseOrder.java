package com.handson;

import java.util.Scanner;

public class ReverseOrder {
	
	static String reverseWord( String words []) {
		String ans ="";
		
		for(String s : words) {
			ans=s+" "+ans;
		}
		
		return ans;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Sentence :");
		
		String words []=sc.nextLine().split(" ");
		
		
		
		
		System.out.print("Reversed the words :" + reverseWord(words));
		sc.close();

	}
}
