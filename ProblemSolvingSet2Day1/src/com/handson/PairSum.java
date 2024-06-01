
package com.handson;

import java.util.*;

public class PairSum {
	
	public static void single(List<Integer> l1, int target) {
		try {
			List<List<Integer>> ans = new ArrayList<>();
			
			for (int i =0; i< l1.size(); i++) {
				List<Integer> l = new ArrayList<>();
				for (int j = i + 1; j < l1.size(); j++) {
					
					if (l1.get(i) + l1.get(j) == target ) {
						
						l.add(l1.get(i));
						l.add(l1.get(j));
						ans.add(l);
						
					}
				}
			}
			
			for (List<Integer> l : ans) {
				System.out.println(l.get(0)+" "+l.get(1));
			}

		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		
	}
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size and  Arrays and :");
		
		int size1 = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println(" Target:");
		int target = sc.nextInt();
		
		single(l1 , target);
		
		
	}

}

