package com.handson;

import java.util.Scanner;

public class Voidofdiamond {
	static void pattern (int arr[]) {
		for(int k =0 ;k< arr.length;k++) {
			int row=0;
			
			if(arr[k] %2 !=0) {
				row=(arr[k]/2)+1;

			}else {
				row=arr[k]/2;
			}
			
			for(int i =1;i<=row; i++) {
				for(int j=i;j<=row;j++) {
					System.out.print("*");
				}
				for(int j=2;j<(i*2)-1;j++) {
					System.out.print(" ");
				}
				for(int j=i;j<=row;j++) {
						if(i ==1 && j ==1) {
							continue;
						}else {
							System.out.print("*");

						}
					
					
				}
				System.out.println("");
			}
			for(int i =2;i<=row; i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int j=i;j<=row-1;j++) {
					System.out.print(" ");
				}
				for(int j=i+1;j<row;j++) {
					System.out.print(" ");
				}
				
				for(int j=1;j<=i;j++) {
					if(i ==row && j ==row) {
						continue;
					}else {
						System.out.print("*");
																																																															
					}
				}
				
				
				
				
				System.out.println("");
			}
		}
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int num =sc.nextInt();
		
		int arr[]=new int [num];
		
		System.out.println("Enter numbers:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		 pattern(arr);
		
		
		sc.close();

	}
}
