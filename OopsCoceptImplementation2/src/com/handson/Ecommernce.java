package com.handson;

abstract class product{
	String name;
	double price;
	product(String name,double price){
		this.name=name;
		this.price=price;
	}
	
	public abstract void AddToCart();
	
	public double GetDiscountedPrice() {
		return price*0.05;
	}
		
	
}

class Book extends product{
	Book (String name, double price){
		super(name, price);
	}
	public void AddToCart() {
		System.out.println("Name :"+name+" \nprice :"+price);
		System.out.println("Discount "+super.GetDiscountedPrice());
	}
	
}

class Electronics extends product{
	Electronics (String name, double price){
		super(name, price);
	}
	public void AddToCart() {
		System.out.println("Name :"+name+"\nprice :"+price);
		System.out.println("Discount :"+super.GetDiscountedPrice());
	}
	
}



public class Ecommernce {
	public static void main (String args []) {
		Book b1 = new Book("java",599);
		Electronics e1 =new Electronics("iPhone11",10000);
		b1.AddToCart();
		System.out.println();
		e1.AddToCart();
	}
	

}
