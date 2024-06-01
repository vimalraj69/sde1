package com.handson;

import java.util.Scanner;

public class CountTotalSetbits {
	static int count (int num) {
		
		int ans=0;
		
		for(int i =1; i<=num ; i++) {
			ans+=Integer.bitCount(i);
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("total bitcount:"+ count(num));
		
		
		sc.close();

	}
}
