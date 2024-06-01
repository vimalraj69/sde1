package com.selfpractice;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class characterDeque {
	public static void main (String args []) {
		
		Deque <Character> dq= new ArrayDeque<>();
		dq.add('A');
		dq.add('B');
		dq.add('C');
		dq.add('D');
		dq.add('E');
		dq.add('F');
		
		dq.addFirst('X');
		dq.addLast('Y');
		Iterator i = dq.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("first of the queue :"+dq.pollFirst());
		System.out.println("Last of the queue :"+dq.pollLast());
		System.out.println("head of the queue :"+dq.peekFirst());
		System.out.println("head of the queue :"+dq.peekLast());
		int j =0;
		while(i.hasNext()) {
			if(j==3) {
				System.out.println(i.next());
			}
			j++;
		}
		System.out.println("is Empty :"+dq.isEmpty());
		dq.add('G');
		dq.add('H');
		dq.add('I');
		dq.add('J');
		dq.add('K');
		dq.add('L');
		dq.add('M');
		System.out.println("Total  :"+dq.size());
		dq.pollFirst();
		dq.pollLast();
		System.out.println("Total  :"+dq.size());
		
		Iterator r = dq.descendingIterator();
		while(r.hasNext()) {
			System.out.println(r.next());
		}
		
		Object arr [] = dq.toArray();
		
		for (Object o : arr) {
			System.out.println(o);
		}
		dq.clear();
		System.out.println("Total  :"+dq.size());
	}
	

}
