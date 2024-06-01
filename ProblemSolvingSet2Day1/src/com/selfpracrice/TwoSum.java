package com.selfpracrice;

import java.util.*;

public class TwoSum {

	static List<List<Integer>> pairs(List<Integer> l, int target) {

		List<List<Integer>> ansFinal = new ArrayList<>();

		for (int i = 0; i < l.size(); i++) {
			for (int j = i + 1; j < l.size(); j++) {
				if (l.get(i) + l.get(j) == target) {
					List<Integer> ans = new ArrayList<>();

					ans.add(l.get(i));
					ans.add(l.get(j));
					ansFinal.add(ans);
					break;

				}
			}
		}
		
		if(ansFinal.size()==0) {
			List <Integer> li = new ArrayList<>();
			li.add(-1);
			li.add(-1);
			ansFinal.add(li);
		}
		return ansFinal;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the times : ");

		int t = sc.nextInt();

		for (int ti = 0; ti < t; ti++) {
			System.out.print("Enter the size and element :");

			int size = sc.nextInt();

			List<Integer> l = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				l.add(sc.nextInt());
			}
			System.out.print("Enter the target :");

			int k = sc.nextInt();

			System.out.println("All the pairs :" + pairs(l, k));

			
		}
		sc.close();

	}

}
