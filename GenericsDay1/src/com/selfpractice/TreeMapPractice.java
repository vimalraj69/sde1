package com.selfpractice;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {
	public static void main (String args [] ) {
		TreeMap<String, Integer> studentMap =  new TreeMap<>();
		studentMap.put("Alice",20);
		studentMap.put("Bob",20);
		studentMap.put("Charlie",20);
		studentMap.put("Eva",21);
		
		studentMap.remove("Charlie");
		System.out.println("Check bob:"+studentMap.containsKey("Bob"));
		System.out.println("Check empty:"+studentMap.isEmpty());
		System.out.println("size :"+studentMap.size());
		
		for(Map.Entry<String, Integer> e : studentMap.entrySet()) {
			System.out.println("Key :"+e.getKey()+" value: "+e.getValue());
		}
		System.out.println("Maximum key :"+studentMap.lastKey());
		System.out.println("Minimum key :"+studentMap.firstKey());

		System.out.println("pollfirst key :"+studentMap.remove(studentMap.lastKey()));
		System.out.println("pollLast key :"+studentMap.remove(studentMap.firstKey()));
		for(Map.Entry<String, Integer> e : studentMap.entrySet()) {
			System.out.println("Key :"+e.getKey()+" value: "+e.getValue());
		}
	}

}
