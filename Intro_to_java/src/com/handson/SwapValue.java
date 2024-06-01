package com.handson;

import java.util.Scanner;

/*Suppose the values of variables 'a' and 'b' are 6 and 8 
respectively, write programs to swap the values of the two 
variables.
a. First program by using a third variable
b. Second program without using any third variable 
(use arithmetic operators)
c. Third program using using XOR operator
 * 
 */
public class SwapValue {
	public static void main (String [] args) {
		Scanner read=new Scanner(System.in);
		int a=6;
		int b=8;
		System.out.println("a="+a+" b="+b);
		int temp=a;
		 a=b;
		b=temp;
		System.out.println("Using third variable a="+a+" b="+b);
		a=6;
		b=8;
		a=a + b;
		b=Math.abs(a-b);
		a=Math.abs(a-b);
		
		System.out.println("Wthiout Using third variable a="+a+" b="+b);
		a=6;
		b=8;
		a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("using Xor a="+a+" b="+b);
		read.close();
		
	}
}
