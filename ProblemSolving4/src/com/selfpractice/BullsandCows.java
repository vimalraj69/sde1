package com.selfpractice;

import java.util.*;

public class BullsandCows {
	static String hints(String guess , String secret) {
		
		
		
		List<Character > l = new ArrayList<>();
		List<Character > l1 = new ArrayList<>();

		
		for(char c : guess.toCharArray()) {
			l.add(c);
		}
		for(char c : secret.toCharArray()) {
			l1.add(c);
		}
		int bulls=0;
		int cows=0;

		for(int i =0; i< l.size(); i++) {
			
				if(l.get(i)==l1.get(i)) {
					l.set(i,' ');
					l1.set(i,' ');
					bulls++;
				}	
		}
		
		for(char c : l) {
			if(c!=' ') {
				if(l1.contains(c)) {
					cows++;
					l1.remove(Character.valueOf(c));
				}
			}
		}
		return bulls+"A"+cows+"B";

	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Strings :");
		
		String guess =sc.next();
		String secret =sc.next();
		System.out.print("Total Delay: "+hints(guess , secret));
		sc.close();
	}
}
