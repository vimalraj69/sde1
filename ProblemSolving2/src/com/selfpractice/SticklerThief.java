package com.selfpractice;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class SticklerThief {
	static int max=Integer.MIN_VALUE;
	 
	static int solveRec(int nums[],int size ) {
		 if(size==0){
	            return nums[0];
	        }
	        if(size<0) return 0;

	        int incl = nums[size] + solveRec(nums, size-2); 
	        int excl = 0 + solveRec(nums, size-1); 

	        return Math.max(incl, excl);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num:");
		
		int n =sc.nextInt();
		int arr[]= new int[n];
		for(int i =0;i< n; i++) {
			arr[i]=sc.nextInt();
		}
		solveRec(arr,0);
		System.out.print(solveRec(arr,arr.length-1));
		sc.close();
	}
}
