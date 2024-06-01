package com.selfpractice;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String s){
		super(s);
	}
}
class Account2E{
	protected int AccountNo;
	protected String AccountName;
	protected double balance ;
	Account2E(int AccountNo, String AccountName ,double balance ) {
		this.AccountName=AccountName;
		this.AccountNo=AccountNo;
		this.balance= balance;
	}
	
	public void withDraw(double amount) throws InsufficientBalanceException{
		if(amount >balance) {
			throw new InsufficientBalanceException("Insufficient balance") ;
		}else {
			balance-=amount;
			System.out.println("Transaction Successfull");
		}
	}
	
	
}
public class BankingApplication {
	public static void main(String args []) {
		Scanner sc = new Scanner (System.in);
		Account2E a1 = new Account2E(6112354,"vimal",10000);
		try {
			while(true) {
				System.out.println("Enter the Amount :");
				double amount = sc.nextDouble();
				a1.withDraw(amount);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
