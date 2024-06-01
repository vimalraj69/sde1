package com.handson;

import java.util.*;

public class DifferentSubsequencesGCD {
	static List<List<Integer>> list = new ArrayList<>();

	public static void backtrack(List<List<Integer>> list, List<Integer> sub, int i, int arr[]) {
		if (i >= arr.length) {
			list.add(new ArrayList<Integer>(sub));
			return;
		}
		sub.add(arr[i]);
		backtrack(list, sub, i + 1, arr);
		sub.remove(sub.size() - 1);
		backtrack(list, sub, i + 1, arr);
	}

	public static int gcd() {
		Set<Integer> set = new HashSet<>();
		for (List<Integer> l : list) {
			if (l.size() > 0) {
				Collections.sort(l);

				int i = l.get(0);
				while (i > 0) {
					boolean count = true;
					for (int el : l) {
						if (el % i != 0) {
							count = false;
							break;
						}
					}
					if (count) {
						set.add(i);
						break;
					}
					i--;
				}
			}

		}
		return set.size();
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the times:");

		int times = sc.nextInt();
		for (int t = 0; t < times; t++) {
			System.out.print("Enter the size  and element:");

			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			List<Integer> sub = new ArrayList<>();
			backtrack(list, sub, 0, arr);
			System.out.println("Differenct gcd of given Array:" + gcd());
		}

	}

}
