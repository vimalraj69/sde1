package com.selfpracrice;

import java.util.*;

public class SortaStack {

	public static Stack<Integer> stacksort(Stack<Integer> st) {
		int i = st.size();
		sort(st, i);
		return st;
	}

	public static void sort(Stack<Integer> st, int i) {
		if (i ==0) {
			return;
		}

		int temp = st.pop();
		sort(st, i - 1);
		insert(st, temp);
	}

	public static void insert(Stack<Integer> st, int temp) {
		if (st.isEmpty() || (!st.isEmpty() && temp> st.peek())) {
			st.push(temp);
		} else {
			int temp2 = st.pop();
			insert(st, temp);

			st.push(temp2);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the times : ");
		int t = sc.nextInt();

		for (int ti = 0; ti < t; ti++) {
			System.out.print("Enter the size and element :");

			int size = sc.nextInt();

			Stack<Integer> st = new Stack<>();

			for (int i = 0; i < size; i++) {
				st.add(sc.nextInt());
			}
			

			System.out.println("sorted:" );
			Stack ans =stacksort(st);
			
			while(!ans.isEmpty()) {
				System.out.print(ans.pop()+" ");
			}

		}
		sc.close();

	}

}
