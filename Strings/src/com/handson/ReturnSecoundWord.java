package com.handson;

import java.util.Scanner;

public class ReturnSecoundWord {
	static void returnSecound( String word []) {
		if(word.length>1) {
			System.out.print(word[1]);
		}else {
			System.out.print("LESS ");
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Sentence:");
		
		String word []=sc.nextLine().split(" ");
		returnSecound(word);
		sc.close();

	}
}
