package com.selfpractice;

import java.util.Scanner;

public class Vacation {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter is weekDay :");
		boolean weekday=input.nextBoolean();
		
		System.out.println("Enter is Vacation :");
		boolean vacation =input.nextBoolean();
		
		if(!weekday && !vacation ) {
			System.out.println("true");
		}else if (weekday && !vacation ) {
			System.out.println("false");
		}else if(!weekday && vacation) {
			System.out.println("true");
		}
		
		input.close();
	}

}
