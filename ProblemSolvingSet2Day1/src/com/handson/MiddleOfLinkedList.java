package com.handson;

import java.util.*;

public class MiddleOfLinkedList {

	public static void midLinkedList(LinkedList<Integer> l) {
		try {
			
			System.out.print(l.subList(l.size()/2, l.size()));

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);


		

		LinkedList<Integer> l = new LinkedList<>();
		System.out.println("Enter the size of the LInkedList :");
		int no = sc.nextInt();
		for (int i = 0; i < no; i++) {
			
		l.add(sc.nextInt());		
		}

		midLinkedList(l);
	}

}
