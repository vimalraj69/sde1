package com.handson;

import java.util.Scanner;

/*
 *  Write a Java program to reverse a 3-digit number.
 */
public class reverseDigit {
	public static void main(String args []) {
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		int reversed=0;
		while(num!=0) {
			int rem=num%10;
			reversed=reversed*10+rem;
			num/=10;
		}
		System.out.println(reversed);
	}
}
