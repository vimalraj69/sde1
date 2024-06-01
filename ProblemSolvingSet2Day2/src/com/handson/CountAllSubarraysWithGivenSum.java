package com.handson;

import java.util.*;

public class CountAllSubarraysWithGivenSum {

	public static int SubArray(List<Integer> l, int k) {
		int ans=0;
		try {

			for (int i = 0; i < l.size(); i++) {
				int temp=0;
				for (int j = i; j < l.size(); j++) {
					temp+=l.get(j);
					if(temp==k) {
						ans++;
					}else if(temp>k) {
						break;
					}

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

			System.out.print("Enter the k :");

			int k = sc.nextInt();

			System.out.println(SubArray(l, k));
		}

	}

}
