package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class Medianof2SortedArraysofDifferentSizes {
	static double median (double arr1[],double arr2[]) {
		double ans[]=new double [arr1.length +arr2.length];
		int index=0;
		for(int i =0 ;i<arr1.length;i++) {
			ans[index++]=arr1[i];
			
		}
		
		for(int j =0 ;j <arr2.length;j++) {
			ans[index++]=arr2[j];
			
		}
		
		Arrays.sort(ans);
		
		if(ans.length % 2 !=0) {
			return ans[ans.length/2];
		}else {
			double val=(ans[ans.length/2] +ans[(ans.length/2)-1])/2;
			return val;
		}
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size Array1:");
		
		int size =sc.nextInt();
		
		double arr1[]=new double [size];
		System.out.println("Enter size Array1 elements:");

		for(int i=0;i< size; i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size Array2:");
		
		int size1 =sc.nextInt();
		
		double arr2[]=new double [size1];
		System.out.println("Enter size Array2 elements:");

		for(int i=0;i< size1; i++) {
			arr2[i]=sc.nextInt();
		}
		
		System.out.print("Median:"+ median(arr1,arr2));
		
		
		sc.close();

	}
}
