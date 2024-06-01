package com.assesment2;

import java.util.*;

public class countinggoodpair {

	public static int pairs(List<Integer> l) {
		List<List<Integer>> ans = new ArrayList<>();

		try {
			for (int i = 0; i < l.size(); i++) {

				for (int j = i + 1; j < l.size(); j++) {
					List<Integer> sub = new ArrayList<>();
					if (l.get(i) == l.get(j)) {
						sub.add(i);
						sub.add(j);
						if (sub.size() > 0) {
							ans.add(sub);

						}

					}
				}

			}
		} catch(Exception e) {
			System.out.print(e);
		}


		
		return ans.size();

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the list:");

		int size = sc.nextInt();

		System.out.println("Enter the elments :");

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			l.add(sc.nextInt());
		}

		System.out.print("the good pairs total Number :" + pairs(l));

	}

}
