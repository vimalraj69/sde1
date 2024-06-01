package com.handson;

import java.util.*;

public class FlattenALinkedList {

	public static void joinLinkedList(List<LinkedList<Integer>> l) {
		try {
			LinkedList<Integer> ans = new LinkedList<>();

			for (LinkedList<Integer> lList : l) {
				for (int i : lList) {
					ans.add(i);
				}
			}
			
			System.out.print(ans);

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no LinkedLists :");

		int no = sc.nextInt();

		List<LinkedList<Integer>> l = new ArrayList<>();

		for (int i = 0; i < no; i++) {
			System.out.println("Enter the size of the LInkedList :");
			int size = sc.nextInt();
			LinkedList<Integer> lList = new LinkedList();
			for (int j = 0; j < size; j++) {
				lList.add(sc.nextInt());

			}
			l.add(lList);
		}

		joinLinkedList(l);
	}

}
