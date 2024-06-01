package com.handson;

import java.util.Scanner;

public class ThekthFactororN {
	static int findFactor (int num, int k) {
		int arr[] = new int[num];
		int index=0;
		for(int i =1; i<=num; i++) {
			if(num % i ==0 ) {
				arr[index++]=i;
			}
		}
		
		return arr[k-1];
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num ans k :");
		
		int num =sc.nextInt();
		int k =sc.nextInt();

		
		System.out.print("The Factor is:"+ findFactor(num, k));
		
		
		sc.close();

	}
}
