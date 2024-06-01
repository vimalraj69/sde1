package com.handson;

import java.util.*;

public class ReverseFirstKelementsofQueue {
	static void reverseK(Queue<Integer>  ll, int k) {
		try {
			int arr[] = new int[ll.size()];
					
					for(int i =k-1; i>=0; i--) {
						arr[i]=ll.poll();
					}
					
					for(int j =k; j< arr.length; j++) {
						arr[j]=ll.poll();
					}
					for(int i : arr) {
						System.out.print(i+" ");
					}
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}

		
	}

	public static void main(String args[]) {

		Queue<Integer> ll = new LinkedList<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Size and element:");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int a = sc.nextInt();
			ll.add(a);
		}
		System.out.print("Enter the k:");
		int k = sc.nextInt();
		reverseK(ll,k);
	}

}
