package com.selfpractice;

import java.util.Scanner;

public class MinimizeManhattanDistances {
	static int manhattan(int[][] arr, int i, int j) {
		return Math.abs(arr[i][0] - arr[j][0]) + Math.abs(arr[i][1] - arr[j][1]);
	}

	static int[] maxManhattanDistance(int[][] arr, int rem) {
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE, maxDiff = Integer.MIN_VALUE,
				minDiff = Integer.MAX_VALUE;
		int maxSumIndex = -1, minSumIndex = -1, maxDiffIndex = -1, minDiffIndex = -1;
		for (int i = 0; i < n; i++) {
			if (i != rem) {
				int sum = arr[i][0] + arr[i][1], diff = arr[i][0] - arr[i][1];
				if (sum > maxSum) {
					maxSumIndex = i;
					maxSum = sum;
				}
				if (sum < minSum) {
					minSumIndex = i;
					minSum = sum;
				}
				if (diff > maxDiff) {
					maxDiffIndex = i;
					maxDiff = diff;
				}
				if (diff < minDiff) {
					minDiffIndex = i;
					minDiff = diff;
				}
			}
		}
		int[] result = new int[2];
		return Math.max(maxSum - minSum, maxDiff - minDiff) == maxSum - minSum ? new int[] { maxSumIndex, minSumIndex }
				: new int[] { maxDiffIndex, minDiffIndex };
	}

	 static  int minimumDistance(int[][] arr) {
		int[] m = maxManhattanDistance(arr, -1);
		int[] m1 = maxManhattanDistance(arr, m[0]); // remove mi
		int[] m2 = maxManhattanDistance(arr, m[1]); // remove mj
		return Math.min(manhattan(arr, m1[0], m1[1]), manhattan(arr, m2[0], m2[1]));
	}

	public static void main (String args []) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size and element :");
		int size = sc.nextInt();
		int arr[][] = new int [size][2];
		
		for(int i =0 ;i< size ; i++) {
			arr[i][0]= sc.nextInt();
			arr[i][1]= sc.nextInt();
		}
		System.out.print(minimumDistance(arr));
    }

}
