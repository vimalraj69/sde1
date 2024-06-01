package com.selfpractice;

import java.util.*;

public class MinimumNumberofLamps {
	static int minLamp(String s ) {
		char c []= s.toCharArray();
		int count =0;
		char dp[] = new char [s.length()];
		dp[0]=c[0];
		for(int i =1; i< c.length; i++) {
			if(c[i] != '*' && dp[i-1] !='*' ) {
				dp[i]='*';
				count++;
			}
		}
		return count;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the times :");
		
		int n =sc.nextInt();
		System.out.println("Enter the String :");

		
		for(int i =0; i< n; i++) {
			String s = sc.next();
			System.out.println("Total Delay: "+minLamp(s));

		}
		List<List<Integer>> l = new ArrayList<>();
		List<Integer> li= new ArrayList<>();
		
		li.add(67);
		l.add(li);
		
		
		
		sc.close();
	}
}

