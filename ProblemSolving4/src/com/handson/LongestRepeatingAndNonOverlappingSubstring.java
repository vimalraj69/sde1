package com.handson;

import java.util.Scanner;

public class LongestRepeatingAndNonOverlappingSubstring {
	
	static String nonOverlapAndReapeat (String s) {
		String ans="-1";
		for(int i =0;i<s.length();i++) {
			for(int j=i+1; j<=s.length(); j++) {
				String sub=s.substring(i,j);
				String rem =s.substring(j);
				if(check(sub,rem)) {
					if(ans.length()<sub.length()) {
						ans=sub;
					}
				}
			}
		}
		return ans;
	}
	
	private static boolean check(String sub, String rem) {
		if(rem.contains(sub)) {
			if(sub.charAt(sub.length()-1)!=rem.charAt(0)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String num =sc.next();
		
		System.out.print("Longest and nonOverlapAndReapeat:"+ nonOverlapAndReapeat(num));
		
		
		sc.close();

	}
}
