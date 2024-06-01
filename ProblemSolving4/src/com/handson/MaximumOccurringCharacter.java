package com.handson;

import java.util.Scanner;

public class MaximumOccurringCharacter {
	static char  maxRepeating (String s) {
		char ans=' ';
		int maxcount=0;
		for(int  i=0;i< s.length();i++) {
			int count=0;
			for(int j =i+1; j< s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count> maxcount) {
				maxcount=count;
				ans=s.charAt(i);
			}else if (count ==maxcount) {
				if(ans>s.charAt(i)) {
					ans=s.charAt(i);
				}
			}
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String str =sc.next();
		
		System.out.print("max occured:"+ maxRepeating(str));
		
		
		sc.close();

	}
}
