package com.handson;

import java.util.Scanner;

public class rectangle {
	
	double len;
	double breadth;
	
	public void set(double l , double b) {
		len=l;
		breadth=b;
	}
	public double getArea() {
	  return len * breadth; 
	}
	
	public static void main (String args[]) {
		rectangle r = new rectangle();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the length and breadth :");
		int l =sc.nextInt();
		int b=sc.nextInt();
		
		r.set(l, b);
		
		System.out.print("Area of the reactangle :"+r.getArea());
		sc.close();
	}

}
