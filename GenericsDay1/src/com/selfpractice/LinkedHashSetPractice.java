package com.selfpractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	public static void main (String args []) {
		LinkedHashSet <String> wordSet = new LinkedHashSet<>();
		
		wordSet.add("Dog");
		wordSet.add("Cat");
		wordSet.add("Bird");
		wordSet.add("Fish");
		wordSet.add("Rabbit");
		wordSet.add("turtle");
		
		wordSet.add("horse");
		wordSet.remove("bird");
		System.out.println("contains fist ? :"+wordSet.contains("Fish"));
		System.out.println("is Empty:"+wordSet.isEmpty());
		System.out.println("size:"+wordSet.size());
		
		Iterator i = wordSet.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
//		Object arr [] = wordSet.toArray();
//		
//		for(Object o : arr) {
//			System.out.println(o);
//		}
//		
//		System.out.println("HashCode of a Set :"+wordSet.hashCode());
//		wordSet.clear();
//		System.out.println("size:"+wordSet.size());

		
		
	}
}
