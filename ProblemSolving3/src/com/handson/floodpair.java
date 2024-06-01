package com.handson;

import java.util.Scanner;

public class floodpair {
	static void pair(int arr[],int n) {
		int ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans+=arr[i]/arr[j] % 1000000007;
			}
		}
		System.out.print(ans);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		System.out.print("Enter elements of array: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		pair(arr,n);
	}

}


