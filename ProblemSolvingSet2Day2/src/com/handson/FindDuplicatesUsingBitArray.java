package com.handson;

import java.util.*;

public class FindDuplicatesUsingBitArray {

	public static List<Integer> DupArray(List<Integer> l) {
		Set<Integer> set = new HashSet<>();
		List<Integer> ans = new ArrayList<>();
		try {

			for(int i : l) {
				if(!set.contains(i)) {
					set.add(i);
				}else {
					ans.add(i);
				}
			}

		} catch (Exception e) {
			System.out.print(e.getMessage());
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

			

			System.out.println(DupArray(l));
		}

	}

}
