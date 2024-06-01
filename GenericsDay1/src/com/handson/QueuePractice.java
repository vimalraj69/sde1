package com.handson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
	public static void main (String args [] ) {
		Queue <Integer> integerq= new LinkedList<>();
		integerq.add(10);
		integerq.add(20);
		integerq.add(30);
		integerq.add(40);
		
		integerq.poll();	
		
		System.out.println("Peek  :"+integerq.peek());
		System.out.println("check empty  :"+integerq.isEmpty());
		System.out.println("Size  :"+integerq.size());
		
		Iterator i = integerq.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Converting to Array :");
		Object arr [] = integerq.toArray();
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		integerq.clear();
		System.out.print("Size :"+integerq.size());

		
	}

}
