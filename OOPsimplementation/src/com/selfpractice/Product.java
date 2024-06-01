package com.selfpractice;



import java.util.Scanner;

public class Product  {
	
	private String productName;
	private int id;
	private double price;
	private int qty;
	
	public  Product () {
		this.id=0;
		this.productName="Unknown";
		this.price=0.0;
		this.qty=0;
		
		
	}
	public Product (int id , String name, double price, int qty) {
		this.id=id;
		this.productName=name;
		this.price=price;
		this.qty=qty;
		
		
	}
	
	public void display () {
		System.out.println("productName :"+productName);
		System.out.println("id :"+id);
		System.out.println("price :"+price);
		System.out.println("qty :"+qty);
		System.out.println("\n");



	}
	
	
	
	
	public static void main (String args[]) {
		Product p1= new Product();
		Product p2= new Product(2,"Nokia1100",2200,2);
		p1.display();
		p2.display();


	}

}

