package com.selfpractice;

import java.util.*;
import java.lang.*;

public class BookStore {
	
	String arr[];
	int quantity;
	double price;
	int index =0;
	BookStore(int n,int quantity,double price){
		arr = new String [n];
		this.quantity=quantity;
		this.price =price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void update(String s) {
		arr[index++]=s;
	}
	
	
	
public static void main(String args []) {
	
	Scanner sc = new Scanner(System.in);
	try {
		System.out.print("Enter the size quantity and price :");
		int size = sc.nextInt();
		int qty = sc.nextInt();
		double price =sc.nextDouble();
		BookStore s1 = new BookStore(size,qty,price);
		System.out.println("Upadate the books and enter size:");
		int n = sc.nextInt();
		for(int i =0; i<n; i++) {
			System.out.println("Enter the book :");
			String s = sc.next();
			s1.update(s);
		}
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.print(e);
	}
	catch(InputMismatchException e  ) {
		System.out.print(e);
	}catch(Exception e) {
		System.out.print(e);

	}
}
}
