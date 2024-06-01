package com.handson;

import java.util.*;

public class GenerateParentheses {

    public static List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max)
            backtrack(result, current + "{", open + 1, close, max);
        if (close < open)
            backtrack(result, current + "}", open, close + 1, max);
    }
    public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		int s =sc.nextInt();
		
		System.out.print("all combination:"+ generateParentheses(s));
		
		
		sc.close();

	}
}
