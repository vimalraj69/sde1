package com.handson;

abstract class MenuItem {
	String name;
	double price;
	
	abstract void cook ();
}

class Burger extends MenuItem {
	Burger(String name, double price){
		this.name=name;
		this.price=price;
	}
	public void cook() {
		System.out.println("Burger");
		System.out.println("Combine a grilled beef patty, lettuce, tomato, cheese, and condiments in a sliced burger bun.\r\n"
				+ "Serve with fries or a side of your choice.");
	}
}
class Pizza extends MenuItem {
	Pizza(String name, double price){
		this.name=name;
		this.price=price;
	}
	public void cook() {
		System.out.println("Pizza");
		System.out.println("Spread tomato sauce on a pizza dough, add mozzarella cheese, and your favorite toppings.\r\n"
				+ "Bake in a preheated oven at 475°F (245°C) for 10-15 minutes or until the crust is golden and cheese is bubbly.");
	}
}

public class Restaurant {
	public static void main (String args []) {
		Burger b = new Burger ("Burger",299.0);
		Pizza p = new Pizza ("pizza",599.0);
		
		b.cook();
		System.out.println();
		p.cook();

	}
}
