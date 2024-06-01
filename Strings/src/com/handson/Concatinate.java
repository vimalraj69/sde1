package com.handson;

import java.util.Scanner;

public class Concatinate {
	
	static void concatinate(String str1 , String str2) {
		String ans=str1;
		if(str1.charAt(str1.length()-1) == str2.charAt(0)) {
			ans+=str2.substring(1);
		}else {
			ans+=str2;
		}
		System.out.print("Concatinate :"+ans);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the words :");
		
		String word1 =sc.next();
		String word2 =sc.next();
		concatinate(word1 , word2);
		sc.close();
	}
}
