package com.selfpractice;

import java.util.Scanner;

public class TransposeMatrix {
	static void transpose(int num[][]) {
		
		int arr[][]=new int[num.length][num.length];
		
		int col=0;
		for(int i =0; i< arr.length;i++) {
			int row=0;
			for(int j=0;j< arr.length ; j++) {
				arr[row][col]=num[i][j];
				row++;
			}
			col++;
		}
		
		for(int i =0;i< num.length;i++) {
			for(int j =0;j< num.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size:");
		
		int n =sc.nextInt();
		int arr [][] =new int [n][n];
		System.out.println("Enter the nums:");
		for(int i =0 ;i< n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}

		transpose(arr);
		sc.close();
	}
}
