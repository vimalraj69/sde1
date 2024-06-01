package com.handson;

import java.util.Scanner;

public class MatrixExponentiation {
	public static double dice(int num) {
		double sum=0;
		for(int i=1;i<=6;i++) {
			if(num-i>0)
			sum=sum+(1.0/6)*(1+ dice(num-i));
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num: ");
		int num=sc.nextInt();
		double result=dice(num);
		System.out.print((int)result);
	}
	
}

