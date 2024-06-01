package com.selfpractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStringPractice {
	public static void main (String args []) {
		TreeSet <String> stringSet = new TreeSet <>();
		stringSet.add("apple");
		stringSet.add("banana");
		stringSet.add("cherry");
		stringSet.add("date");
		stringSet.add("kiwi");
		stringSet.add("orange");
		
		stringSet.add("grape");
		stringSet.remove("date");
		System.out.println("Banana is present :"+stringSet.contains("banana"));
		System.out.println("size :"+stringSet.size());
		
		Iterator i = stringSet.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Lowest element :"+stringSet.first());
		System.out.println("Highest element :"+stringSet.last());
		System.out.println("pollFirst element :"+stringSet.pollFirst());
		System.out.println("pollLast element :"+stringSet.pollLast());

		
		
		
	}

}
