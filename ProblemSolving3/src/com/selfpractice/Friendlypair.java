package com.selfpractice;

import java.util.Scanner;

public class Friendlypair {

	public static String isPair(int n, int m) {
		int div_n = 0;
		int div_m = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				div_n += i;
			}
		}
		for (int i = 1; i <= m; i++) {
			if (m % i == 0) {
				div_m += i;
			}
		}

		return (div_n % n) == (div_m % m) ? "Yes" : "No";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number n and m :");
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.print(isPair(n, m));

	}

}
