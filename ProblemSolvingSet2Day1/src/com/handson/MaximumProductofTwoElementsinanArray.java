

package com.handson;

import java.util.*;

public class MaximumProductofTwoElementsinanArray {
	
	public static void maxProduct(List<Integer> l1) {
		int max=0;
		for (int i = 0; i < l1.size(); i++) {
			for (int j = i+1; j <l1.size(); j++) {
				max=Math.max(max,((l1.get(i)-1) * (l1.get(j)-1)));
			}
		}
		
		System.out.print("Maximum Product :"+max);
		
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Arrays:");
		
		int size1 = sc.nextInt();
		
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		
		
		maxProduct(l1);
		
		
	}

}
