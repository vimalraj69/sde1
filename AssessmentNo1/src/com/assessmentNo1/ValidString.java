package com.assessmentNo1;

import java.util.Scanner;

public class ValidString {
	
	static boolean valid(String s ) {
		
		int left=0;
		int right =0;
		int star =0;
		
		for(char c : s.toCharArray()) {
			if(left ==0 && star == 0
					&& c ==')') {
				return false;
			}else if (c == '(') {
				left++;
			}else if (c==')') {
				right++;
			}else if (c =='*') {
				star++;
			}
		}
		
		int diff = Math.abs(right-left);
		
		if(diff == 0) {
			return true;
		}else if (diff <=star) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size :");
		int n =sc.nextInt();
		
		for(int i =0; i< n ; i++) {
			System.out.print("Enter the String :");
			String  s = sc.next();
			
			System.out.println("Given String "+s+" is valid ? " +valid(s));
			
		}
		
		
		
		 
	}

}
