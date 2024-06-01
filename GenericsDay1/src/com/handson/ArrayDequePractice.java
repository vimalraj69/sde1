package com.handson;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequePractice {
	public static void main(String args []) {
		Deque <Integer> integerDeque = new ArrayDeque<>();
		integerDeque.add(12);
		integerDeque.add(24);
		integerDeque.add(45);
		integerDeque.add(67);
		integerDeque.add(87);
		integerDeque.add(43);
		
		integerDeque.addFirst(100);
		integerDeque.addLast(200);
		
		System.out.println("firstElement :" + integerDeque.pollFirst());
		System.out.println("LastElement :" + integerDeque.pollLast());
		System.out.println("FirstElement :" + integerDeque.peekFirst());
		System.out.println("LastElement :" + integerDeque.peekLast());
		
		
		System.out.println("isEmpty :" + integerDeque.isEmpty());
		System.out.println("size :" + integerDeque.size());
		
		integerDeque.add(300);
		integerDeque.add(400);
		integerDeque.add(500);
		integerDeque.add(600);
		integerDeque.add(700);
		integerDeque.add(800);
		integerDeque.add(900);
		
		integerDeque.pollFirst();
		System.out.println("size :" + integerDeque.size());
		integerDeque.pollLast();
		System.out.println("size :" + integerDeque.size());
		Iterator i = integerDeque.iterator();
		
//		while(i.hasNext()) {
//			if(i.equals(67)) {
//				System.out.print(i.next()+" Element present in deque");
//			}
//		}
		
		while(i.hasNext()) {
			
				System.out.println(i.next());
			
		}
		
		Object arr [] = integerDeque.toArray();
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		integerDeque.clear();
		
		System.out.println("size :" + integerDeque.size());

	}

}
