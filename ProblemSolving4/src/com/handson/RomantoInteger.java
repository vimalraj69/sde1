package com.handson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomantoInteger {
	static HashMap<Character,Integer> map = new HashMap<>();

	
	
	static int roamantoInt (String s) {
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int res=0;
		for(int i =0;i<s.length(); i++) {
			int current =map.get(s.charAt(i));
			if(i<s.length()-1 && current<map.get(s.charAt(i+1))) {
				res-=current;
			}else {
				res+=current;
			}
		}
		return res;
	}
	
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String num =sc.next();
		
		System.out.print("Longest and nonOverlapAndReapeat:"+ roamantoInt(num));
		
		
		sc.close();

	}
}
