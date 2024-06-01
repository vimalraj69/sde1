package com.selfpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LastSubstringinLexicographicalOrder {
	
	static List<String> l = new ArrayList<>();
	
	public static void backtarck (String s, int i , List<String> l, StringBuilder a) {
		if(i>= s.length()) {
			l.add(new String(a));
			return;
		}
		a.append(s.charAt(i));
		backtarck(s, i+1, l, a);
		a.deleteCharAt(a.length()-1);
		backtarck(s,i+1,l,a);

	}
	
	public static String lexMax(List<String> l) {
		String ans="";
		int lex=0;
		for(String s : l) {
			if(s.length() >0 && s.charAt(0)>lex) {
				ans=s;
				lex=s.charAt(0);
			}
		}
		
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String :");
		
		String s =sc.next();
		
		StringBuilder a = new StringBuilder();
		
		backtarck(s,0,l,a);
		
		
		System.out.println();
		System.out.print("Last Substring in Lexicographical Order : "+lexMax(l));
		sc.close();

	}

}
