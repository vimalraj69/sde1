package com.handson;

import java.util.Scanner;

public class ChocolateSweetness {
	static int totalCandy (int sweet[],int exp[] ,int x,int y) {
		int count=0;
		for(int i =0;i< sweet.length;i++) {
			if(x>=sweet[i] && y>=exp[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size =sc.nextInt();
		
		int sweet [] =new int [size];
		int exp [] =new int [size];

		
		System.out.println("Enter the sweats:");
		
		for(int i =0;i< sweet.length; i++) {
			sweet[i]=sc.nextInt();
		}
		System.out.println("Enter the exp:");
		
		for(int i =0;i< exp.length; i++) {
			exp[i]=sc.nextInt();
		}
		System.out.println("Enter the X and Y:");
			int x= sc.nextInt();
			int y= sc.nextInt();

		
		System.out.print("total candy:"+ totalCandy(sweet,exp,x,y));
		
		
		sc.close();

	}
}
