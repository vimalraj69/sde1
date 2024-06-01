package com.selfpractice;

class PayOutOfBoundsException extends Exception{
	PayOutOfBoundsException(String s){
		super(s);
	}
}
public class AccountManagement {
	double balance =80000;
	public boolean checkForDebit(double amount) {
		if(amount<=balance) {
			return true;
		}
		return false;
	}
	
	public void withdrawAmount(double amount)throws PayOutOfBoundsException {
		if(amount >balance ) {
			throw  new PayOutOfBoundsException ("Insufficirnt Balance");
		}else {
			balance-=amount;
			System.out.println("Transaction successfull");
		}
		
	}
	public static void main(String args []) {
		AccountManagement a = new AccountManagement();
		try {
			a.withdrawAmount(1000);
			a.withdrawAmount(100000);
			
		} catch (PayOutOfBoundsException e) {
			System.out.print(e);
		}
	}
}
