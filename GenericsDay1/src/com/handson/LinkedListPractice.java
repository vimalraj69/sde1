package com.handson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListPractice {
	public static void main(String args []) {
		LinkedList integerList = new LinkedList();
		integerList.add(10);
		integerList.add(20);
		integerList.add(30);
		integerList.add(40);
		integerList.add(50);
		integerList.add(60);
		integerList.add(70);
		
		integerList.remove(2);
		integerList.remove(Integer.valueOf(20));
		Iterator i  = integerList.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(integerList.get(1));
		integerList.set(0,50);
		System.out.println("present of  30 is"+integerList.contains(30));

		System.out.println("Index of 40 is"+integerList.indexOf(40));
		System.out.println("List empty or not"+integerList.isEmpty());
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		List sublist = integerList.subList(2, 4);
		
		Object[] arr = sublist.toArray();
		
		System.out.println("List empty or not :"+integerList.size());
		integerList.clear();
		System.out.println("List empty or not :"+integerList.isEmpty());


	}

}
