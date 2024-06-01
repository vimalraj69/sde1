package com.selfpractice;

import java.util.Scanner;

public class occurences {
	static void frequency(String words ) {
		for(int i =0; i<=26; i++) {
			int count=0;
			for(char c : words.toCharArray()) {
				if(Character.isUpperCase(c)) {
					if(i == c-'A') {
						count++;
					}
				}else {
					if(i == c-'a') {
						count++;
					}
				}
			}
			if(count> 0) {
				System.out.println((char)(i+'a') +" "+ count);
			}
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String words =sc.nextLine();
		frequency(words);
		sc.close();

	}
}
