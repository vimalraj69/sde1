package com.handson;

import java.util.Scanner;

public class TemperatureConverter  {
	
	
	
	static double celsiusToFahrenheit(double celsius) {
		
		return ((9*celsius)/5)+32;
	}

	static double fahrenheitToCelsius(double fahrenheit) {
		
		return ((fahrenheit- 32)*5)/9;
	}
	
	
	
	
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter value to convert celsius to farenheit :");
		int celsius= sc.nextInt();
		
		System.out.println("Celsius to farenheit :"+celsiusToFahrenheit(celsius));
		System.out.print("Enter value to convert farenheit to celsius :");
		int f= sc.nextInt();
		System.out.println("farenheit to celsius :"+fahrenheitToCelsius(f));

	}

}
