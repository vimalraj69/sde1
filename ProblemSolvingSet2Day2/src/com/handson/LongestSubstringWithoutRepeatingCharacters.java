package com.handson;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	static int longString(String s) {
		int ans = 0;

		for (int i = 0; i < s.length(); i++) {
			int j = i;
			List<Character> l = new ArrayList<>();
			while (j < s.length()) {
				if (!l.contains(s.charAt(j))) {
					l.add(s.charAt(j));
				} else {
					if (ans < l.size()) {
						ans = l.size();
					}
				}
				j++;
			}
		}
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Strings:");

		String s = sc.next();

		System.out.println("long subString :" + longString(s));

		sc.close();

	}

}
