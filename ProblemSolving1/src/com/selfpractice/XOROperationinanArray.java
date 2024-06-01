package com.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class XOROperationinanArray {
	static void xor(int n, int start) {
		
		int arr[]= new int[n];
		for(int i =0;i< n;i++) {
			arr[i]=start+(2*i);
		}
		
		int ans=0;
		
		for(int i : arr) {
			ans^=i;
		}
		System.out.print(ans);
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the n and start:");
		
		int n =sc.nextInt();
		int start=sc.nextInt();

		xor(n,start);
		sc.close();
	}
}
