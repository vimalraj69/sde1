package com.handson;

import java.util.Scanner;

public class TournamentCount {
	static int totalmatch (int num) {
		
		int totalmatch=0;
		
		while (num >1 ) {
			int match = num/2;
			num = num -match;
			totalmatch+=match;
		}
		
		return totalmatch;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter teams:");
		
		int num =sc.nextInt();
		
		System.out.print("Total Matches :"+ totalmatch(num));
		
		
		sc.close();

	}
}
