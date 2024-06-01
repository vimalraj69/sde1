package com.selfpracrice;

import java.util.*;

public class PathCrossing {

	public static boolean path(String s) {
		List<List<Integer>> ans = new ArrayList<>();

		List<Integer> path = new ArrayList<>(2);
		path.add(0);
		path.add(0);

		for (char c : s.toCharArray()) {

			if (c == 'N') {
				int val = path.get(0);
				path.set(0, val + 1);
				if (!ans.contains(path)) {

					ans.add(new ArrayList(path));
				} else {
					return true;
				}
			}
			if (c == 'S') {
				int val = path.get(0);
				path.set(0, val - 1);
				if (!ans.contains(path)) {
					ans.add(new ArrayList(path));
				} else {

					return true;
				}
			}
			if (c == 'E') {
				int val = path.get(1);
				path.set(1, val + 1);
				if (!ans.contains(new ArrayList(path))) {
					ans.add(path);
				} else {

					return true;
				}
			}
			if (c == 'W') {
				int val = path.get(1);
				path.set(1, val - 1);
				if (!ans.contains(new ArrayList(path))) {
					ans.add(path);
				} else {

					return true;
				}
			}
		}
		return false;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the string :");

		String s = sc.next();

		System.out.println("is path cross :" + path(s));
	}

}
