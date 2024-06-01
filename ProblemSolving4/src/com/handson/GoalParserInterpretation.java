package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class GoalParserInterpretation {
	static String goal (String str) {
		String ans="";
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)=='G') {
				ans+="G";
			}else if(i<str.length()-1 && str.charAt(i)=='(' 
					&& str.charAt(i+1)==')' ) {
				ans+="o";
				i++;
			}else if(i<str.length()-1 && (str.charAt(i)=='(' 
					&& str.charAt(i+1)!=')') ||str.charAt(i)==')' ){
				continue;
			}else {
				ans+=str.charAt(i);
			}
		}
		return ans;
	}
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String str =sc.next();
		
		System.out.print("Total stones used : "+ goal(str));
		
		
		sc.close();

	}
}
