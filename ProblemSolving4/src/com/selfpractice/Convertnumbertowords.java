package com.selfpractice;

import java.util.Scanner;

public class Convertnumbertowords {
	static String units [] = {
			"","One","Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
	        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
	};
	static final String[] tens = {
	        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	    };
	
	public static String convert(String s) {
		int n = Integer.valueOf(s);
		
		if(n<1000) {
			return helper(n);
		}
		String ans="";
		if(n>1000) {
			ans = helper(n/1000) +" Thousand";
		}
		if(n % 1000 != 0) {
			ans+=" "+ helper(n % 1000);
		}
		return ans;
	}
	
	public static String helper(int n) {
		if(n<20) {
			return units[n];
		}
		
		if(n<100) {
			return tens[n/10]+((n % 10 !=0)? units[n % 10] : "");
		}
		
		
		return units[n/100]+" Hundred" +((n % 100 !=0) ? " " : (tens[n/10]+((n % 10 !=0) ? units[n % 10] : " "))  );
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the String :");
		
		String s =sc.next();
	
		System.out.print("Numbers to words: "+convert(s));
		sc.close();

	}
	
	
}
