package com.selfpractice;

import java.util.List;
import java.util.*;

public class Countthenumberofsubarrays {

	public static  int subArrays(int arr[] , int l , int r) {
		int count=0;
		for(int i =0 ;i< arr.length;i++) {
			int sum=0;
			for(int j =i;j<arr.length;j++) {
				 sum +=arr[j];
				 
				 if(sum>l && sum<r) {
					 count++;
				 }
			}
		}
		return count;
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size and element :");

		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the l and r :");
		
		int l =sc.nextInt();
		int r = sc.nextInt();
		System.out.print(subArrays(arr,l,r));
	}

}
