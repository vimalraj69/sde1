package com.handson;

public class Circle {
	
	private double radius ;
	private String color ;
	
	public Circle() {
		radius =1.0;
		color ="red";
	}
	public Circle(double r) {
		radius =r;
		
	}
	public Circle(double r , String s) {
		radius=r;
		color =s;
	}
	public Circle(String s) {
		color=s;
	}
	
	public double  getRadius() {
		double area = Math.PI *radius *radius;
		return area;
	}
	
	public String  getColor() {
		return color;
	}
	public void setRadius(double r) {
		radius=r;
	}
	public void setColor(String  s) {
		color=s;
	}
	
	public String toString () {
		return String.valueOf(radius);
	}
	public static void main (String args[]) {
		Circle c = new Circle();
		System.out.println(c.color);
		System.out.println(c.radius);
		Circle c1 = new Circle(20.0);
		System.out.println(c1.color);
		System.out.println(c1.radius);
	}
	
	
	

}
