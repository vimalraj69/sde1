package com.handson;

import java.util.Scanner;

public class EncryptDecrypt {
	
		
	
	static String encrypt( String word , int key) {
		String encrypt ="";
		
		for(char c : word.toCharArray()) {
			encrypt+=(char)(c+2);
		}
		return encrypt;
		
	}
	
	static String decrypt( String word , int key) {
		String decrypt ="";
		
		for(char c : word.toCharArray()) {
			decrypt+=(char)(c-2);
		}
		return decrypt;
		
	}

	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word and key :");
		
		String word =sc.next();
		int key =sc.nextInt();
		
		System.out.println("Encrypted :"+encrypt(word , key));
		String encrypted=encrypt(word , key);
//		System.out.println("Decrypted :"+decrypt(encrypted , key));

		sc.close();
	}
}
