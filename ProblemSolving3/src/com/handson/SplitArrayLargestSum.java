package com.handson;

import java.util.Scanner;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the N : ");
		int n=sc.nextInt();
		System.out.print("Enter the k: ");
		int k=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			int max=0;
			int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=k) {
				max=arr[i];
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==k ) {
					max=Math.max(max,arr[i]+arr[j]);
				}
			}
		}
		System.out.println(max);
	
	}

}

