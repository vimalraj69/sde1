package com.handson;
/*2
A factory-manufactured LED bulbs on the first day. On the second 
day, it made CFL bulbs. How many bulbs did the factory make 
altogether? Counts are the input
 * 
 */

import java.util.Scanner;

public class Bulbs {
	public static void main (String [] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the number of bulbs :");
		int led=read.nextInt();
		int cfl=read.nextInt();
		System.out.print("total bulb ="+(led+cfl));
		read.close();
	}
}
