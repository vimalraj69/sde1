package com.selfpractice;

import java.util.Scanner;

public class MaximumScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of arr1 : ");
		int n = sc.nextInt();
		System.out.print("Enter arr1 elements : ");
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of arr2 : ");
		int m = sc.nextInt();
		System.out.print("Enter arr2 elements : ");
		int[] arr2 = new int[n];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		int i = 0, j = 0;
		int sum1 = 0, sum2 = 0, ans = 0;
		while (i < n && j < n) {
			if (arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
				continue;
			}
			if (arr1[i] > arr2[j]) {
				sum2 += arr2[j];
				j++;
				continue;
			}
			if (arr1[i] == arr2[j]) {
				ans += Math.max(sum1, sum2);
				ans += arr1[i];
				i++;
				j++;
				sum1 = 0;
				sum2 = 0;
			}
		}
		while (i < n) {
			sum1 += arr1[i];
			i++;
		}
		while (j < m) {
			sum2 += arr2[j];
			j++;
		}
		ans += Math.max(sum1, sum2);
		System.out.println(ans);
		sc.close();
	}

}
