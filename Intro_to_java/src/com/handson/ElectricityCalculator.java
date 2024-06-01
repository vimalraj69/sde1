package com.handson;
/*
 * Electricity bill calculator: Calculate the bill for 30 days based on 
the given below data.
a) There are 2 fans of 60W each. Usage of each fan is 6 
hours per day.
b) There are 3 lights of 40W each. Usage of each light is 8 
hours per day.
c) For the other electrical appliances, the total 
consumption per day is 3000W.
d) Cost of 1 unit is Rs.6

 */

public class ElectricityCalculator {
	public static void main(String args[] ) {
		int totalwatts_fan=60*2*6;//720
		int totalwatts_light=40*3*8;//960
		int others=3000;
		
		int cost_unit=6;
		double totalcostwatts_day= ((totalwatts_fan+ totalwatts_light +others)*cost_unit);
		
		double cost_30=(totalcostwatts_day/1000)*30;
		
		System.out.println("Cost of electricity per month =" +cost_30);
	}

}
