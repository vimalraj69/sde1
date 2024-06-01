package com.handson;

import java.util.*;

public class TopKFrequentElements {

	public static Set<Integer> LongSubArray(List<Integer> l, int k) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < l.size(); i++) {
			int count =0;
			for (int j = i; j < l.size(); j++) {
				if(l.get(i) == l.get(j)) {
					count++;
				}
			}
			if(count >=k) {
				set.add(l.get(i));
			}
		}

		return set;

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
