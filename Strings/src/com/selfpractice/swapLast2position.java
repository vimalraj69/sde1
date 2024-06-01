package com.selfpractice;

import java.util.Scanner;

public class swapLast2position {
	static void swap(String word) {
		
		String ans="";
		
		if(word.length()>=2) {
			ans=word.substring(0,word.length()-2);
		}
		
		ans+=word.charAt(word.length()-1);
		ans+=word.charAt(word.length()-2);
		
		System.out.print(ans);
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String word =sc.next();
		swap( word);
		sc.close();

	}
}
