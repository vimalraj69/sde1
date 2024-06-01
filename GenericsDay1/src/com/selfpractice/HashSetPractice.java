package com.selfpractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	public static void main (String args []) {
		HashSet<String> stringSet = new HashSet<>();
		stringSet.add("apple");
		stringSet.add("banana");
		stringSet.add("orange");
		stringSet.add("grape");
		HashSet<String> additionalSet = new HashSet<>();
		additionalSet.add("Starberry");
		additionalSet.add("kiwi");
		
		for(String s : additionalSet) {
			stringSet.add(s);
		}
		
		
		HashSet<String> removalSet = new HashSet<>();
        removalSet.add("orange");
        removalSet.add("grape");
        
        stringSet.removeAll(removalSet);
        System.out.println("is Orange present :"+stringSet.contains("Orange"));
        System.out.println("size :"+stringSet.size());
        System.out.println("is Empty :"+stringSet.isEmpty());
        
        Iterator i = stringSet.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals("banana")) {
				i.remove();
			}
		}
		Iterator k = stringSet.iterator();
        while(k.hasNext()) {
			System.out.println(k.next());
		}
        
        Object arr [] = stringSet.toArray();
        
        for(Object o : arr) {
        	System.out.println(o);
        }
		HashSet<String> retainSet = new HashSet<>();
		retainSet.add("apple");
		retainSet.add("kiwi");
		
		stringSet.retainAll(retainSet);
		System.out.println("After retains :");
		Iterator j = stringSet.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}

        
        
        
	}
	


}
