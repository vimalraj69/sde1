package com.handson;
/*rite a Java program to add 8 to the given number and then 
divide it by 3. Now, the modulus of the quotient is taken with 5,
and then multiply the resultant value by 5. Display the result.
 * 
 */

import java.util.Scanner;

public class Expression {
	public static void main (String [] args) {
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		n=(n+8)/3%5*5;
		System.out.print(n);
	}

}
