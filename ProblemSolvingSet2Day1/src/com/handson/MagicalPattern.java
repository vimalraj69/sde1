package com.handson;

import java.util.*;

public class MagicalPattern {
	
	public static void pattern (int n) {
		List<List<Integer>> l = new ArrayList<>();
		
		for(int i =1; i< n*2; i++) {
			List<Integer> list = new ArrayList<>();
			for(int j =1; j< n*2; j++) {
				list.add(n-Math.max(Math.min(i, n*2-i),
						Math.min(j, n*2-j))+1);
			}
			l.add(list);
		}
		
		for(int i =0; i<l.size(); i++) {
			for(int j =0; j<l.get(i).size(); j++) {
				System.out.print(l.get(i).get(j)+" ");
			}
			System.out.println();
		}
			
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num :");
		
		int n = sc.nextInt();
		
		pattern(n);
		
	}

}
