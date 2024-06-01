package com.handson;

import java.util.Scanner;

public class HasTrailingZeros {
	static boolean isZero (int nums[]) {
		
		for(int i =0 ; i<nums.length; i++) {
			for(int j=i+1; j<nums.length ; j++) {
				if(isLastZero(nums[i] ^ nums[j])) {
					return true;
				}
			}
		}
		return false;
	}
	static boolean isLastZero(int i) {
		String b =Integer.toBinaryString(i);
		
		if(b.charAt(b.length()-1)=='0') {
			return true;
		}
		return false;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size=sc.nextInt();
		
		int nums[] = new int [size]; 
		
		for(int i =0 ;i< size ; i++) {
			nums[i]=sc.nextInt();
		}
		
		System.out.print(" Trailing:"+ isZero(nums));
		
		
		sc.close();

	}
}
