package com.handson;

import java.util.*;

public class SortCharactersByFrequency {
	
	static StringBuilder order(String s) {
		SortedMap<Character,Integer> map = new TreeMap<>();
		
		for(char c : s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int val = map.get(c);
				map.put(c, val+1);
			}
		}
		StringBuilder ans = new StringBuilder();
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			int times = m.getValue();
			
			for(int i =0; i< times;i++) {
				ans.append(m.getKey());
			}
		}
		
		return ans;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Strings:");

		String s = sc.next();

		System.out.println("sorted:" + order(s));

		sc.close();

	}

}
