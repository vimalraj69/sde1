package com.handson;

import java.util.Scanner;

/*A cashier in a shop has currency notes of denominations 10,50 
and 100. If the amount to be returned is the input, find the total 
number of currency notes of each denomination that the cashier 
should give to the customer. Write a program to accomplish the 
above task. Assume that the input is in 10’s multiples.
 * 
 */
public class Cashier {
	public static void main(String []args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the Amount: ");
		int input =read.nextInt();
		
		int hundreds=0;
		int fiftys=0;
		int tens=0;
		
		
		if(input>=100  ) {
			hundreds=input/100;
			input=input-(hundreds*100);
		}
		if(input>=50) {
			fiftys=input/50;
			input=input-(fiftys*50);
		}
		if(input>=10) {
			tens=input/10;
			input=input-(tens*10);
		}
		
		if(input==0) {
			System.out.println("hundreds= "+hundreds);
			System.out.println("fiftys= "+fiftys);
			System.out.println("tens= "+tens);
		}
	}
}
