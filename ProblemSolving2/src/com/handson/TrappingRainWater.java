package com.handson;

import java.util.Scanner;

public class TrappingRainWater {
	static int total (int arr[]) {
		int ans=Integer.MIN_VALUE;
		int i=0;
		int j =arr.length-1;
		
		while(i<j) {
			int count=0;
			int occup=0;
			for(int k= i+1; k<j; k++) {
				count++;
				occup+=arr[k];
			}
			int val =Math.min(arr[i], arr[j]);
			ans=Math.max( (count*val)-occup,ans);
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
		
		System.out.print("Trapped water:"+ total(arr));
		
		
		sc.close();

	}
}
