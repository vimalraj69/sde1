package com.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class setofNames {
	static void sortname(String words[]) {
		Arrays.sort(words);
		
		for(String s : words) {
			System.out.print(s+" ");
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the word :");
		
		String words []=sc.nextLine().split(" ");
		sortname(words);
		sc.close();

	}
}
