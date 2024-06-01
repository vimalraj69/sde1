
package com.handson;

import java.util.*;

public class SetMismatch {

	public static void setmiss(List<Integer> l1) {
		try {
			List<Integer> ans = new ArrayList<>();

			for (int i = 0; i < l1.size(); i++) {
				for (int j = i + 1; j < l1.size(); j++) {
					if (l1.get(i) == l1.get(j)) {
						ans.add(l1.get(i));
						l1.remove(Integer.valueOf(l1.get(i)));
						break;
					}
				}
			}

			double n = l1.size() + 1;

			n = n * ((n + 1) / 2);

			for (int i : l1) {
				n -= i;
			}
			ans.add((int) n);

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

		setmiss(l1);

	}

}
