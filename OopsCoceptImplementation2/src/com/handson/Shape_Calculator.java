package com.handson;

interface IShape {
	void CalculateArea();
	void CalCulatePerimeter();
}

class rectangle implements IShape {
	int length,breadth;
	
	rectangle(int len, int bth) {
		length =len;
		breadth=bth;
	}
	public void CalculateArea() {
		System.out.println("Area of rectangle :"+length*breadth);
	}
	public void CalCulatePerimeter() {
		System.out.println("Perimeter of rectangle :"+(2*length)+(2*breadth));

	}
}
class triangle implements IShape {
	double length,breadth,s;
	
	triangle(int len, int bth) {
		length =len;
		breadth=bth;
		
	}
	triangle(int len, int bth, int s) {
		length =len;
		breadth=bth;
		this.s=s;
	}
	public void CalculateArea() {
		System.out.println("Area of triangle :"+0.5*length*breadth);
	}
	public void CalCulatePerimeter() {
		System.out.println("Perimeter of triangle :"+(length+breadth+s));

	}
}
public class Shape_Calculator {
	public static void main (String args[]) {
		rectangle r = new rectangle (2,3);
		r.CalculateArea();
		r.CalCulatePerimeter();
		System.out.println();
		
		triangle t = new triangle (2,2,5);
		t.CalculateArea();
		t.CalCulatePerimeter();
	}
}
