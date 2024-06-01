package com.handson;

import java.util.Scanner;

public class Webhtml {
	static void createTag(String style , String word) {
		System.out.print("<"+style+"> "+word+" </"+style +">" );
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Style and word :");
		
		String style =sc.next();
		String word =sc.next();
		createTag(style , word);
		sc.close();
	}
}
