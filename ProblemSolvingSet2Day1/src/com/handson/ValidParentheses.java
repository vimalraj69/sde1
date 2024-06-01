package com.handson;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
	public static boolean  check(String x) {
		

			 Stack <Character> st=new Stack<>();
		        
		        for(char c : x.toCharArray()){
		            if(st.isEmpty() && (c==']' || c=='}' || c==')')){
		                return false;
		            }
		           if(c=='[' || c=='{' || c=='('){
		               st.push(c);
		           }else{
		               if(!st.isEmpty() && ((st.peek()=='{' && c=='}') || (st.peek()=='[' && c==']') ||
		               (st.peek()=='(' && c==')'))){
		                   st.pop();
		               }else{
		                   st.push(c);
		               }
		           }
		        }
		      
		        if(st.size()==0) {
		            return true;
		        }
		        return false;
		    

		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Strings x :");
		String x = sc.next();
		

		System.out.print(check(x));
	}

}
