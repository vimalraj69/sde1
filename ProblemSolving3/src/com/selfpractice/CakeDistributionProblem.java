package com.selfpractice;

import java.util.Scanner;

public class CakeDistributionProblem {

	static int maxSweetness(int[] arr, int K) {
		int max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
			max += arr[i];
		}
		
		int ans = 0, mid = 0;
		while (min <= max) {
			mid = (min + max) / 2;
			if (checkPossible(mid, arr, K + 1)) {
				ans = mid;
				min = mid + 1;
			} else
				max = mid - 1;
		}
		return ans;
	}

	static boolean checkPossible(int mid, int[] arr, int K) {
		int curr = 0;
		for (int i = 0; i < arr.length; i++) {
			curr += arr[i];
			if (curr >= mid) {
				curr = 0;
				K--;
			}
		}
		if (K <= 0)
			return true;
		return false;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size and element :");
		int size = sc.nextInt();
		int arr[] = new int [size];
		
		for(int i =0 ;i< size ; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.print("Enter the k :");
		int k = sc.nextInt();
		System.out.print(maxSweetness(arr,k));
	}

}
