package com.selfpractice;

import java.util.Scanner;

public class CountFertilePyramidsinaLand {

	static int countPyramids(int[][] arr) {
		return countPyramids(arr.length - 2, -1, 1, arr) + countPyramids(0, 1, -1, arr);
	}

	static int countPyramids(int start, int inc, int direction, int[][] arr) {
		int n = arr.length, m = arr[0].length, count = 0;
		int[][] memo = new int[n][m];
		for (int i = start; direction == 1 ? i >= 0 : i < n; i += inc) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] > 0) {
					if (pyramidBase(arr, i, j, direction)) {
						memo[i][j] = 1
								+ Math.min(getValue(i + direction, j - 1, memo), getValue(i + direction, j + 1, memo));
						count += memo[i][j];
					}
				}
			}
		}
		return count;
	}

	static boolean pyramidBase(int[][] arr, int i, int j, int side) {
		return getValue(i + side, j - 1, arr) == 1 && getValue(i + side, j, arr) == 1
				&& getValue(i + side, j + 1, arr) == 1;
	}

	static int getValue(int i, int j, int[][] arr) {
		if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length) {
			return 0;

		}
		return arr[i][j];
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row and col and element :");
		int rowsize = sc.nextInt();
		int colsize = sc.nextInt();
		int arr[][] = new int[rowsize][colsize];

		for (int i = 0; i < rowsize; i++) {
			for (int j = 0; j < colsize; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print(countPyramids(arr));
	}

}
