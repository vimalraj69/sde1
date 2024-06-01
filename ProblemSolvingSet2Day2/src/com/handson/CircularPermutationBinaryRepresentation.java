package com.handson;

import java.util.*;

public class CircularPermutationBinaryRepresentation {

	public static List<Integer> perumutation(int n , int s) {
		List<Integer> l = new ArrayList<Integer>();
		try {

		
		int i = 0;
		int len = (int) Math.pow(2, n);
		int[] arr = new int[len];
		while (i < len) {
			arr[i] = (i) ^ (i / 2);
			i++;
		}
		boolean add = false;
		for (int num : arr) {
			if (num == s) {
				add = true;
			}
			if (add) {
				l.add(num);
			}
		}
		add = true;
		for (int num : arr) {
			if (num == s) {
				add = false;
			}
			if (add) {
				l.add(num);
			}
		}
		

	}catch(Exception e){
		System.out.print(e.getMessage());	
	}
		return l;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the times :");

		int times = sc.nextInt();
		for (int t = 0; t < times; t++) {
			System.out.print("Enter the s and n:");

			int s = sc.nextInt();
			int n = sc.nextInt();
			

			

			System.out.println(perumutation(s,n));
		}

	}

}
