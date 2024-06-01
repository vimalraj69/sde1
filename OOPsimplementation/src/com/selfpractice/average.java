package com.selfpractice;

import java.util.Scanner;

public class average {
	
	public int averageNum(int a , int b , int c) {
		int total = a+b+c;
		
		return total/3;
	}
	
	public static void main (String args[]) {
		Scanner s = new Scanner (System.in);
		average avg = new average();
		System.out.print("Enter the 3 nums :");
		int a =s.nextInt();
		int b =s.nextInt();
		int c=s.nextInt();
		System.out.print("Average :"+avg.averageNum(a,b,c));
	}

}
