package com.selfpracrice;

import java.util.LinkedList;
import java.util.*;

public class IntersectionofTwoLinkedLists {
	
	 static int intersection(LinkedList<Integer> l1 , LinkedList<Integer>l2) {
		
		 for(int i : l1) {
			 if(l2.contains(i)) {
				 return i;
			 }
		 }
		 return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		LinkedList<Integer> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
		System.out.print("Enter the elements :");
		
		while(true) {
			int a = sc.nextInt();
			if(a>-1) {
				l1.add(a);
			}else {
				break;
			}
		}
		
		while(true) {
			int a = sc.nextInt();
			if(a>-1) {
				l2.add(a);
			}else {
				break;
			}
		}
		while(true) {
			int a = sc.nextInt();
			if(a>-1) {
				l1.add(a);
				l2.add(a);
			}else {
				break;
			}
		}
		
		System.out.print(intersection(l1,l2));
		
	}

}
