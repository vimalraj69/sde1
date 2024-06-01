package com.handson;



import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaximumPairSuminArray {
	static int minMaxpair (int arr[]) {
		int ans=Integer.MIN_VALUE;
		Arrays.sort(arr);
		int i =0,j=arr.length-1;
		
		while(i<j) {
			int val =arr[i]+arr[j];
			ans=Math.max(ans, val);
			i++;j--;
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int n =sc.nextInt();
		int arr[]=new int [n];
		for(int i =0; i< n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("minMax pair sum:"+ minMaxpair(arr));
		
		
		sc.close();

	}
}

