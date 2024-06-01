package com.handson;

import java.util.*;

public class GroupAnagrams {

	static List<List<String>> group(List<String> l) {

		List<List<String>> ans = new ArrayList<>();

		for (int i = 0; i < l.size(); i++) {
			List<String> sub = new ArrayList<>();
			String current = l.get(i);
			if (!l.get(i).equals("grouped!")) {
				for (int j = i; j < l.size(); j++) {
					if (anagram(current, l.get(j))) {
						sub.add(l.get(j));
						l.set(j, "grouped!");
					}
				}

				if (sub.size() > 0) {
					ans.add(sub);
				}
			}

		}
		return ans;
	}

	static boolean anagram(String s1, String s2) {
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Size and strings :");
		
		int size =sc.nextInt();
		
		List<String> l = new ArrayList<>();
		
		for(int i =0;i<size; i++) {
			l.add(sc.next());
		}
		
		System.out.print("Group Anagrams :" +group(l));
		sc.close();
	}

}
