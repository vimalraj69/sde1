package com.selfpractice;

import java.util.Scanner;

class Notnegative extends Exception{
	Notnegative(String s){
		super(s);
	}
}

class DescriptionNotNull extends Exception{
	DescriptionNotNull(String s){
		super(s);
	}
}
public class Grocerystore {
	int partNumber;
	String partDescription;
	int quantity;
	double price;
	Grocerystore(int partNumber, String partDescription,
			int quantity, double price) {
		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price=price;
		
	}
	
	public void shoeInfo() {
		System.out.println("partNumber :"+partNumber);
		System.out.println("partDescription :"+partDescription);
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);



	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter the Part Number :");
			int partNo=sc.nextInt();
			
			if(partNo<=0) {
				throw new Notnegative("Part Number must be greater than zereo");
			}
			System.out.println("Enter the Part Description :");
			String partdis=sc.next();
			
			if(partdis.equals(null)) {
				throw new DescriptionNotNull("description not be null");
			}
			
			System.out.println("Enter the Part quantity :");
			int quantity=sc.nextInt();
			if(quantity<=0) {
				throw new Notnegative("Part quantity must be greater than zereo");
			}
			System.out.println("Enter the Part price:");
			double price =sc.nextDouble();
			if(price<=0) {
				throw new Notnegative("Part price must be greater than zereo");
			}
			Grocerystore g = new Grocerystore(partNo,partdis,quantity,price);
		}catch(Exception e) {
			System.out.print(e);
		}
		
		
	}
}
