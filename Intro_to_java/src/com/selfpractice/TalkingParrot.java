package com.selfpractice;

import java.util.Scanner;

public class TalkingParrot {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the time and is parrot Talking :");
		
		int time=input.nextInt();
		boolean talk=input.nextBoolean();
		
		if((time<7 && talk) || (time>20 && talk)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
