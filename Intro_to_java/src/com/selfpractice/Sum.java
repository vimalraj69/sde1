package com.selfpractice;

import java.util.Scanner;

public class Sum {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Two Numbers :");
		
		int num1=input.nextInt();
		int temp1=num1;
		int num2=input.nextInt();
		int sum=num1+num2;
		int countSum=0;
		int countnum1=0;
		
		while (sum!=0) {
			countSum++;
			sum/=10;
		}
		
		while (temp1!=0) {
			countnum1++;
			temp1/=10;
		}
		
		if(countSum > countnum1) {
			System.out.println(num1);
		}else {
			System.out.println(num1+num2);
		}

		
		
	}

}
