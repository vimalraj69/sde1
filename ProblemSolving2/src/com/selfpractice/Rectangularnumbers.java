package com.selfpractice;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Rectangularnumbers {
	static void pattern(int n) {
		int size= 2*n -1;
		int arr[][] = new int [size][size];
		
		int start=0;
		int end =size-1;
		while(n!=0) {
		for(int i =start ; i<=end ; i++) {
			for(int j =start ; j<= end ; j++) {
				if(i==start || i ==end || j==start || j==end ) {
					arr[i][j]=n;
				}
				
			}
		}
		++start;
		--end;
		--n;
		}
		for(int i=0;i< arr.length;i++) {
			for(int j =0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num :");
		
		int n =sc.nextInt();
		
		pattern(n);
		sc.close();
	}
}
