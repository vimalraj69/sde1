package com.handson;

import java.util.*;

public class Diamondofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Times :");
		int times = sc.nextInt();
		List<List<String>> pattern = new ArrayList<>();

		for (int t = 0; t < times; t++) {

			System.out.println("Enter the Num :");
			int n = sc.nextInt();

			for (int i = 0; i <= n / 2; i++) {
				List<String> row = new ArrayList<>();
				int p = 1;
				for (int k = i; k < n / 2; k++) {
					row.add(" ");
				}
				for (int j = 0; j < (i * 2) + 1; j++) {
					if (p > 9) {
						p = p % 9;
					}
					row.add(String.valueOf(p));
					p++;
				}

				pattern.add(row);
			}

			for (int i = (n / 2) - 1; i >= 0; i--) {
				List<String> row = new ArrayList<>();

				int p = 1;
				for (int k = i; k < n / 2; k++) {
					row.add(" ");
				}
				for (int j = 0; j < (i * 2) + 1; j++) {
					if (p > 9) {
						p = p % 9;
					}
					row.add(String.valueOf(p));
					p++;
				}

				pattern.add(row);
			}

			for (List<String> list : pattern) {
				for (String i : list) {
					System.out.print(i);
				}
				System.out.println();
			}

		}

	}

}
