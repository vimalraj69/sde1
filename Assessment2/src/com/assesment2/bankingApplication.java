package com.assesment2;

import java.util.*;

interface iBankAccount {
	public double balance();
}

interface iCheckingAccount {
	public double overdraftLimit();
}

class savingsAccount implements iBankAccount {
	double balance;

	savingsAccount(double balance) {
		this.balance = balance;

	}

	@Override
	public double balance() {
		return balance;

	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void transaction(double amount) {
		if (amount >= balance) {
			balance -= amount;
		}else {
			System.out.print("Insufficient balance");
		}
	}

}

class OverDraftLimit extends Exception {
	OverDraftLimit(String s) {
		super(s);
	}
}

class checkingAccount implements iBankAccount, iCheckingAccount {
	double balance;
	double overdraftLimit;

	checkingAccount(double balance, double overdraftLimit) {
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}
	

	@Override
	public double overdraftLimit() {
		return overdraftLimit;
	}

	@Override
	public double balance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws OverDraftLimit {
		if (amount >= balance && balance - amount > overdraftLimit) {
			balance -= balance;
		} else {
			throw new OverDraftLimit("OverDraft Limit Exceeded");
		}
	}

}

public class bankingApplication {

	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Enter the balance for Savings Account:");
			
			double balance =sc.nextDouble();
			savingsAccount account1 = new savingsAccount(balance);
			System.out.print("Enter the amount to deposit:");
			double amount = sc.nextDouble();
			account1.deposit(amount);
			
			System.out.print("Enter the balance and OverDraft for checking Account:");
			
			double balanceCheck = sc.nextDouble();
			double overdraft = sc.nextDouble();
			
			checkingAccount account2 = new checkingAccount(balanceCheck,overdraft);
			
			System.out.print("Enter the Amount to withdraw :");
			double amount2 = sc.nextDouble();
			
			account2.withdraw(amount);

			
		}catch(Exception e) {
			System.out.print(e);
		}
	}

}
