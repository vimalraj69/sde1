package com.handson;


class Area {
public int CalculateArea (int a, int b) {
		
		return a*b;
	}
	
	public double CalculateArea(double radius) {
		return Math.PI *Math.pow(radius, 2);
	}
	
	public double CalculateArea(double half,double a, double b) {
		return half*a*b;
	}
}
public class CalculateArea {
	public static void main (String args []) {
		Area a = new Area();
		System.out.println("rectangle :"+a.CalculateArea(2, 2));
		System.out.println("Circle :"+a.CalculateArea(4));
		System.out.println("Traingle :"+a.CalculateArea(0.5,2, 2));
		
	}
	
	

}
