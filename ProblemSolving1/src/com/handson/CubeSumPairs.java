package com.handson;

import java.util.Scanner;

public class CubeSumPairs {
	static int cube (int num) {
		int count =0;
		
		int len = (int)Math.cbrt(num)+1;
		
		for (int i = 1; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (Math.pow(i,3) + Math.pow(j,3) == num) {
                    count++;
                    }
                
            }
        }
		return count;
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("Total Ways :"+ cube(num));
		
		
		sc.close();

	}
}
