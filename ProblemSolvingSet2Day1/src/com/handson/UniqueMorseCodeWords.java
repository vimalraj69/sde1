package com.handson;

import java.util.*;

public class UniqueMorseCodeWords {

	public static void check(String arr[]) {
		try {
			Map<Character, String> map = new HashMap<>();

			map.put('a', ".-");
			map.put('b', "-...");
			map.put('c', "-.-.");
			map.put('d', "-..");
			map.put('e', ".");
			map.put('f', "..-.");
			map.put('g', "--.");
			map.put('h', "....");
			map.put('i', "..");
			map.put('j', ".---");
			map.put('k', "-.-");
			map.put('l', ".-..");
			map.put('m', "--");
			map.put('n', "-.");
			map.put('o', "---");
			map.put('p', ".--.");
			map.put('q', "--.-");
			map.put('r', ".-.");
			map.put('s', "...");
			map.put('t', "-");
			map.put('u', "..-");
			map.put('v', "...-");
			map.put('w', ".--");
			map.put('x', "-..-");
			map.put('y', "-.--");
			map.put('z', "--..");
			Set<String> l = new HashSet<>();
	        for (String word : arr) {
	            StringBuilder temp = new StringBuilder();
	            for (char c : word.toCharArray()) {
	                temp.append(map.get(c));
	            }
	            l.add(temp.toString());
	        }

	        System.out.print( l.size());
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size and Array :");
		int size = sc.nextInt();
		String arr[] = new String[size];
		
		for(int i = 0; i< size; i++) {
			arr[i]=sc.next();
			}

		check(arr);
	}

}
