package com.assessmentNo1;

import java.util.Scanner;

public class ATMWithdrawalTransactionCalculator {
	
	static void withdraw(double Balance, double amount) {
		double charge = 0.50;
		
		if(amount<=Balance && amount % 5==0) {
			Balance =Balance -amount -charge;
			System.out.print("Transaction Successfull");
			System.out.print("Balance :"+	Balance );


			
		}else {
			System.out.print("please enter the amount multiple of 5");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Inital balance:");
		double balance = sc.nextDouble();
		System.out.print("Enter the amount to withdraw:");
		double amount = sc.nextDouble();
		withdraw(balance,amount);
		
		 
	}

}
