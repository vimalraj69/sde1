package com.handson;

import java.util.Scanner;

public class DecodeXor {
	static void decode(int[] num, int n) {
	        int size= num.length + 1;
	        int[] arr = new int[size];
	        arr[0] = n;
	        
	        for (int i = 0; i < num.length; i++) {
	            arr[i+1] = arr[i] ^ num[i];
	        }
	        
	        for(int i : arr) {
	        	System.out.print(i+" ");
	        }
	    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size follwed by elemets:");
		
		int size =sc.nextInt();
		
		int arr []=new int[size];
		
		for(int i=0;i<size ; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter thr num");
		int n =sc.nextInt();

		
		System.out.print("Encodedv:" );
		 decode(arr,n);
		
		
		sc.close();

	}

}
