package com.assessmentNo1;

import java.util.Scanner;

public class TheCelebrityProblem {
	
	static int indexCeleb(int  arr[][]) {
		
		for(int i =0; i< arr.length ; i++) {
			int count =0;
			for(int j =0; j< arr.length ; j++) {
				if(arr[j][i]==1) {
					count++;
				}
			}
			if(count >1) {
				return i;
			}
		}
		return -1;
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter size:");
		int n = sc.nextInt();
		System.out.println("elements:");
		
		int arr[][] =new int [n][n];
		
		for(int i =0 ;i < n; i++) {
			for(int j =0; j< n ; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print("Index of the Celebrity :"+indexCeleb(arr));
		
		
		 
	}

}
