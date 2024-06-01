package com.handson;



import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteSumDifference {
	static int minSum (int arr1[] , int arr2[]) {
		int min =Integer.MAX_VALUE;
		int n= arr1.length;
		for(int i =0; i< n; i++) {
			int val =arr1[i];
			for(int j =0;j< n; j++) {
				int diff= change(val,j,arr1,arr2);
				
				min=Math.min(min, diff);
			}
		}
		return min;
	}
	
	private static int change(int val, int idx , int arr[],int arr1[]) {
		int ar[]=new int [arr.length];
		for(int i =0; i< ar.length; i++) {
			if(i==idx) {
				ar[i]=val;
			}else {
				ar[i]=arr[i];
			}
		}
		
		int total=0;
		for(int i =0;i<ar.length; i++) {
			total +=Math.abs(ar[i]-arr1[i]);
		}
		return total;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size and elements arr:");
		
		int n =sc.nextInt();
		int arr[]=new int [n];
		for(int i =0; i< n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter size and elements arr1:");
		
		int n1 =sc.nextInt();
		int arr1[]=new int [n1];
		for(int i =0; i< n; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.print("minMax pair sum:"+ minSum(arr,arr1));
		
		
		sc.close();

	}
}

