package com.handson;

import java.util.*;
public class MaxMinHeight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		System.out.print("Enter k: ");
		int k=sc.nextInt();
		System.out.print("Enter w: ");
		int w=sc.nextInt();
		int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
		maxmin(n,k,w,arr);
	}
	static void maxmin(int n,int k,int w,int[] arr) {
		int l=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<w;j++) {
				if(l>n-1) {
					l=0;
				}
				arr[l]++;
				l++;
			}
		}
		Arrays.sort(arr);
		System.out.print(arr[0]);
	}

}

