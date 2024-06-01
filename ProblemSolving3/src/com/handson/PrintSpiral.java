package com.handson;

import java.util.Scanner;

public class PrintSpiral {
	static void spiral (int arr[][]) {
		
		int firstrow=0;
		int firstcol=0;
		int lastrow=arr.length-1;
		int lastcol=arr[0].length-1;
		
		int i=0;
		
		while(i< arr.length*arr[0].length) {
			for(int j =firstrow; j<=lastcol; j++) {
				System.out.print(arr[firstrow][j]+" ");
				i++;
			}
			firstrow++;
			for(int j=firstrow; j<=lastrow ; j++) {
				System.out.print(arr[j][lastcol]+" ");
				i++;
			}
			lastcol--;
			for(int j=lastcol; j>=firstcol ; j--) {
				System.out.print(arr[lastrow][j]+" ");
				i++;
			}
			lastrow--;
			for(int j=lastrow; j>=firstrow ; j--) {
				System.out.print(arr[j][firstcol]+" ");
				i++;
			}
			firstcol++;
		}
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		int row = sc.nextInt();
		int col =sc.nextInt();
		int arr[][]=new int [row][col];
		
		System.out.print("Enter elements :");
		
		for(int i =0;i< arr.length; i++) {
			for(int j=0;j< arr[i].length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		
		
		
		spiral(arr);
		
		

	}
}
