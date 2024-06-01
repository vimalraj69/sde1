package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class SingleNumberII {
	static int singlenum (int arr[]) {
		int ones =0, twos=0;
		for(int i =0;i<arr.length ;i++) {
			ones=(ones ^ arr[i]) & ~ twos;
			twos=(twos ^ arr[i]) & ~ ones;
		}
		return ones;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size =sc.nextInt();
		
		int arr[]=new int [size];
		System.out.print("enter the Elements :");
		for(int i=0;i< size;i++ ) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Single element "+ singlenum(arr));
		
		
		sc.close();

	}
}
