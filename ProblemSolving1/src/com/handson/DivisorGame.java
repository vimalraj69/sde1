package com.handson;

import java.util.Scanner;

public class DivisorGame {
	static void game(int num1) {
		
		boolean wins = num1 % 2 ==0 ? true : false ;
		
		System.out.print(wins);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is Alice wins :");
		game(num);
		
		sc.close();

	}
}
