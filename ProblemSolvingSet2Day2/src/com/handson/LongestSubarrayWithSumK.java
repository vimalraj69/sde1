package com.handson;

import java.util.*;

public class LongestSubarrayWithSumK {

	public static int LongSubArray(List<Integer> l, int k) {

		int ans = 0;

		for (int i = 0; i < l.size(); i++) {
			int j = i;
			int temp = 0;
			while (j < l.size()) {
				temp += l.get(j);
				if (temp == k) {
					ans = Math.max(ans, (j - i) + 1);
					break;
				} else if (temp > k) {
					break;
				}
				j++;
			}
		}

		return ans;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the times :");

		int times = sc.nextInt();
		for (int t = 0; t < times; t++) {
			System.out.print("Enter the size :");

			int size = sc.nextInt();

			List<Integer> l = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				l.add(sc.nextInt());
			}

			System.out.print("Enter the k :");

			int k = sc.nextInt();

			System.out.println(LongSubArray(l, k));
		}
		

	}

}
