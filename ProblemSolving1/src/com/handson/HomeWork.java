package com.handson;

import java.util.Scanner;

public class HomeWork {
	static int count (int start[],int end[],int time) {
		
		int count=0;
		
		for(int i =0; i< start.length ; i++) {
			
			if(time >=start[i] && time<=end[i]) {
				count++;
			}
		}
		return count;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		int start[]=new int [num];
		int end [] =new int [num];
		
		System.out.print("Enter the start time:");
		
		for(int i =0 ;i < num ; i++) {
			start[i]=sc.nextInt();
		}
		System.out.print("Enter the end time:");
		for(int i =0 ;i < num ; i++) {
			end[i]=sc.nextInt();
		}
		System.out.print("Enter the time:");
		int n=sc.nextInt();


		System.out.print("No of student done home work at given time:"+ count(start,end,n));
		
		
		sc.close();

	}
}
