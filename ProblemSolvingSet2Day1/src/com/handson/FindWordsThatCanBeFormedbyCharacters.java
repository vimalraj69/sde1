package com.handson;




import java.util.*;

public class  FindWordsThatCanBeFormedbyCharacters {

	public static void wordsCheck( String arr [],  String s ) {
		try {
			int ans=0;
			
			for(String str : arr) {
				boolean f = true;
				for(char c : str.toCharArray()) {
					if(!s.contains(String.valueOf(c))) {
						f= false; break;
					}
				}
				if(f) {
					ans+=str.length();
				}
			}
			
			System.out.print("Total length :"+ ans );
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
 


