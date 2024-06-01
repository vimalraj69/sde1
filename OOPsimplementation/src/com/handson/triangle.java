package com.handson;

import java.util.Scanner;

public class triangle {
	
	int side1;
	int side2;
	int side3;
	
	
	public triangle() {
		side1=3;
		side2=4;
		side3=5;
	}
	public int getperimeter() {
	  return side1+side2+side3; 
	}
	
	public static void main (String args[]) {
		triangle t = new triangle();
		Scanner sc = new Scanner (System.in);
		
		
		
		
		System.out.print("perimeter of triangle:"+t.getperimeter());
	}

}
