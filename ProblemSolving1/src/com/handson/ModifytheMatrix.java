package com.handson;

import java.util.Scanner;

public class ModifytheMatrix {
	static void maxtoMinus (int arr[][]) {
		
		for(int i =0 ; i< arr.length;i++) {
			int max=Integer.MIN_VALUE;
			int indexI=0;
			int indexJ=0;
			boolean f= false;
			for(int j =0 ; j< arr.length ; j++) {
				if(max<arr[j][i]) {
					max=arr[j][i];
				}
				if(arr[j][i]==-1) {
					indexI=i;
					indexJ=j;
					f=true;
				}
			}
			if(f) {
				arr[indexJ][indexI]=max;

			}
		}
		
		for(int i =0 ; i< arr.length;i++) {
			
			for(int j =0 ; j< arr.length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int num =sc.nextInt();
		
		int arr[][]=new int [num][num];
		
		System.out.print("Enter the elements of Matrix:");
		
		for(int i =0 ; i< num ; i++) {
			for(int j =0;j< num ; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		maxtoMinus(arr);
		
		
		sc.close();

	}
}
