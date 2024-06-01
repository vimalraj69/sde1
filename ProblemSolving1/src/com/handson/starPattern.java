package com.handson;

import java.util.Scanner;

public class starPattern {
	
	public static void main (String args []) {
		Scanner sc =new Scanner (System.in);
		
		System.out.print("Enter the input :");
		
         int size =sc.nextInt();
         
         int arr [] =new int [size];
         
         for(int i =0; i< arr.length ; i++) {
        	 arr[i]=sc.nextInt();
         }
         
		
		
		
		
		for(int k =0; k< arr.length ; k++) {
			for(int i =1; i<= arr[k] ; i++) {
				for(int j =i ; j<=arr[k]; j++) {
					System.out.print(" ");
				}
				for(int j =1 ; j<=(i*2)-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
		
		
		sc.close();
		
	}

}
