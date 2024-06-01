package com.handson;

import java.util.*;
import java.util.Scanner;

public class LongestCommonSubstring {
	static int maxlen (String s1 , String s2) {
		int max=0; String ans="";
		List<String> l= new ArrayList<>();
		for(int i=0; i<s1.length(); i++) {
			for(int j=i+1; j<= s1.length(); j++) {
				l.add(s1.substring(i,j));
			}
		}
		
		for(int i=0; i<s2.length(); i++) {
			for(int j=i+1; j<= s2.length(); j++) {
				if(l.contains(s2.substring(i,j))) {
//					if(max<s2.substring(i,j).length()) {
//						ans=s2.substring(i,j);
//					}
					max=Math.max(max,s2.substring(i,j).length());
					
				}
			}
		}
		System.out.print(ans);
		return max;
	}
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String str1 =sc.next();
		String str2 =sc.next();
		
		System.out.print("max len : "+ maxlen(str1,str2));
		
		
		sc.close();

	}
}
