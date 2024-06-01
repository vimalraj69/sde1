package com.selfpractice;

public class cr {
	private int cashOnHands;
	public cr() {
		cashOnHands=100;
	}
	
	public cr(int cash) {
		cashOnHands=cash;
	}
	
	public int getCurrentbalance() {
		return cashOnHands;
	}
	
	public void acceptAmounts (int cash) {
		cashOnHands+=cash;
	}
	
	public static void main (String args[]) {
		cr r =new cr (500);
		r.acceptAmounts(500);
		System.out.print("Balance :"+r.getCurrentbalance());
		
	}

}
