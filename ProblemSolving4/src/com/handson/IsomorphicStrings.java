package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class IsomorphicStrings {
	static int isIsomorphic (String s1 , String s2) {
		int arr1[]= new int [1000];
		int arr2[]=new int [1000];
		for(int i =0;i< s1.length();i++) {
			arr1[s1.charAt(i)]++;
			arr2[s2.charAt(i)]++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i =0;i< 1000; i++) {
			if(arr1[i]!=arr2[i]) {
				return 0;
			}
		}
		
		return 1;
	}
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings:");
		
		String str1 =sc.next();
		String str2 =sc.next();
		
		System.out.print("is Isomorphic : "+ isIsomorphic(str1,str2));
		
		
		sc.close();

	}
}
