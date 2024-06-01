package com.handson;

import java.util.Scanner;

/*Declare four variables numberOne, numberTwo, numberThree,
and numberFour of integer type. Assign the values of your choice 
for the variables numberOne, numberTwo and numberThree. 
Assign 1000 to numberFour. Print the values. Now re-assign the 
values as follows to print,
1. numberOne’s value to numberTwo
2. numberTwo’s value to numberThree
3. numberThree’s value to numberFour
4. 100 to numberOne

 * 
 */
public class interChangevalue {
	public static void main (String args[]) {
		Scanner read=new Scanner(System.in);
		System.out.print("Enter thr value :");
		int num1=read.nextInt();
		int num2=read.nextInt();
		int num3=read.nextInt();
		int num4=1000;
		
		int temp=num2;
		num2=num1;
		int temp2=num3;
		num3=temp;
		num4=temp2;
		num1=100;
		System.out.println("num1="+ num1);
		System.out.println("num2="+ num2);
		System.out.println("num3="+ num3);
		System.out.println("num4="+ num4);
			read.close();
		
	}

}
