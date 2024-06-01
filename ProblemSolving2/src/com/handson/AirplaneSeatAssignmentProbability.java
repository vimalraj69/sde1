package com.handson;

import java.util.Scanner;

public class AirplaneSeatAssignmentProbability {
	static double chanceOfSeat(double n ) {
		return 1/n;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Probability of seat:"+ chanceOfSeat(num));
		
		
		sc.close();

	}
}
