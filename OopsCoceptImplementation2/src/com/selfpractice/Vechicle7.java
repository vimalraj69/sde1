package com.selfpractice;

interface vehicle{
	void stop();
	void start();
}
class car implements vehicle{//car implements vehicle
	public void stop() { //overide method stop
		System.out.println("car stopped");
	}
	public void start() { //overide method start
		System.out.println("car started");

	}
}
class Motorcycle implements vehicle{//Motorcycle implements vehicle
	public void stop() {//overide method stop
		System.out.println("Motorcycle stopped");
	}
	public void start() {//overide method start
		System.out.println("Motorcycle started");

	}
}
class Truck implements vehicle{//Motorcycle implements vehicle
	public void stop() {//overide method stop
		System.out.println("Truck stopped");
	}
	public void start() {//overide method start
		System.out.println("Truck started");

	}
}
public class Vechicle7 {
	public static void main (String args []) {
		vehicle arr[] =new vehicle[3];
		
		arr[0]= new car();
		arr[1]=new Motorcycle();
		arr[2]= new Truck();
		
		for(int i =0; i< arr.length ; i++) {
			arr[i].start();
			arr[i].stop();
			System.out.println();
		}
		

	}

}
