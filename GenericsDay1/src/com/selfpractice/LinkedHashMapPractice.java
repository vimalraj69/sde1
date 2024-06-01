package com.selfpractice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapPractice {
	public static void main (String args []) {
		LinkedHashMap <String, String> map = new LinkedHashMap<>();
		
		map.put("Car", "Sedan");
		map.put("truck", "pickup");
		map.put("motorcycle", "sportbike");
		map.put("van", "minivan");
		map.put("suv", "crossover");
		
		LinkedHashMap <String, String> copyMap = new LinkedHashMap<>();
		
		copyMap.putAll(map);
		
		System.out.println("motorcycle value is :"+map.get("motorcycle"));
		
		map.remove("van");
		System.out.println("check key:"+map.containsKey("suv"));
		System.out.println("check value:"+map.containsValue("pickup"));
		System.out.println("check empty :"+map.isEmpty());
		System.out.println("check size :"+map.size());
		
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println("Key :"+e.getKey()+" value :"+e.getValue());
		}
		
		Set<String> key =map.keySet();
		Collection <String> val =map.values();
		
		for(String s : key) {
			System.out.println("Key :"+s);
		}
		
		for(String s : val) {
			System.out.println("value :"+s);
		}

	}

}
