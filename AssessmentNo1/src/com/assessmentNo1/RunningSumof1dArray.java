package com.assessmentNo1;

import java.util.Scanner;

public class RunningSumof1dArray {
	
	static void runSum(int arr[]) {
		int ans[]= new int [arr.length];
		
		if(arr.length==1) {
			System.out.print(arr[0]);
			return;
		}
		ans[0]=arr[0];
		
		for(int i =1; i< arr.length; i++) {
			ans[i]= ans[i-1] + arr[i];
		}
		
		for(int i : ans) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size :");
		int n = sc.nextInt();
		int arr [] =new int [n];
		System.out.print("Enter the elements:");
		
		for(int i =0 ;i< n; i++) {
			arr[i]=sc.nextInt();
		}
		 runSum (arr);
	}

}
