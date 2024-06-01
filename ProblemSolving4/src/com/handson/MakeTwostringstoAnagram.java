package com.handson;

import java.util.*;

public class MakeTwostringstoAnagram {
	static int  noOfmoves (String s1, String s2) {
		String largeString="";
		String smallString="";
		List<Character> l= new ArrayList<>();
		if(s1.length()>=s2.length()) {
			largeString =s1;
			smallString=s2;
		}else {
			largeString =s2;
			smallString=s1;
		}
		
		for(char c : largeString.toCharArray()) {
			l.add(c);
		}
		for(char c : smallString.toCharArray()) {
			if(l.contains(c)) {
				l.remove(Character.valueOf(c));
			}
		}
		
		return l.size();
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Strings :");
		
		String s1 =sc.next();
		String s2 =sc.next();
		
		System.out.print("max num of moves :"+ noOfmoves(s1,s2));
		
		
		sc.close();

	}
}
