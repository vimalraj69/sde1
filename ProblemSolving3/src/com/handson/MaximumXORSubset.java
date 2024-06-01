package com.handson;

import java.util.Scanner;

public class MaximumXORSubset {
	
	public static void XorsubSet(int arr[], int num) {
		int max=0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				int ans=arr[i]^arr[j];
				if(ans>max) {
					max=ans;
				}
			}
		}
		System.out.print(max);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.print("Enter array elements: ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}

		XorsubSet(arr,num);
	}

}
