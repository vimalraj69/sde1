package com.handson;

import java.util.Scanner;

public class ClosestDivisor {
	static void closesDiff (int num) {
		int min = Integer.MAX_VALUE;
		int a=0;
		int b=0;
		int num1=num+1;
		int num2=num+2;
		for(int i =2; i< num; i++) {
			for(int j=2 ; j<num ;j++) {
				if((i * j ==num1)
					|| i*j==num2) {
					if(min>Math.abs(i-j)) {
						a=i;
						b=j;
						min=Math.abs(i-j);
					}
				}
			}
		}
		
		System.out.print(a+" "+b);
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("The two Integer :");
		 closesDiff(num);
		
		
		sc.close();

	}
}
