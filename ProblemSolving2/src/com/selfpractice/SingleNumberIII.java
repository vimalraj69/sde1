package com.selfpractice;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class SingleNumberIII {
	static void singles(int arr[]) {
		List<Integer> l = new ArrayList<>();
		
		for(int i :arr) {
			l.add(i);
		}
		Collections.sort(l);
		int first=0;
		for(int i=0; i< l.size()-1; i=i+2) {
			int val=l.get(i) ^ l.get(i+1);
			if(val !=0) {
				first=l.get(i);
				break;
			}
		}
		l.remove(Integer.valueOf(first));
		
		int secound=0;
		
		for(int i : l) {
			secound^=i;
		}
		
		System.out.print(first+" "+secound);
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the arrival and delayed time :");
		
		int n =sc.nextInt();
		int arr[]= new int[n];
		for(int i =0;i< n; i++) {
			arr[i]=sc.nextInt();
		}
		singles(arr);
		sc.close();
	}
}
