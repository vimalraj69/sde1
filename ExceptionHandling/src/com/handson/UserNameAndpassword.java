package com.handson;

import java.util.Scanner;

class InvalidUsername extends Exception{
	InvalidUsername(String s ){
		super(s);
	}
}
class InvalidPassword extends Exception{
	InvalidPassword(String s ){
		super(s);
	}
}
public class UserNameAndpassword {
	public void verify() throws InvalidUsername, InvalidPassword {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the User name :");
		String name =sc.next();
		String psd =sc.next();
		
		if(name.length()<6 || name.length()<30) {
			if(!name.matches("username.matches(\"[A-Za-z][A-Za-z0-9_]*\")")) {
				
					
			        if (psd.length()<8 && !psd.matches(".*[a-z].*")&&!psd.matches(".*[A-Z].*")
			        		&&!psd.matches(".*[0-9].*")&&!psd.matches(".*[!@#$%^&*()\\-+].*")) {
						throw new InvalidPassword("Invalid Password");
			        }else {
				        System.out.print("Welcome");

			        }   
			        
				
			}else {
				throw new InvalidUsername("  Invalid username");

			}
			
			
		}
	}
	public static void main (String args []) {
		UserNameAndpassword p = new UserNameAndpassword();
		try {
			p.verify();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
