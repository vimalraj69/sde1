package com.selfpractice;

import java.util.Scanner;

public class Reversingthevowels {
	
	static String  replaceVowels(String  s) {
		String vow = "aeiouAEIOU";
		
		char c[]= s.toCharArray();
		
		int i =0,j=s.length()-1;
		
		boolean first =false,last =false;
		while(i<=j) {
			char c1 =c[i];
			char c2 =c[j];
			if(vow.contains(String.valueOf(c1))) {
				first=true;
			}
			if(vow.contains(String.valueOf(c2))) {
				last=true;
			}
			
			if(first && last) {
				char temp =c[i];
				c[i]=c[j];
				c[j]=temp;
				first =last =false;
			}
			
			
			if(!first) {
				i++;
			}
			if(!last) {
				j--;
			}
		}
		return new String(c);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter Strings:");
		
		String s =sc.nextLine();
	

		System.out.print("CommonPrefix: "+replaceVowels(s));
		sc.close();
	}
}

