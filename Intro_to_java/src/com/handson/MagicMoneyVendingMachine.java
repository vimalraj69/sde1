package com.handson;

import java.util.Scanner;

/*
 * Anisha and Raja took their common pocket money to the market. 
Anisha bought Apples and Raju bought Bananas. On their way 
back they saw a Magic Money Vending Machine which gives the 
triple of the money deposited. They both tried with all the balance 
amount that they had. Now write a program to,
1. Print the amount, they spent together in the market
2. Print the final amount that they had when they reach 
home
3. Print the amount they deposited in the magic machine
Inputs: Pocket money, Apple cost, Banana cost
 */
public class MagicMoneyVendingMachine {
	public static void main (String args[]) {
		Scanner read= new Scanner (System.in);
		System.out.println("Enter money:");
		int pocketMoney =read.nextInt();
		int appleCost =read.nextInt();
		int bananaCost =read.nextInt();
		
		int balance=pocketMoney -appleCost-bananaCost;
		
		int MagicVendingMachine= 3* balance;
		
		System.out.println("MagicVendingMachine ="+MagicVendingMachine);
		
	}

}
