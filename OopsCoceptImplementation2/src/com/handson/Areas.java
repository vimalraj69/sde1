package com.handson;

abstract class Shape {
	abstract double calculateArea();
}
 class rectangle1 extends Shape{
	@Override
	public double calculateArea() {
		double l=20;
		double b=10;
		
		return l*b;
	}
	
	
}

class Circle extends Shape{
	@Override
	public double calculateArea() {
		double radius =9;
		
		return Math.PI*(Math.pow(radius, 2));
	}
	
	
}
public class Areas {
	public static void main (String args []) {
		Shape s;
		s= new rectangle1(); //upcasting
		
		System.out.println("Rectangle :"+s.calculateArea());
		
		s= new Circle();
		
		System.out.println("Circle :"+s.calculateArea());
		
	}
}
