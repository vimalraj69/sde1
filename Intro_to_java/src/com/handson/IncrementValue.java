package com.handson;

import java.util.Scanner;

/*
 * 
Write a Java program that increments a given number. Don't use 
arithmetic operators.
 */
public class IncrementValue {
	public static void main(String args []) {
		Scanner read= new Scanner(System.in);
		int num=read.nextInt();
		
		num=-~num;
		System.out.println(num);
		
		//Unary Operator
		
		System.out.println(++num);
	}

}
