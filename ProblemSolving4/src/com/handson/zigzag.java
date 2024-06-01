package com.handson;

import java.util.Scanner;

public class zigzag {
	static String convert(String s, int numRows) {
	        if (numRows == 1 || numRows >= s.length()) {
	            return s;
	        }

	        int len = s.length();
	        String[] rows = new String[numRows];
	        for (int j = 0; j < numRows; j++) {
	            rows[j] = "";
	        }

	        int i = 0;
	        while (i < len) {
	            for (int j = 0; j < numRows && i < len; j++) {
	                rows[j] += s.charAt(i++);
	            }
	            for (int k = numRows - 2; k > 0 && i < len; k--) {
	                rows[k] += s.charAt(i++);
	            }
	        }

	        String res = "";
	        for (String row : rows) {
	            res += row;
	        }
	        return res;
	    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter and string num:");
		
		String  s =sc.next();
		
		int num =sc.nextInt();
		
		System.out.print("converted:"+ convert(s,num));
		
		
		sc.close();

	}
}
