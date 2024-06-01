package com.selfpractice;

class Auther{
	String name;
	String email;
	
	Auther(String name , String email) {
		this.name=name;
		this.email=email;
	}
	
	public String getName () {
		return name;
	}
	public String getEmail () {
		return email;
	}
	public void setEmail (String email) {
		this.email= email;
	}
	public String toString() {
		return "Auther[ name ="+name+" , email"+email+" ]";
	}
}

class Book {
	String isbn;
	String name;
	Auther auther;
	double price;
	int qty;
	public Book (String isbn, String name, Auther auther,double price) {
		this.isbn=isbn;
		this.name=name;
		this.auther=auther;
		this.price=price;
		this.qty=qty;
		
	}
	
	public Book (String isbn, String name, Auther auther,double price,int qty) {
		this.isbn=isbn;
		this.name=name;
		this.auther=auther;
		this.price=price;
		this.qty=qty;
		
	}
	
	public String getISBN() {
		return isbn;
	}
	public String getName() {
		return name;
	}
	public Auther getAuther() {
		return auther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public String getAutherName() {
		return auther.name;
	}
	
	public String toString() {
		return "BOOK[isbn= "+isbn+",name= "+name+","+auther.toString()
		+",price ="+price+",qty ="+qty+"]";
	}
	
}
public class AuthorAndBook {
	public static void main (String args[]) {
		Auther auther1= new Auther("Vimal","2k21it69@kiot.ac.in");
		Book b1 = new Book("978-3-16-148410-0","Hero of Konda",auther1,999,1);
		
		System.out.println(b1.getISBN());
		System.out.println(b1.getName());

		System.out.println(b1.getAuther());

		System.out.println(b1.toString());

		
	}
	

}
