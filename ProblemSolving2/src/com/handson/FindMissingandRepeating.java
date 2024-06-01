package com.handson;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMissingandRepeating {
	static void missingandrepeat(int arr[]) {
		List<Integer> l= new ArrayList<>();
		int rep =0;
		for(int i =0;i<arr.length;i++) {
			if(!l.contains(arr[i])) {
				l.add(arr[i]);
			}else {
				rep=arr[i];
			}
		}
		Collections.sort(l);
		int m=0;
		for(int i =1;i< arr.length;i++) {
			if(i!=l.get(i-1)) {
				m=i;
				break;
			}
		}
		
		System.out.println("repearing num: "+rep);
		System.out.print("missing num: "+m);

	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num:");
		
		int n =sc.nextInt();
		
		int arr [] = new int [n];
		
		for(int i =0;i< n; i++) {
			arr[i]=sc.nextInt();
		}
		missingandrepeat( arr);
	}
}

