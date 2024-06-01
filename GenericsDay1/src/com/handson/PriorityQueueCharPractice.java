

package com.handson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueCharPractice {
	 
	public static void main (String args [] ) {
		Comparator<Character> descendingOrder = new ascii();
	
		PriorityQueue <Character> charq= new PriorityQueue<>(descendingOrder);
		charq.add('a');
		charq.add('b');
		charq.add('c');
		charq.add('d');
		charq.add('a');
		
		charq.poll();	
		
		System.out.println("Peek  :"+charq.peek());
		System.out.println("check empty  :"+charq.isEmpty());
		System.out.println("Size  :"+charq.size());
		
		Iterator i = charq.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("Converting to Array :");
		Object arr [] = charq.toArray();
		
		for(Object o : arr) {
			System.out.println(o);
		}
		
		charq.clear();
		System.out.print("Size :"+charq.size());

		
	}
	static class ascii implements Comparator<Character> {
	    @Override
	    public int compare(Character o1, Character o2) {
	        
	        return o1-o2;
	    }
	}

}

