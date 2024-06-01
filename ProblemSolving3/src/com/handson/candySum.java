package com.handson;

import java.util.*;
public class candySum {
	
	public static void  candy(int arr[],int n) {
		int candy=n;
		for(int i=0;i<n;i++) {
			if(i==n-1) {
				if(arr[i]>arr[i-1]) {
					candy=candy+1;
				}
			}
			else if(i!=0) {
				if((arr[i]>arr[i-1]) || (arr[i]>arr[i+1])) {
					candy=candy+1;
				}
			}
			else {
				if(arr[i]>arr[i+1]) {
					candy=candy+1;
				}
			}
		}
		System.out.print(candy);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num: ");
		int n=sc.nextInt();
		System.out.print("Enter array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		candy(arr,n);
		
		
	}

}

