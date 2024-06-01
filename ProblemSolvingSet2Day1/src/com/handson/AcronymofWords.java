package com.handson;




import java.util.*;

public class  AcronymofWords {

	public static void wordsCheck( String arr [],  String s ) {
		try {
			String ans="";
			for(String str : arr) {
				ans+=str.charAt(0);
			}
			
			System.out.print(ans.equals(s));
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size and  Arrays  :");

		int size1 = sc.nextInt();
		String arr []=new String [size1];

		for (int i = 0; i < size1; i++) {
			arr[i]=sc.next();
		}
		System.out.println("Enter the s :");
		String s =sc.next();

		

		wordsCheck(arr,s);

	}

}
 


