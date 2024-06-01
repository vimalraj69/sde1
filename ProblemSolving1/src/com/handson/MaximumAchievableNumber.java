package com.handson;

import java.util.Scanner;

public class MaximumAchievableNumber {
	static int ismaxAchivable (int num , int t) {
		
		for (int i =0 ; i< 10000 ; i++ ) {
			int x=i;
			int temp=num;
			 for(int j=0; j<t; j++) {
				 int val =--x;
				 int val1=++temp;
				 
				 if(val ==val1) {
					 System.out.println(temp);
					 return i;				 
				}
			}
			
		}
		return 0;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num and t:");
		
		int num =sc.nextInt();
		int t =sc.nextInt();

		
		System.out.print("max Achivable Number :"+ ismaxAchivable(num,t));
		
		
		sc.close();

	}
}
