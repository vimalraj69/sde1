package com.handson;

public class BankAccount {
	private int accountNo;
	private String name;
	private double balance;
	
	public void setAccountNo (int no) {
		accountNo= no;	
	}
	public void setName (String name) {
		this.name= name;	
	}
	public void setbalance (double balance) {
		this.balance= balance;	
	}
	
	public int getAccountNo () {
		return accountNo;	
	}
	public String getName () {
		return name;	
	}
	public double getBalance () {
		return balance;
	}
	
	public static void main (String args []) {
		BankAccount a1= new BankAccount();
		
		a1.setAccountNo(61125678);
		a1.setbalance(20000);
		a1.setName("Vimal");
		
		System.out.println("Name "+a1.getName());
		System.out.println("Acc No "+a1.getAccountNo());
		System.out.println("Balance "+a1.getBalance());
		
	}
	
	
}
