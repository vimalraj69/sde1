package com.handson;

import java.util.Scanner;

public class SubarraysWithEqual012 {
	static int count(int arr[]) {
		int ans=0;
		for(int i =0 ;i< arr.length-2; i++) {
			boolean one=false,two=false,zero=false;
			int count=0;
			for(int j =i; j<i+3; j++) {
				if(arr[j]==0) {
					count++;
					zero=true;
				}
				if(arr[j]==1) {
					count++;
					one=true;
				}
				if(arr[j]==2) {
					count++;
					two=true;
				}
				
			}
			if(count == 3 && one && two && zero) {
				ans++;
			}
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size and elements :");
		int n =sc.nextInt();
		int arr []=new int [n];
		
		for(int i =0;i< n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Total subArrays :"+count(arr));
	}
}
