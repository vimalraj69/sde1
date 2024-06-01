package com.selfpractice;

public class Library {
	static int totalBooks;
	
	final int MAX_CAPACITY=1000;
	
	public void addBook() {
		if(totalBooks<MAX_CAPACITY) {
			totalBooks++;
		}
	}
	
	public int getTotalBooks() {
		return totalBooks;
	}
	
	
	public static void main (String args []) {
		Library l =new Library();
		
		l.addBook();
		l.addBook();
		System.out.print("TotalBooks :"+l.getTotalBooks());
	}

}
