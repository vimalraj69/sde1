package com.handson;
/*
 * Declare a variable ‘age’. Assign a value to ‘age’ and print the
value of age. Choose the correct datatype for age considering age as a whole number.

 */

import java.util.Scanner;
public class Age {
	public static void main (String [] args) {
		Scanner read=new Scanner(System.in);
		byte age=read.nextByte();
		System.out.println(age);
		read.close();
	}
}
