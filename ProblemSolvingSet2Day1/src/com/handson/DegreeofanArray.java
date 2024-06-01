package com.handson;

import java.util.*;

public class DegreeofanArray {
	
	public static void MinLen(List<Integer> l1) {
		try {
			int ans=Integer.MAX_VALUE;
			int maxCount=0;
			for (int i =0; i< l1.size(); i++) {
				int count=0;
				int j;
				int temp=0;
				for(j = i+1; j < l1.size(); j++) {
					if(l1.get(i) == l1.get(j)) {
						count++;
						temp=(j-i)+1;
					}
					if(count>maxCount) {
						ans= temp;
						maxCount=count;
					}
				}
				
				
			}
			System.out.println("Min Length of high Degree :"+ans);

		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		
	}
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of  Arrays:");
		
		int size1 = sc.nextInt();
		
		List<Integer> l1 = new ArrayList<>();
		
		for (int i = 0; i< size1; i++) {
			l1.add(sc.nextInt());
		}
		
		
		
		
		MinLen(l1);
		
		
	}

}
