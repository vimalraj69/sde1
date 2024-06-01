package com.handson;

import java.util.*;
public class PerfectRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row:");
		int row=sc.nextInt();
		System.out.print("Enter col: ");
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
		System.out.print("Enter matrix elements: ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				mat[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		int[] arr=new int[row*2];
		int[] arr1=new int[row*2];
		int k=0;
		int l=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<4;j++) {
				if(j<2) {
					arr[k]=mat[i][j];
					k++;
				}
				else {
					arr1[l]=mat[i][j];
					l++;
				}
			}
		}
		int count=0;
		int d=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==0) {
				d=1;
				System.out.print("false");
				break;
			}
		}
		int count1=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count1++;
				}
			}
			if(count1==0) {
				d=1;
				System.out.print("false");
				break;
			}
		}
		if( d==0) {
			System.out.print("true");	
		}
	}
}

