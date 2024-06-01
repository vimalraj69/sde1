package com.selfpracrice;

import java.util.*;

public class MakeArrayZerobySubtractingEqualAmounts {

	static int makeArrZero(int arr[]) {
		int ans = 0;


		while (true) {
			ans++;
			int min = Integer.MAX_VALUE;
			for (int i : arr) {
				if (i != 0) {
					min = Math.min(min, i);
				}
			}
			int zeroCount = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=0) {
					arr[i] -= min;
					
				}
				if (arr[i] == 0) {
					zeroCount++;
				}
				
			}
			if(zeroCount == arr.length) {
				break;
			}
			
		}

		return ans;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size :");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("makeArrZero:" + makeArrZero(arr));

	}

}
