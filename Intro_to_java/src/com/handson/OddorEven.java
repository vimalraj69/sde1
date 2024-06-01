package com.handson;
/*Write a Java program to check whether the given number is odd 
or even. Don’t use comparison operator and decision statement
 * 
 */
import java.util.*;
public class OddorEven {
	public static void main(String args[]) {
		Scanner read= new Scanner (System.in);
		int num= read.nextInt();
		
		String res=(num & 1)==0 ? "even" : "odd";
		System.out.print(res);
		
		read.close();
	}

}
