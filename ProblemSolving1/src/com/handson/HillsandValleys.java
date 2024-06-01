package com.handson;

import java.util.Scanner;

public class HillsandValleys {
	static int countHilssandValley (int arr[]) {
		int hill=0;
		int valley=0;
		
		for(int i=1; i< arr.length-1; i++) {
			if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {
				hill++;
			}
		}
		
		for(int i =1 ; i< arr.length; i++) {
			if(arr[i-1]>arr[i]) {
				boolean f= false;
				int j=i;
				while(j<arr.length-1) {
					 if(arr[j]<arr[j+1]) {
						 f=true;
						
					 }
					 j++;
				}
				
				if(f) {
					valley++;
				}
			}
		}
		return hill+valley;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		int arr[]=new int[num];
		
		System.out.print("Enter the elements");
		
		for(int i =0 ; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Total hilss and Valleys :"+ countHilssandValley(arr));
		
		
		sc.close();

	}
}
