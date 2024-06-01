package com.handson;
/*Write a Java program to detect if two integers have opposite signs 
or not. Don’t use relational operator
 * 
 */
import java.util.*;
public class OppositeSign {
	public static void main(String args[]) {
		Scanner read= new Scanner (System.in);
		
		int num1=read.nextInt();
		int num2=read.nextInt();
		
		if((num1 ^ num2) <0) {
			System.out.print("Opposite sign");
		}else {
			System.out.print("same sign");
		}
	}
	
}
