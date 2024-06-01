package com.selfpractice;


interface shape4{
	void area();
	void perimeter();
}
abstract class ShapeClass4 {
	abstract void area();
	abstract void perimeter();
}
 class rectangle4 extends ShapeClass4 implements shape4 {
	
	double len, breadth;
	rectangle4(double len,double breadth){
		this.len=len;
		this.breadth=breadth;
	}
	@Override
	public void area() {
		System.out.println( "Area of rectangle"+len*breadth);
	}
	@Override
	public void perimeter() {
		System.out.println( "perimeter of rectangle :"+(2*len)+(breadth*2));
	}
	
	
}

class Circle4 extends ShapeClass4 implements shape4{
	double radius;
	
	Circle4(double radius){
		this.radius=radius;
	}
	@Override
	public void area() {	
	System.out.println("Area of circle :" + Math.PI*(Math.pow(radius, 2)));
	}
	
	public void perimeter() {	
		System.out.println("perimeter of circle :" + Math.PI*2*radius);
	}
	
	
}

class traingle4 extends ShapeClass4 implements shape4{
	double side1;
	double side2;
	double side3;
	
	traingle4(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	@Override
	public void area() {	
	System.out.println("Area of triangle :" + (0.5*side1*side2));
	}
	
	public void perimeter() {	
		System.out.println("perimeter of triangle :" + (side1+side2+side3));
	}
	
	
}

public class AreaAndPerimeter{
	public static void main (String args []) {
		shape4 s;
		s= new rectangle4(6,9); //upcasting
		
		s.area();
		s.perimeter();
		
		s= new Circle4(5);
		s.area();
		s.perimeter();
		
		s= new traingle4(5,5,5);
		s.area();
		s.perimeter();
		
	}
}
