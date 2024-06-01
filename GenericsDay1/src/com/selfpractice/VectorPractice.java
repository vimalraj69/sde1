package com.selfpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class product{
	double price; String name; String category;
	product(String name, double price,  String category){
		this.price = price;
		this.category=category;
		this.name=name;
	}
}
public class VectorPractice {
	static Vector <product> v = new Vector<>();
	
	public void addProduct(product p) {
		v.add(p);
	}
	
	public void removeByName(String name) {
		for(product p : v) {
			if(p.name.equals(name)) {
				v.remove(name);
				break;
			}
		}
	}
	
	public void removeByCategory(String category) {
		for(product p : v) {
			if(p.category.equals(category)) {
				v.remove(category);
			}
		}
	}
	
	public boolean checkByname(String name) {
		for(product p : v) {
			if(p.name.contains(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
			if(v.isEmpty()) {
				return true;
			}
		
		return false;
	}
	
	public void display() {
		for(product p : v) {
			System.out.println("Name :"+p.name+" price :"+p.price+" category :"+p.category);
		}
	}
	
	public void details(String s) {
		for(product p : v) {
			if(p.name.equals(s)){
				System.out.println("Name :"+p.name+" price :"+p.price+" category :"+p.category);
				break;
			}
		}
	}
	public int size() {
		return v.size();
	}
	
	public Object[] toArray() {
		return v.toArray();
	}
	public List<Double> sort(){
		List<Double> l = new ArrayList<>();
		for(product p : v) {
			l.add( p.price);
		}
		Collections.sort(l);
		return l;		
	}
	
	public void clear() {
		v.clear();
	}
	
	public static void main (String args[]) {
		product p1 = new product("Speaker",1000,"Electronics"); 
		product p2 = new product("mobile",100000,"Electronics"); 
		product p3 = new product("Sofa",10000,"HouseHold products"); 
		product p4 = new product("t-Shirt",500,"Cloths"); 
		
		v.add(p1);
		v.add(p2);
		v.add(p3);
		v.add(p4); 
		VectorPractice v = new VectorPractice();
		
		v.display();
		v.removeByName("Sofa");
		System.out.println("Sofa removed");
		v.display();
		System.out.println("Check t-shirt available ? :"+v.checkByname("t-Shirt" ));
		


		
	}
}
