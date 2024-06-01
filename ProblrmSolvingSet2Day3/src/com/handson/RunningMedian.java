package com.handson;

import java.util.*;

public class RunningMedian {

	 

	public static List<Integer> median(int arr[]) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			List<Integer> l = new ArrayList<>();

			for (int j = 0; j <= i; j++) {
				l.add(arr[j]);
			}
			ans.add(helper(l));
		}
		
		return ans;
	}

	public static int helper(List<Integer> l) {
		Collections.sort(l);
		if (l.size() % 2 == 0) {
			return (l.get(l.size() /2) + l.get((l.size()/2)-1))/2;
		}
		
		return l.get(l.size()/2);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the times:");

		int times = sc.nextInt();
		for (int t = 0; t < times; t++) {
			System.out.print("Enter the size  and element:");

			int n = sc.nextInt();

			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.print(median(arr)+" ans");

		}

	}

}
