package com.handson;

import java.util.Scanner;

public class CountArrayPairsDivisiblebyK {
	
	static int pairs(int arr[] , int k) {
		int count =0;
		for(int i=0 ; i< arr.length ;i++) {
			for(int j=i+1; j< arr.length ; j++) {
				if((arr[i]*arr[j])%k==0 ) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size and elements:");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i =0 ;i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the k :");
		int k= sc.nextInt();
		
		System.out.print("Total pairs :"+pairs(arr ,k));

	}
}
 
