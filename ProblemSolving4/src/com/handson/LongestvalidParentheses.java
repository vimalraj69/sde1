package com.handson;

import java.util.Scanner;
import java.util.Stack;

public class LongestvalidParentheses {
	static int  longest (String s) {
		int max=0;
		for(int i =0;i< s.length();i++) {
			for(int j=i+1; j<=s.length();j++) {
				String sub=s.substring(i,j);
				if(isValid(sub)) {
					max=Math.max(max, sub.length());
				}
			}
		}
		return max;
		
	}
	private static boolean isValid(String s) {
		Stack<Character> st= new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(st.isEmpty() && c==')') {
				return false;
			}else if(!st.isEmpty() && st.peek()=='(' &&
					c==')') {
				
				st.pop();
			}else {
				st.push(c);
			}
		}
		if(st.size()==0) {
			return true;
		}
		return false;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String s =sc.next();
		
		
		
		System.out.print(" minmum time to close the shop :"+ longest (s));
		
		
		
		sc.close();

	}
}
