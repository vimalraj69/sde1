package com.assessmentNo1;

import java.util.Scanner;

public class 	RemoveConsecutiveDuplicates {
	
	static void removeDuplicates(String s) {
		char cache []= new char [s.length()];
		cache[0]=s.charAt(0);
		String ans=String.valueOf(s.charAt(0));
		int index=1;
		
		for(int i =1; i<s.length(); i++) {
			char c =s.charAt(i);
			if(contains(c,cache,index)) {
				ans+=c;
				cache[index++]=c;
			}
		}
		System.out.print(ans);
		
	}
	
	private static  boolean contains(char c, char arr[], int index) {
		
		if(arr[index-1]!=c) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter String :");
		String s = sc.next();
		System.out.print("Dulicates removed:");
		removeDuplicates(s);
		
		 
	}

}
