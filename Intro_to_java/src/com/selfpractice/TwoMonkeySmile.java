package com.selfpractice;

import java.util.Scanner;

public class TwoMonkeySmile {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter two Mokeys is Smiling :");
		
		boolean aSmile=input.nextBoolean();
		boolean bSmile=input.nextBoolean();
		
		if((aSmile && bSmile) || (!aSmile && !bSmile)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		input.close();
	}

}
