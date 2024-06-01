package com.selfpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Occurrencesofgivendigit {
	static void occur(int n, int d ) {
		Map <Character,Integer> map =new HashMap<>();
		
		String s=String.valueOf(n);
		
		for(char c : s.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}else {
				int val =map.get(c);
				map.put(c,val+1);
			}
		}
		
		
		String D=String.valueOf(d);
		System.out.print("Occured :"+map.get(D.charAt(0)));
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the n and d:");
		
		int n =sc.nextInt();
		int d =sc.nextInt();
		occur(n,d);
		sc.close();
	}
}
