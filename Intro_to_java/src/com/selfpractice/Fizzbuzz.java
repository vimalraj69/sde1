package com.selfpractice;

import java.util.Scanner;

public class Fizzbuzz {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		
		int num=input.nextInt();
		
		if(num % 3==0 && num % 5==0) {
			System.out.println("FizzBuzz");
		}else if(num % 3 ==0) {
			System.out.println("Fizz");
		}else if(num % 5== 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(num+"!");
		}
		
	}

}
