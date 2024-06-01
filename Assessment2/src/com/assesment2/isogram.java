package com.assesment2;

import java.util.*;

class NotAnIsogramException extends Exception {
	NotAnIsogramException(String s) {
		super(s);
	}
}

public class isogram {

	public static boolean enterKey() throws NotAnIsogramException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Key");
		String s = sc.next();
		if (!check(s)) {

			throw new NotAnIsogramException("The secret key is not an Isogram");

		} else {
			System.out.println("The secret key is an Isogram.");
			return true;

		}

	}

	public static boolean check(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String args[]) {
		while (true) {
			try {
				boolean completed = enterKey();

				if (completed) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
