package com.handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
	public static void main (String args []) {
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("Orange");
		stringList.add("grape");
		
		
		System.out.println("Removed element at 2 :");
		stringList.remove(2);
		System.out.println("Removed element banana :");
		stringList.remove("banana");
		
		for (String s : stringList) {
			System.out.println(s+" ");
		}
		
		System.out.println("Accessing element at 1 :"+ stringList.get(1));
		System.out.println("replacing  element 0 with pear ");
		stringList.set(0, "pear");
		
		boolean found = false;
		
		for(String s : stringList) {
			if(s.equals(s)) {
				found = true;
				break;
			}
		}
		System.out.println("Searching element orange :"+ found);
		int index=0;
		for(int i =0 ; i<stringList.size(); i++) {
			if(stringList.get(i).equals("grape")) {
				index =i;
			}
		}
		System.out.println("Searching element grape index :"+ index);
		
		System.out.println("is List Empty :"+ stringList.isEmpty());
		
		ArrayList <String> newList = new ArrayList<>();
		newList.add("kiwi");
		newList.add("pineapple");
		newList.add("melon");
		
		for(int i =1; i<newList.size(); i++) {
			stringList.add(newList.get(i));
		}
		
		 Iterator<String> myIterator = stringList.iterator();

	        while (myIterator.hasNext()) {
	            String element = myIterator.next();
	            System.out.println(element+" ");
	        }
		
	        List <String > sub = stringList.subList(1, 3);
	        
	        Object[] arr = stringList.toArray();
	        for(Object s  : arr) {
	        	System.out.println(s);
	        }
	        
	        Collections.sort(stringList);
	        
	        Iterator <String> i = stringList.iterator();
	        
	        while(i.hasNext()) {
	        	System.out.println(i.next()+" ");
	        }
	        
	        System.out.println("stringList and newList is Equal"+stringList.equals(newList));
	        System.out.println(stringList.hashCode());
		
		
		class aschiiAddOfFirstChar implements Comparator<String>{
			public int compare(String a ,String b) {
				 return a.charAt(0)+ b.charAt(0);
			}
		}
		aschiiAddOfFirstChar ac = new aschiiAddOfFirstChar();
		System.out.println("Addition of first character :" +ac.compare(stringList.get(0), newList.get(0)));
		System.out.println("StringList Size :"+stringList.size());
		stringList.clear();
		System.out.println("StringList Size :" +stringList.size());

		
	}
}
