package com.handson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrixDiagonalSum {
	static int sum (int arr[][]) {
		int ans=0;
		List<Integer> l =new ArrayList<>();
		
		for(int i =0 ; i< arr.length ;i++) {
			for(int j =0; j<arr.length; j++) {
				if(!l.contains(arr[i][j]) && i==j) {
					ans+=arr[i][j];
					l.add(arr[i][j]);
				}
				if(!l.contains(arr[i][j]) && i+j==arr.length-1) {
					ans+=arr[i][j];
					l.add(arr[i][j]);
				}
			}
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		int arr[][]= new int[num][num];
		System.out.print("Enter Elements");
		
		for(int i=0; i< num; i++) {
			for(int j =0 ; j< num; j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.print("Diagonal Total :"+ sum(arr));
		
		
		sc.close();

	}
}
