package com.handson;
/*
 * Initialize an integer variable ‘number’ with the value 100. Then 
print the value of ‘number’ to the console.
 */

/*Analysis
 * initialize the variable and print it.
 */
import java.util.*;
public class print_no {
	public static void main(String []args) {
		Scanner read=new Scanner(System.in);
		int number=read.nextInt();
		System.out.print(number);
		read.close();
	}
}
