package com.handson;

import java.util.Scanner;

public class FibonacciSum {
	static int fibonacciSum (int num) {
		int arr[] = new int [num+1];
		arr[0]=0;
		arr[1]=1;
		int ans=0;
		int mod = 1000000007;
		
		for(int i =2 ; i< arr.length ; i++) {
			arr[i]=arr[i-2]+arr[i-1] % mod;
			
			
		}
		for(int i : arr) {
			ans+=i;
		}
		
		return ans;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Fibonaci num :"+ fibonacciSum(num));
		
		
		sc.close();

	}
}
