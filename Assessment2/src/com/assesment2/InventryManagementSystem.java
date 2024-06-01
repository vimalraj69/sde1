package com.assesment2;

import java.util.*;

class Product {
	protected String name;
	protected String SKU;
	protected int quantity;
	protected double price;

	Product(String name, String SKU, int quantity, double price) {
		this.name = name;
		this.SKU = SKU;
		this.quantity = quantity;
		this.price = price;
	}

	public String toString() {
		return "Name :" + name + " SKU :" + SKU + " quantity :" + quantity + " price: " + price;
	}
}

public class InventryManagementSystem {

	static ArrayList<Product> inventry = new ArrayList<>();

	public void addProduct(Product p) {
		inventry.add(p);
	}

	public void removeProduct(String sku) {

		for (Product p : inventry) {
			if (p.SKU.equals(sku)) {
				inventry.remove(p);
				break;
			}
		}
	}

	public void updateProduct(String sku,  int newQuantity ,double newPrice) {
		for (Product p : inventry) {
			if (p.SKU.equals(sku)) {
				
				p.price = newPrice;
				
				p.quantity = newQuantity;
				break;
			}
		}
	}

	public void search(String sku) {
		boolean found = true;
		for (Product p : inventry) {
			if (p.SKU.equals(sku)) {
				System.out.print(p.toString());
				found = false;
				break;
			}
		}

		if (found) {
			System.out.println("no Such Product");
		}

	}

	public void details() {
		for (Product p : inventry) {
			System.out.println(p.toString());
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		
		Product p1 = new Product("mobile","m001",10,10000.0);
		Product p2 = new Product("earPhone","e001",100,10000.0);
		Product p3 = new Product("speaker","sp001",150,0000.0);
		Product p4 = new Product("laptop","l001",19,50000.0);
		Product p5 = new Product("tab","t001",10,10000.0);
		inventry.add(p1);
		inventry.add(p2);
		inventry.add(p3);
		inventry.add(p4);
		inventry.add(p5);
		InventryManagementSystem Ims = new InventryManagementSystem();
		
		Ims.details();
		Product newprosuct= new Product("Waterbottle","w001",10,100.0);
		Ims.addProduct(newprosuct);
		System.out.println("\nAdded the new Prouct waterBottle :\n");
		Ims.details();
		System.out.println("\nremove the  Prouct waterBottle :\n");
		Ims.removeProduct("w001");
		Ims.details();
		
		System.out.println("\nserach the  Prouct laptop :\n");

		Ims.search("l001");
		Ims.updateProduct("l001", 20, 20000.20);
		
		System.out.println("\nserach the  Updates Prouct laptop :\n");
		
		
		Ims.search("l001");
		




		
		
	}

}
