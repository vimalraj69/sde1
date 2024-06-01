package com.selfpracrice;

import java.util.*;

public class GameofNumbers {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Times :");
		
		int times = sc.nextInt();
		
		for(int t =0;t<times; t++) {
			System.out.println("Enter the Num :");

			int n = sc.nextInt();

			int arr[][] = new int[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					if (i == 0 && j == 0) {
						arr[i][j] = 1;
					} else {
						if (j == 0 || i == j) {
							arr[i][j] = i;
						}
					}

				}
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			
		}
		
	}
	}

}
