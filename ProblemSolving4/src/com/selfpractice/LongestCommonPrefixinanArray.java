package com.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefixinanArray {
	
	static String  longCommonPrefix(String  arr[]) {
		
		Arrays.sort(arr);
		
		String s =arr[0];
		
		int i =s.length();
		
		
		while(i>=0) {
			int count=0;
			String temp=s.substring(0,i);
			for(String str : arr) {
				
				if( i<str.length() && str.substring(0,i).contains(temp)) {
					count++;
				}
			}
			if(count == arr.length) {
				return temp;
			}
			i--;
		}
		return "no";
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter Strings:");
		
		String arr[] =sc.nextLine().split(" ");
	

		System.out.println("CommonPrefix: "+longCommonPrefix(arr));
		
		sc.close();
	}
}

