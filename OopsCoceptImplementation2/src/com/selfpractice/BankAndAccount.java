package com.selfpractice;

class BankAccount1{
	
	protected String accountNo;
	protected double balance;
	protected double interestRate;

	public BankAccount1(String accountNo,double balance,double interestRate){
     this.accountNo = accountNo;
     this.balance = balance;
     this.interestRate = interestRate;
	}

 
 
	public void deposit1(double amount){
     
         balance +=amount;
	}

	public String getAccountNo1() {
		return accountNo;
	}

	public double getBalance1() {
		return balance;
	}

	public double getInterestRate1() {
		return interestRate;
	}
}

class SavingsAccount1 extends BankAccount1 {
	private double minimumBalance;

	public SavingsAccount1(String accountNo,double balance,double interestRate,double minimumBalance){
		super(accountNo, balance, interestRate);
		this.minimumBalance = minimumBalance;
	}

	public void withdraw1(double amount){
		if (amount > 0) {
			if (balance- amount >= minimumBalance) {
				balance -=amount;
			} 
         
		}
	}
	public double getMinimumBalance1() {
		return minimumBalance;
	}
}

class FixedDepositAccount1 extends SavingsAccount1 {
		private int term; 
		
		public FixedDepositAccount1(String accountNo,double balance,  double interestRate,double minimumBalance,  int term) {
			super(accountNo, balance,  interestRate, minimumBalance);
			this.term  =term;
		}

		public double getInterest1() {
			return getBalance1() *(getInterestRate1()/ 100)* (term /12.0);
		}

		public int getTerm() {
			return term;
		}
	}

public class BankAndAccount  {
	public static void main(String[] args) {
		BankAccount1 a1 = new BankAccount1("001",1000,5);
		a1.deposit1(500);

		SavingsAccount1 s1 = new SavingsAccount1("002",2000,4,500);
		s1.deposit1(1000);
		s1.withdraw1(700);
     

		FixedDepositAccount1 f1 = new FixedDepositAccount1("003",5000,6,1000,12);
		f1.deposit1(2000);
		f1.withdraw1(3000);
		System.out.println("Interest earned: " + f1.getInterest1());
    
	}
}





