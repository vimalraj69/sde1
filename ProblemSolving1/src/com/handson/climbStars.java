package com.handson;

import java.util.Scanner;

public class climbStars {
	static int stairs (int num) {
		
		int arr [] =new int[num +1];
		
		arr[0]=1;
		arr[1]=1;
		
		for(int i =2 ;i<arr.length ;i++) {
			arr[i]=arr[i-2] +arr[i-1];
		}
		return arr[num];
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Total Ways :"+ stairs(num));
		
		
		sc.close();

	}
}
