package com.selfpractice;

import java.util.Scanner;

public class MobileShop {
	public static void main(String args []) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the details :");
		System.out.println("Enter the Brand :");
		String brand=input.next();
		System.out.println("Enter the ModelNO :");
		long Model=input.nextLong();
		System.out.println("Enter the Storage :");
		int Storage=input.nextInt();
		System.out.println("Enter the colour :");
		String colour=input.next();
		System.out.println("Enter the Price :");
		int price=input.nextInt();
		System.out.println("Enter the DisplaySize :");
		int displaySize=input.nextInt();
		System.out.println("Enter the Ram :");
		int ram=input.nextInt();
		System.out.println("Enter the processor :");
		String Processor=input.next();
		System.out.println("Enter the Camera :");
		String Camera=input.next();
		
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+Model);
		System.out.println("Storage Capacity :"+Storage);
		System.out.println("Color :"+colour);
		System.out.println("price: "+price);
		System.out.println("Display Size: "+displaySize);
		System.out.println("Ram:"+ram);
		System.out.println("Processor: "+Processor);
		System.out.println("Camera :"+Camera);
		
		
	}

}
