package com.handson;




import java.util.*;

public class  RedistributeCharacterstoMakeAllStringsEqual {

	public static void wordsCheck( String arr []) {
		try {
			int ch []= new int [26];
			
			for(String s : arr) {
				for(char c : s.toCharArray()) {
					ch[c-'a']++;
				}
			}
			
			boolean ans = true;
			
			for(int i : ch) {
				if(i !=0 && i != arr.length) {
					ans=false;
					System.out.print("False");
				}
			}
			if(ans) {
				System.out.print("true");

			}
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
		

		

		wordsCheck(arr);

	}

}
 


