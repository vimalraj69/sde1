package com.handson;

import java.util.Scanner;

public class ConsecutiveNumbersSum {
	static int express (int num) {
		int ans=0;
		for (int i =1 ; i< num; i++ ) {
			int count=0;
			for(int j =i; j < num ; j++ ) {
				count+=j;
				if(count == num) {
					ans++;
					break;
				}
			}
		}
		return ans;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Way to Express :"+ express(num));
		
		
		sc.close();

	}
}
