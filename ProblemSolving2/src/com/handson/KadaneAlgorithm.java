package com.handson;

import java.util.Scanner;

public class KadaneAlgorithm {
	static int maxsub (int arr []) {
		
		int max=Integer.MIN_VALUE;
		
		for(int i =0;i< arr.length; i++) {
			int add=0;
			for(int j =i; j< arr.length; j++) {
				add+=arr[j];
				max=Math.max(add,max);
			}
			
		}
		return max;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int n=sc.nextInt();
		int arr []= new int [n];
		
		for(int i =0; i< n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("max sub:"+ maxsub(arr));
		
		
		sc.close();

	}
}
