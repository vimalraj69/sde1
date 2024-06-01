package com.handson;

import java.util.*;

public class CountDistinctSubstrings {
	
	static int subStrings (String s ) {
		
		int count =0;
		
		List<String> l = new ArrayList<>();
		
		for(int i =0;i< s.length();i++) {
			for(int  j =i; j <= s.length();j++) {
				String sub =s.substring(i,j);
				if(!l.contains(sub)) {
					count++;
					l.add(sub);
				}
			}
		}
		return count;
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the times and Strings:");

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			

			System.out.println("Total subStrings :"+subStrings(s));
			
		}
		sc.close();

	}

}
