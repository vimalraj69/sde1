package com.selfpractice;

import java.util.Arrays;
import java.util.Scanner;

public class PartyofCouple {
	static int onlyOne(int num[]) {
		
		Arrays.sort(num);
		int ans=0;
		for(int i : num) {
			ans^=i;
		}
		return ans;
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

		System.out.print("Single: "+onlyOne(arr));
		sc.close();
	}
}
