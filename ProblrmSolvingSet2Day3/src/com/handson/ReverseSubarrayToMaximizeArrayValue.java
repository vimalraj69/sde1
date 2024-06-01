package com.handson;

import java.util.*;

public class ReverseSubarrayToMaximizeArrayValue {

	public static int maximize(List<Integer> l) {

		int n = l.size();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				
				List<Integer> sub = new ArrayList<>();
				
				sub.addAll(l);
				
				int temp = sub.get(i);
				sub.set(i,sub.get(j));
				sub.set(j, temp);
				
				System.out.println(sub);
				
				
			}

		}

		return 0;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of times:");

		int times = sc.nextInt();

		for (int t = 0; t < times; t++) {

			System.out.println("Enter the size :");
			int noOftransaction = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < noOftransaction; i++) {
				list.add(sc.nextInt());
			}
			System.out.println(maximize(list));

		}

	}

}
