package com.selfpracrice;

import java.util.*;

public class LastStoneWeight {

	static int lastStone(List<Integer> l) {

		while (l.size() >1) {
			Collections.sort(l);

			int x = l.get(l.size() - 1);
			int y = l.get(l.size() - 2);
			int size = l.size();

			if (x == y && l.size()>1) {
				l.remove(size - 1);
				l.remove(size - 2);
			} else {
				int rem = Math.abs(l.get(l.size() - 1) - l.get(l.size() - 2));
				if(l.size()>1) {
					l.remove(size - 1);
					l.remove(size - 2);
				}
				
				if(rem !=0) {
					l.add(rem);
				}
				

			}
		}
		return l.get(0);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size :");
		
		int size = sc.nextInt();
		System.out.print("Enter the Elements :");
		
		List<Integer> list = new ArrayList<>(size);
		
		for(int i =0; i< size ;i++) {
			list.add(sc.nextInt());
		}
		
		
		System.out.print("The Last Stone :"+lastStone(list));
		
	}

}
