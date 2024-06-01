package com.selfpractice;


class Account {
	String accountNumber;
	String accountName;
	double balance;
	
	public Account(String no, String name, double balance) {
		accountNumber =no;
		accountName=name;
		this.balance=balance;
	}
	
	public void deposit (double amount ) {
		balance+=amount;
	}
	
	public void withdraw (double amount ) {
		if(amount <=balance ) {
			balance-=amount;
		}else {
			System.out.print("Insufficient Balance");
		}
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountName() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void displayInfo() {
		System.out.println("accountNumber :"+accountNumber);
		System.out.println("balance :"+balance);

	}
}
class SavingsAccount extends Account{
	double interest ;

	public SavingsAccount(String no, String name, double balance, double interest) {
		super(no,name,balance);
		this.interest =interest;
		
	}
	
	public void addInterest() {
		balance+=interest;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("interest "+interest);

	}
	
}
class CurrentAccount extends Account{
	double overdraftLimit;
	public CurrentAccount(String no, String name, double balance,double overdraftLimit) {
		super(no, name, balance);
		this.overdraftLimit =overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("overdraftLimit "+overdraftLimit);

	}
	
}
public class Bank {
	public static void main (String args[]) {
		CurrentAccount c1 = new CurrentAccount("101025","vimal",5000,100);
		c1.deposit(50000);
		c1.displayInfo();

		System.out.println();
		SavingsAccount s1= new SavingsAccount("101026","raj",5000,200);
		s1.displayInfo();
	}

}
