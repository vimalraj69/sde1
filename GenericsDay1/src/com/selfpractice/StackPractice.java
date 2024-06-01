package com.selfpractice;

import java.util.Stack;

class book{
	String name ; String Auther; String yearPublished;
	
	book(String name , String Auther, String yearPublished){
		this.name = name;
		this.Auther=Auther;
		this.yearPublished=yearPublished;
	}

	
}
public class StackPractice {
	static Stack <book> stack= new Stack<>();
	
	public void push(book s) {
		stack.push(s);
	}
	
	public void pop() {
		stack.pop();
	}
	
	public book poll() {
		return stack.pop();
	}
	
	public book peek() {
		return stack.peek();
	}
	
	public boolean check(String s) {
		for(book  b : stack) {
			if(b.name.equals(s)) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return stack.size();
	}
	
	public void display() {
		for(book b : stack) {
			System.out.println("Name :"+b.name +" Auther :"+b.Auther+" year Published "+b.yearPublished);
		}
	}
	public void clear() {
		stack.clear();
	}
	public static void main(String args []) {
		book b1 = new book("The Great Gatsby", "F. Scott Fitzgerald","1925");
		book b2 = new book("To Kill a Mockingbird","Harper Lee", "1960" );
		book b3 = new book("1984","George Orwell", "1949" );
		StackPractice s =new StackPractice();
		s.push(b1);
		s.push(b2);
		s.push(b3);
		
		s.display();
		System.out.println("Top of the stack :"+s.peek().name);
		System.out.println("Check book Available :"+s.check("To Kill a Mockingbird"));

		
	}
}
