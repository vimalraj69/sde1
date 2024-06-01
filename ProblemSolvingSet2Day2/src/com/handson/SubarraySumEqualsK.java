package com.handson;

import java.util.*;

public class SubarraySumEqualsK {

	public static int sumEquals(List<Integer> l, int k) {

		int ans = 0;

		for (int i = 0; i < l.size(); i++) {
			int j = i;
			int temp = 0;
			while (j < l.size() ) {
				temp+=l.get(j);
				if(temp ==k) {
					ans++;
					break;
				}else if(temp>k) {
					break;
				}
				j++;
			}
		}

		return ans;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size :");

		int size = sc.nextInt();

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			l.add(sc.nextInt());
		}

		System.out.print("Enter the k :");

		int k = sc.nextInt();

		System.out.print(sumEquals(l, k));

	}

}
