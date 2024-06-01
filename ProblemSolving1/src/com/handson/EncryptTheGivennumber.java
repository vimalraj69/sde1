package com.handson;

import java.util.Scanner;

public class EncryptTheGivennumber {
	static int encrypt (int num) {
		
		int i=1;
		
		int ans=num;
		int j=num;
		
		while (i<j) {
			if( i % 4 ==1 ) {
				if(num > 0) {
					ans *= --num;
				}else {
					break;
				}
				
			}else if ( i % 4 == 2) {
				if(num > 0) {
					ans /= --num;
				}else {
					break;
				}
				
			}else if ( i % 4 == 3) {
				if(num > 0) {
					ans += --num;
				}else {
					break;
				}
			}else if ( i % 4 == 0) {
				if(num > 0) {
					ans -= --num;
				}else {
					break;
				}
			}
			i++;
		}
		return ans;
			
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is Encrypted Number :"+ encrypt(num));
		
		
		sc.close();

	}
}
