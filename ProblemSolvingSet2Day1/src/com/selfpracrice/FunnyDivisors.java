package com.selfpracrice;

import java.util.*;

public class FunnyDivisors {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Times :");

		int times = sc.nextInt();

		for (int t = 0; t < times; t++) {
			System.out.println("Enter the size :");

			int n = sc.nextInt();
			int add = 0; 
			System.out.println("Enter the elements :");
			for (int i = 0; i < n; i++) {
				
				
				int a = sc.nextInt();
				if (a % 2 == 0 || a % 3 == 0) {
					add += a;
				}

			}
			System.out.println("Answer given input is " + add);



		}
	}

}
