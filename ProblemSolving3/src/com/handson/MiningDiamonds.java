package com.handson;

import java.util.*;
public class MiningDiamonds {
	
	public static int Mining(int n,int[] arr) {
		int temp=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			 if(i==0){
				 temp=arr[i]*arr[n-1]*arr[i+1];
				 ans=ans+temp;
			 }
			 else if(i==n-1){
				 temp=1*arr[i-1]*arr[n-1];
				 ans=ans+temp;
			 }
			 else {
				temp=arr[i]*arr[i-1]*arr[i+1];
				ans=ans+temp;
		 }
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		System.out.print("Enter array elements: ");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=Mining(n,arr);
		System.out.print(result);
	}
	
	

}

