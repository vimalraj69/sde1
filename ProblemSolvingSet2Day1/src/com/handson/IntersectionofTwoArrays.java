package com.handson;

import java.util.*;

public class IntersectionofTwoArrays {
	
	public static void set(List<Integer>l1 , List<Integer> l2) {
		Set<Integer> s = new HashSet<>();
		for(int i : l1) {
			for(int j : l2) {
				if(i == j) {
					s.add(i);
				}
			}
		}
		for(int i : s) {
			System.out.print(i+" ");
		}
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of both Arrays:");
		
		int size1 =sc.nextInt();
		int size2=sc.nextInt();
		
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		
		for(int i =0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		for(int i =0; i< size2; i++) {
			l2.add(sc.nextInt());
		}
		
		
		set(l1,l2);
		
		
	}

}
