package com.handson;

import java.util.*;

public class SearchPattern {

	static List<Integer> occur(String text, String pattern) {
		List <Integer> ans = new ArrayList<>();
		for (int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j <= text.length(); j++) {
				String sub =text.substring(i, j);
				if(pattern.equals(sub)) {
					ans.add(i+1);
				}
			}
		}
		
		System.out.println(ans.size());
		return ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the text and pattern :");

		String text = sc.next();
		String pattern = sc.next();

		System.out.print("INDEX OF OCCURENCES :" + occur(text, pattern));
	}

}
