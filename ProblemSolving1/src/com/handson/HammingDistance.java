package com.handson;

import java.util.Scanner;

public class HammingDistance {
	static int distance (int num1 , int num2) {
		
		String s1=Integer.toBinaryString(num1);
		
		String s2 =Integer.toBinaryString(num2);
		
		int n=0;
		
		if(s1.length()>=s2.length()) {
			n=s1.length();
		}else {
			n=s2.length();
		}
		
		int arr1[] = new int [n];
		int arr2[] = new int [n];
		
		int len1=s1.length()-1;
		int len2=s2.length()-1;

		
		for(int i =n-1; i>=0 ; i--) {
			if(len1>=0) {
				arr1[i]= Character.getNumericValue(s1.charAt(len1));
				len1--;
			}
			if(len2>=0) {
				arr2[i]= Character.getNumericValue(s2.charAt(len2));
				len2--;
			}
			
		}
		int ans=0;
		
		
		for(int i =0 ;i<n; i++) {
			if(arr1[i]!= arr2[i]) {
				ans= Math.abs(ans-(i+1));
			}
		}
		
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter numbers:");
		
		int num1 =sc.nextInt();
		
		int num2 =sc.nextInt();

		
		System.out.print("hamming Distance :"+ distance(num1, num2));
		
		
		sc.close();

	}
}
