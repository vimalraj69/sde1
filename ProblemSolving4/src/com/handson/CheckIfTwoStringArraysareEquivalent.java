package com.handson;

import java.util.Scanner;

public class CheckIfTwoStringArraysareEquivalent {
	static boolean  isSame (String arr[],String arr1[]) {
		String s1="";
		String s2="";
		for(String s : arr) {
			s1+=s;
		}
		for(String s : arr1) {
			s2+=s;
		}
		
		return s1.equals(s2);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings array1:");
		
		String []arr=sc.nextLine().split(" ");
		
		System.out.println("Enter Strings array2:");
		
		String []arr1=sc.nextLine().split(" ");
		
		
		
		System.out.print("is Same:"+ isSame(arr,arr1));
		
		
		sc.close();

	}
}
