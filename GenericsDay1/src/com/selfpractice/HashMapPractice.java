package com.selfpractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	public static void main (String args []) {
		HashMap <String, Integer> wordCountMap = new HashMap<>();
		wordCountMap.put("apple",5);
		wordCountMap.put("banana",8);
		wordCountMap.put("cherry",3);
		wordCountMap.put("date",6);
		wordCountMap.put("grape",4);
		
		HashMap <String, Integer> copymap = new HashMap<>();
		
		copymap.putAll(wordCountMap);
		System.out.println("Value of Date is: "+wordCountMap.get("date"));
		wordCountMap.remove("cherry");
		
		System.out.println("Contains Key: "+wordCountMap.containsKey("banana"));
		System.out.println("Contains Value: "+wordCountMap.containsValue(4));
		System.out.println("Size: "+wordCountMap.size());
		
		for(Entry<String,Integer> e : wordCountMap.entrySet()) {
			System.out.println("Key :"+e.getKey()+" Value :"+e.getValue());
		}
		Set<String> keys = wordCountMap.keySet();
		for(String  i : keys) {
			System.out.println("Keys :"+i);
		}
		Collection <Integer> val = wordCountMap.values();
		
		for(Integer  i : val) {
			System.out.println("Values :"+i);
		}

		
	}

}
