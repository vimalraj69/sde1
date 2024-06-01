package com.selfpractice;

import java.util.Scanner;

public class Checkforsubsequence {
	
	static int  subSequenceCheck(String  a, String b) {
		
		boolean arr [] = new boolean [a.length()];
		int arrindex=0;
		int strindex=0;
		
		for(char c : b.toCharArray()) {
			if(a.charAt(strindex) == c) {
				strindex ++;
				arr[arrindex++]=true;
			}
			if(strindex == a.length()) {
				break;
			}
		}
		int count=0;
		for(boolean bool : arr) {
			if(bool== true) {
				count++;
			}
		}
		return count == a.length() ? 1 :0;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String a =sc.nextLine();
		String b =sc.nextLine();

		System.out.print("isSubSequence: "+subSequenceCheck(a,b));
		sc.close();
	}
}

