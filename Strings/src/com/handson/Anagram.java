package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static void isAnagram(String word1 , String word2) {
		char c1[]= word1.toCharArray();
		char c2[]=word2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String str1 = new String(c1);
		String str2 = new String(c2);
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.print("Given words are Anagram");
		}else {
			System.out.print("Not an Anagram");

		}

	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  words :");
		
		String word1 =sc.next();
		String word2 =sc.next();
		isAnagram(word1 , word2);
		sc.close();
	}
}
