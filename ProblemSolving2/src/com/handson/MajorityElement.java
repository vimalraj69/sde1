package com.handson;

import java.util.Scanner;

public class MajorityElement {
	static int maxoccur (int arr []) {
		
		int ans=0;
		
		for(int i =0;i< arr.length; i++) {
			int count=0;
			if(arr[i]!=-1) {
				for(int j=i+1; j< arr.length; j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count>0) {
					ans=arr[i];
				}
			}
			
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int n=sc.nextInt();
		int arr []= new int [n];
		
		for(int i =0; i< n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("max occur:"+ maxoccur(arr));
		
		
		sc.close();

	}
}
