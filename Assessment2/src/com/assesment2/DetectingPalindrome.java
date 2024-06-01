package com.assesment2;

import java.util.*;

public class DetectingPalindrome {

	public static boolean palindrome(String s) {

		try {

			List<Integer> c = new ArrayList<>(26);
			for(int i =0;i<26;i++) {
				c.add(0);
			}

			for (char ch : s.toCharArray()) {

				int val = c.get(ch-'a');
				c.set(ch-'a', val+1);
			}

			int ones = 0;

			for (int i : c) {
				if (i % 2 != 0) {
					ones++;
				}
			}
			
			if(ones<=1) {
				return true;
			}

		} catch (Exception e) {
			System.out.print(e);
		}

		return false;

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String :");

		String name = sc.next();

		System.out.print("can perumtation of given name is palindrome :" + palindrome(name));

	}

}
