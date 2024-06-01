package com.selfpractice;

import java.util.Scanner;

public class ValidMountainArray {
	static boolean mountains(int num[]) {
		
		if(num.length<3) {
			return false;
		}
		for(int i =1;i<num.length-1;i++) {
			if(num[i-1]<num[i] && num[i]>num[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size:");
		
		int n =sc.nextInt();
		int arr [] =new int [n];
		System.out.println("Enter the nums:");
		for(int i =0 ;i< n;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.print("Total Delay: "+mountains(arr));
		sc.close();
	}
}
