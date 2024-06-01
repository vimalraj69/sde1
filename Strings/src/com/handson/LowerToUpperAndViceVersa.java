package com.handson;

import java.util.Scanner;

public class LowerToUpperAndViceVersa {
	
	static String convertCase( String words [] , String word) {
		String ans="";
		for(String s : words ) {
			if( s.equals(word) ) {
				for(int i =0 ;i < s.length(); i++) {
					if(Character.isUpperCase(s.charAt(i))) {
						ans+= Character.toLowerCase(s.charAt(i));
					}else {
						ans+= Character.toUpperCase(s.charAt(i));
					}
				}
				return ans;
			}
		}
		return "word Not present in a Sentence";
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Sentence :");
		
		String words []=sc.nextLine().split(" ");
		System.out.println("Enter the Sentence :");
		
		String word=sc.nextLine();
		
		System.out.print(convertCase(words,word));
		sc.close();

	}
}
