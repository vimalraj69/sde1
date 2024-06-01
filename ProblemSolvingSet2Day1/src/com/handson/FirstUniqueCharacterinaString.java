package com.handson;




import java.util.*;

public class  FirstUniqueCharacterinaString {

	public static void wordsCheck( String s) {
		try {
			boolean ans = true;
			for(int i =0;i< s.length(); i++) {
				int count =0;
				for(int j =i+1 ; j< s.length(); j++) {
					if(s.charAt(i) == s.charAt(j)) {
						count++;
					}
					
				}
				if(count ==0) {
					System.out.print("Index :"+i);
					ans= false;
					break;
				}
			}
			if(ans) {
				System.out.print(-1);
			}
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String:");

		String s = sc.next();
		

		
		wordsCheck(s);

	}

}
 


