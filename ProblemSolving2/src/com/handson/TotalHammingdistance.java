package com.handson;

import java.util.Scanner;

public class TotalHammingdistance {
	
	    static int distance(final int x, final int y) {
	        int xor = x ^ y, distance = 0;

	        while(xor != 0) {
	            if(xor % 2 == 1)
	                distance++;
	            xor = xor >> 1;
	        }

	        return distance;
	    }
	
	
	static int total(int arr []) {
		int total=0;
		for(int i =0 ;i< arr.length ; i++) {
			for(int j=i+1; j< arr.length ; j++) {
				total+= distance (arr[i], arr[j]);
			}
		}
		return total;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elememts:");
		for(int i =0 ;i < size; i++) {
			arr[i]=sc.nextInt()	;	}
		

		
		System.out.println("Totalhamming Distance :"+ total(arr));

		
		sc.close();

	}
}
