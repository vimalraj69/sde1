package com.handson;

import java.util.Scanner;

public class DecodeXORedPermutation {
	static void decode (int arr[]) {
		int ans[]=new int[arr.length+1];
		
	
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size =sc.nextInt();
		int arr []= new int [size];
		
		System.out.print("enter the Elements :");
		
		for(int i =0 ; i< size; i++) {
			arr[i]=sc.nextInt();
		}
		
		 decode(arr);
		System.out.print(3^1);
		
		sc.close();

	}
}
