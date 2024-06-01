
package com.handson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Qpractice {
	 
	public static void main (String args [] ) {
		Comparator<Integer> descendingOrder = new DescendingOrderComparator();
	
		PriorityQueue <Integer> integerq= new PriorityQueue<>(descendingOrder);
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
	static class DescendingOrderComparator implements Comparator<Integer> {
	    @Override
	    public int compare(Integer o1, Integer o2) {
	        return o2 - o1;
	    }
	}

}

