package com.selfpractice;

import java.util.Scanner;

public class CostPrice {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the Amount and profit:");
		
		int amount=input.nextInt();
		int profit=input.nextInt();
		
		int costOfOne=(amount-profit)/15;
		
		System.out.println("Cost per Item :"+costOfOne);
		
	}

}
