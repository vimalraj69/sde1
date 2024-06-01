package com.handson;

import java.util.*;

public class ZumaGame {

	static int game(String s, String hand) {
		List<Character> li = new ArrayList<>();

		for (char c : hand.toCharArray()) {
			li.add(c);
		}

		int ans = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			int j = i + 1;
			int count = 1;

			while (j < s.length()) {

				if (s.charAt(i) != s.charAt(j)) {

					if (count >= 2 && li.size() > 0) {
						if (li.contains(s.charAt(i))) {
							ans++;
							li.remove(Character.valueOf(s.charAt(i)));
							break;
						}

					}
				}
				count++;
				if (s.charAt(i) == s.charAt(j) && (j == s.length() - 1)) {
					if (count >= 2 && li.size() > 0) {
						if (li.contains(s.charAt(i))) {
							ans++;
							li.remove(Character.valueOf(s.charAt(i)));
							break;
						}

					}
				}

				j++;
			}
		}
		if (ans == 0)
			return -1;
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Strings:");

		String s = sc.next();
		String hand = sc.next();
		System.out.println("Zuma Game :" + game(s, hand));

		sc.close();

	}

}
