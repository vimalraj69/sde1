package com.selfpractice;

import java.util.Scanner;

public class Party {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Rating tea and candy:");
		
		int tea=input.nextInt();
		int candy=input.nextInt();
		
		if(tea<5 || candy<5) {
			System.out.println("0");
		
		}else if((tea*2 < candy) || (tea > candy*2)) {
			System.out.println("2");
		}else {
			System.out.println("1");
		}
		
	}

}
