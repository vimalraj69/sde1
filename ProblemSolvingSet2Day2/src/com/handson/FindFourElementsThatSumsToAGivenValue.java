package com.handson;

import java.util.*;

public class FindFourElementsThatSumsToAGivenValue {

	public static boolean SubArray(List<Integer> l, int target) {

		try {

			for (int i = 0; i < l.size(); i++) {
				for (int j = i + 1; j < l.size(); j++) {
					for (int k = j + 1; k < l.size(); k++) {
						for (int m = k + 1; m < l.size(); m++) {
							if (l.get(i) + l.get(j) + l.get(k) + l.get(m) == target) {
								return true;
							}
						}
					}
				}
			}

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		return false;

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

			System.out.println(SubArray(l, k));
		}

	}

}
