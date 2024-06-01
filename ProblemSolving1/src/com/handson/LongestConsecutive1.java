package com.handson;

import java.util.Scanner;

public class LongestConsecutive1 {
	static int count1 (int num) {
		
		String s= Integer.toBinaryString(num);
		
		
		
		int max=Integer.MIN_VALUE;
		
		for(int i =0 ;i< s.length();i++) {
			if(s.charAt(i)=='1') {
				int count=0;
				int j=i;
				while(j < s.length () && s.charAt(j)=='1') {
					count++;
					j++;
				}
				max=Math.max(count, max);
			}
			
		}
		return max;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Consecutive 1's :"+ count1(num));
		
		
		sc.close();

	}
}
