package com.handson;

import java.util.*;

public class Deletemiddleelementfromstack {

	public static void removeMidElement(Stack<Integer> s) {
		int n = s.size();

		remove(s, n, 0);
		System.out.println(s);
	}

	private static void remove(Stack<Integer> s, int n, int i) {
		if (n % 2 == 0 && i == n / 2 ) {
			s.pop();
			return;
		}
		if (n % 2 != 0 && i == n / 2 ) {
			s.pop();
			return;
		}

		int temp = s.pop();
		remove(s, n, i + 1);
		s.add(temp);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Times :");
		int times = sc.nextInt();
		
		for (int j = 0; j < times; j++) {
			System.out.print("Enter the size and Stack :");

			int size = sc.nextInt();

			Stack<Integer> s = new Stack<Integer>();

			for (int i = 0; i < size; i++) {
				s.add(sc.nextInt());
			}
			removeMidElement(s);
		}
		
	}

}
