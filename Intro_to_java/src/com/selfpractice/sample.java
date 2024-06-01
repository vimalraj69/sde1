package com.selfpractice;

abstract class A{
	int var;
	abstract void display();
	
	void print() {
		System.out.print("print");
	}
	
}class B extends A {
	void display() {
		System.out.print("This is B");
	}
	
}class c extends A{
	
	void display(){
		System.out.println("This is c");

	}
}

public class sample {
	public static void main(String args[]) {
		A a ;
		
		a = new B();
		a.display();
		System.out.print(a.var);
		
		
	}
	
}
