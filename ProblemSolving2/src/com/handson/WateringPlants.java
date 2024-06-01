package com.handson;

import java.util.Scanner;

public class WateringPlants {
	static int totalStep (int arr[] , int capacity) {
		
		int i =0;
		int totalstep=0;
		while(true) {
			int step=0;
			int currentCapacity=capacity;
			int j=0;
			while(true) {
				if(j<arr.length && currentCapacity>=arr[j]) {
					step++;
					currentCapacity-=arr[j];
					arr[j]=0;
					j++;
				}else {
					break;
				}
				
				
			}
			if(step == arr.length) {
				totalstep+=step;
				break;
			}else {
				totalstep+=step*2;
			}
			
		}
		return totalstep;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size and elements:");
		
		int n =sc.nextInt();
		int arr[]= new int[n];
		
		for(int i =0; i< n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter capacity:");

		int capacity=sc.nextInt();
		
		System.out.print("totalstep:"+ totalStep(arr,capacity));
		
		
		sc.close();

	}
}
