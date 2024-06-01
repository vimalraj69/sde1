package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class DefanginganIPAddress {
	static String ipAddress (String s) {
		String ans="";
		
		for(char c : s.toCharArray()) {
			if(c=='.') {
				ans+="[.]";
			}else {
				ans+=c;
			}
		}
		return ans;
	}
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String str =sc.next();
		
		System.out.print("is Isomorphic : "+ ipAddress(str));
		
		
		sc.close();

	}
}
