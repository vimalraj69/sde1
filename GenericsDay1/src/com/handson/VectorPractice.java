package com.handson;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorPractice {
	public static void main (String args []) {
		Vector<String> flowerVector = new Vector<>();
		flowerVector.add("rose");
		flowerVector.add("Lily");
		flowerVector.add("Tulip");
		flowerVector.add("Daisy");
		
		flowerVector.remove(2);
		flowerVector.remove("Lily");
		
		System.out.println("secound position :" +flowerVector.get(1));
		
		flowerVector.set(1, "Sunflower");
		
		System.out.println(" contains Tulip :" +flowerVector.contains("Tulip"));
		System.out.println(" index Daisy :" +flowerVector.indexOf("Daisy"));
		System.out.println(" emoty or not  :" +flowerVector.isEmpty());
		
		Iterator i = flowerVector.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		List Sub = flowerVector.subList(2, 2);
		
		Object arr [] = flowerVector.toArray();
		System.out.println(" size  :" +flowerVector.size());
		System.out.println(" Capacity :" +flowerVector.capacity());
		
		flowerVector.add("Orchid");
		flowerVector.add("Carnation");
		System.out.println(" Capacity :" +flowerVector.capacity());
		
		flowerVector.remove(3);
		
		System.out.println(" size :" +flowerVector.size());


		
		

		



		
		
		
	}

}
