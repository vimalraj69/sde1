
package com.handson;

import java.util.*;

public class SingleElementinaSortedArray {
	
	public static void single(List<Integer> l1) {
		try {
			List<Integer> ans = new ArrayList<>();
			
			for(int i : l1) {
				if( !ans.contains(i)) {
					ans.add(i);
				}else {
					ans.remove(Integer.valueOf(i));
				}
			}
			for(int i : ans) {
				System.out.print(i+" ");
			}

		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size and  Arrays:");
		
		int size1 = sc.nextInt();
		
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		
		
		
		
		single(l1);
		
		
	}

}
