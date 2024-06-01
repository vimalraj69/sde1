package com.selfpractice;

import java.util.*;

public class SelfCrossing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance array : ");
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextInt();
		}
		int i = 3;
		if (arr[i] >= arr[i - 2] && arr[i - 1] <= arr[i - 3]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		sc.close();
	}

}
