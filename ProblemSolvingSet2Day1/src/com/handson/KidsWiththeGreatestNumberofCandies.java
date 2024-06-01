
package com.handson;

import java.util.*;

public class KidsWiththeGreatestNumberofCandies {

	public static void MaxCandies(List<Integer> l1, int extraCandies) {
		try {
			List<Boolean> ans = new ArrayList<>();

			for (int i = 0; i < l1.size(); i++) {
				int count = 0;
				for (int j = 0; j < l1.size(); j++) {
					if (l1.get(i) + extraCandies >= l1.get(j)) {
						count++;
					}
				}
				ans.add(count == l1.size());
			}
			System.out.print(ans);

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size and  Arrays  :");

		int size1 = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i < size1; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Enter the extra Candies");

		int extraCandies = sc.nextInt();

		MaxCandies(l1, extraCandies);

	}

}
