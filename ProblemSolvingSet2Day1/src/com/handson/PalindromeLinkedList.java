package com.handson;

import java.util.*;

public class PalindromeLinkedList {
	static boolean palindrome(LinkedList<Integer> head) {

		int i = 0;
		int j = head.size() - 1;

		while (i <= j) {
			if (head.get(i) != head.get(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String args[]) {

		LinkedList<Integer> ll = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Size and element:");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int a = sc.nextInt();
			ll.add(a);
		}
		System.out.print(palindrome(ll));
	}

}
