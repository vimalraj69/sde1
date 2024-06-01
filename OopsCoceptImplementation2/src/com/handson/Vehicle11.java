package com.handson;

interface vehicle{
	void start();
	void stop();
}

interface electricVehicle{
	void charge();
}
interface gasVehicle{
	void refuel();
}

class ElectricCar implements vehicle,electricVehicle{
	public void start() {
		System.out.println("Electric Vehicle Started");
	}
	public void stop() {
		System.out.println("Electric Vehicle Stopped");
	}
	public void charge() {
		System.out.println("Electric Vehicle charging");
	}
}

class gasMotorCycle implements vehicle,gasVehicle{
	public void start() {
		System.out.println("gasMotorCycle Vehicle Started");
	}
	public void stop() {
		System.out.println("gasMotorCycle Vehicle Stopped");
	}
	public void refuel() {
		System.out.println("gasMotorCycle Vehicle refueling");
	}
}
public class Vehicle11 {
	public static void main(String args[]) {
		gasMotorCycle v1= new gasMotorCycle();
		ElectricCar   v2 = new ElectricCar();
		
		v1.start();
		v1.stop();
		v1.refuel();
		System.out.println("\n");
		v2.start();
		v2.stop();
		v2.charge();
	}
}
