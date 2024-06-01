package com.selfpractice;

import java.util.Scanner;

public class CalculateDelayedArrivalTime {
	static int totalDelay(int n , int m) {
		int total =n+m;
		return total % 24;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the arrival and delayed time :");
		
		int arival =sc.nextInt();
		int delayed =sc.nextInt();
		System.out.print("Total Delay: "+totalDelay(arival , delayed));
		sc.close();
	}
}
