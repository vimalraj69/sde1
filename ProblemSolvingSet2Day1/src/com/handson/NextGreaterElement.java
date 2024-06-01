package com.handson;

import java.util.*;

public class NextGreaterElement {
	
	public static void MinLen(List<Integer> l1) {
		try {
			List<Integer> ans = new ArrayList<>();
			
			for(int i = 0; i < l1.size(); i++) {
				int count=0;
				for(int j = i+1; j< l1.size(); j++) {
					if(l1.get(i) < l1.get(j)) {
						ans.add(l1.get(j));
						count=1;
						break;
					}
				}
				if(count ==0 ) {
					ans.add(-1);
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
		
		System.out.println("Enter the size of both Arrays:");
		
		int size1 = sc.nextInt();
		
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		
		
		
		
		MinLen(l1);
		
		
	}

}
