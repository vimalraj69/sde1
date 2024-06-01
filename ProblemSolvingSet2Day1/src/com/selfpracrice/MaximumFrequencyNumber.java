package com.selfpracrice;

import java.util.Scanner;

public class MaximumFrequencyNumber {

	static int maxOccurence(int arr[]) {
		int ans = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				ans = arr[i];
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Times :");

		int times = sc.nextInt();

		for (int t = 0; t < times; t++) {
			System.out.println("Enter the Size :");
			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.print("Max element :" + maxOccurence(arr));

			

		}

		
	}

}
