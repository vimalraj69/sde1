package com.handson;

import java.util.Scanner;

public class RansomNote {
	public static void check(String r, String m) {
		try {

			int ransom[] = new int[26];
			int mag[] = new int[26];
			for (char ch : r.toCharArray()) {
				ransom[ch - 'a']++;
			}
			for (char ch : m.toCharArray()) {
				mag[ch - 'a']++;
			}
			boolean check = true;
			for (int i = 0; i < 26; i++) {
				if (mag[i] < ransom[i]) {
					System.out.print(false);
					check = false;
					break;
				}
			}

			if (check) {
				System.out.print(true);
			}

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Strings :");
		String r = sc.next();
		String m = sc.next();

		check(r, m);
	}

}
