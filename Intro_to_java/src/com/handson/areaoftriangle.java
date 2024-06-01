package com.handson;

import java.util.*;

/*Write a Java program to accept 3 sides of triangle from user and 
print area of triangle as an output. (Library method can be used 
to find the square root)
 * 
 */
public class areaoftriangle {
	public static void main(String args[]) {
		Scanner read =new Scanner (System.in);
		System.out.println("Enter the sides :");
		int side1=read.nextInt();
		int side2=read.nextInt();
		int side3=read.nextInt();
		double semi_perimeter=(side1+side2+side3)/2;
		double s=semi_perimeter*(semi_perimeter-side1)*
				(semi_perimeter-side2)*(semi_perimeter-side3);
		
		Double Area=Math.sqrt(s);
		System.out.print("Area of a tringle "+ Area);
	}

}
