package com.handson;

import java.util.*;
public class ReverseLinkedList {
	static void reverseList(LinkedList<Integer> head) {
	       
		LinkedList<Integer> ans=new LinkedList<Integer>();
		
		for(int i =head.size()-1 ; i>=0 ;i--) {
			ans.add(head.get(i));
		}
		
		System.out.print(ans);
	    }
	
	public static void main (String args []) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size and element:");
		int size =sc.nextInt();
		for(int i =0; i< size; i++) {
			int a =sc.nextInt();
			ll.add(a);
		}
		reverseList(ll);
	}

}
