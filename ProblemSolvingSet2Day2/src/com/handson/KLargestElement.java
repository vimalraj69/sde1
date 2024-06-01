package com.handson;

import java.util.*;

public class KLargestElement {

	public static List<Integer> LongSubArray(List<Integer> l, int k) {
		
		try {
			
			Collections.sort(l);

			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}

		return l.subList(l.size()-k,l.size());

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
