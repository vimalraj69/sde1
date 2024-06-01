package com.selfpractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQSelfpractice {
	public static void main (String args []) {
		Comparator<Character> c= new ascii();
		PriorityQueue<Character> pq= new PriorityQueue<>(c);
		pq.add('C');
		pq.add('B');
		pq.add('D');
		pq.add('A');
		Iterator i = pq.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("head of the queue :"+pq.poll());
		System.out.println("head of the queue :"+pq.peek());
		System.out.println("is Empty :"+pq.isEmpty());
		System.out.println("Total  :"+pq.size());
		pq.clear();
		System.out.println("Total  :"+pq.size());
		
		
	}
	static class ascii implements Comparator<Character>{

		@Override
		public int compare(Character o1, Character o2) {
			return o1-o2;
		}
		
	}

}
