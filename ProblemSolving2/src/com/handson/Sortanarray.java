package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class Sortanarray {
	static void sort (int arr[]) {
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int n=sc.nextInt();
		
		int arr []= new int[n];
		
		for(int i =0; i< n; i++) {
			arr[i]=sc.nextInt();
		}
		
		sort(arr);
		
		
		sc.close();

	}
}
