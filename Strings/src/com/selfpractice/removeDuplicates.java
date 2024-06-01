package com.selfpractice;

import java.util.Scanner;

public class removeDuplicates {
	static void removeDup(String word) {
		String ans="";
		
		for(char c : word.toCharArray()) {
			if(!ans.contains(String.valueOf(c))) {
				ans+=c;
			}
		}
		System.out.print("Removed Duplicates :"+ ans);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  word :");
		
		String word =sc.next();
		removeDup( word);

	}
}
