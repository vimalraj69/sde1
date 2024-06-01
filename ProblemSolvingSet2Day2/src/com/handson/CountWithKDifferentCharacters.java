package com.handson;

import java.util.*;

public class CountWithKDifferentCharacters {

	static int occur(String s, int k) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			Set<Character> set = new HashSet<>();

			for (int j = i; j < s.length(); j++) {
				set.add(s.charAt(j));
				if(set.size()==k) {
					count++;
					
				}else if (set.size()>k){
					break;
				}
				
			}
			
		}
		return count;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the text and times :");

		String text = sc.next();
		int times = sc.nextInt();

		System.out.print("Times OF OCCURENCES :" + occur(text, times));
		sc.close();
	}

}
