package com.handson;

import java.util.Scanner;

public class countandSay {
	
	  static  String countAndSay(int n) {
	        return util2(n);
	    }
	    public static String util2(int n) {
	        StringBuilder ans = new StringBuilder();
	        ans.append("1");
	        for (int i = 2; i <= n; i++) {
	            ans = helper(ans);
	        }
	        return ans.toString();
	    }

	    static StringBuilder helper(StringBuilder prev) {
	        StringBuilder ans = new StringBuilder();
	        int freq = 1;
	        for (int i = 0; i < prev.length(); i++) {
	            if (i == prev.length() - 1 || prev.charAt(i) != prev.charAt(i + 1)) {
	                ans.append(freq);
	                ans.append(prev.charAt(i));
	                freq = 1;
	            } else {
	                freq++;
	            }
	        }
	        return ans;
	    }
	    
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int s =sc.nextInt();
		
		System.out.print("count and say sequence :"+ countAndSay(s));
		
		
		sc.close();

	}
}
