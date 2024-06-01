package com.handson;

import java.util.Scanner;

class NotNegativeZero extends Exception{
	NotNegativeZero(String s ){
		super(s);
	}
}
public class Mycalculator {
	public long power(int n , int p) throws NotNegativeZero{
		if(n==0 || p==0) {
			throw new NotNegativeZero("Number should not be 0 or negative");
		}
		return (long)Math.pow(n, p);
	}
	
	public static void main (String args []) {
		Mycalculator c = new Mycalculator();
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number n and p :");
		try {
			int n =sc.nextInt();
			int p= sc.nextInt();
			long ans = c.power(n, p);
			System.out.print("output: "+ans);
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
