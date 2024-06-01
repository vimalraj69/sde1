package com.handson;

class Vehicle12{
	String brand;
	int year;
	
	public void displayInfo() {
		System.out.println("Brand "+brand);
		System.out.println("Year "+year);

	}
}
class Car extends Vehicle12{
	String model;
	
	Car(String brand, int year, String model){
		this.model=model;
		this.brand=brand;
		this.year=year;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Model "+model);

	}
}

public class carAndVehicle {
	public static void main (String args[]) {
		Car c1 = new Car("Toyato",2024,"Supra");
		c1.displayInfo();
	}

}
