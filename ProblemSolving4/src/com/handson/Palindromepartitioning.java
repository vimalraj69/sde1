package com.handson;

import java.util.*;

public class Palindromepartitioning {
	
	static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
 
    
    static int minPalPartition(String str, int i, int j) {
        
        if (i >= j || isPalindrome(str, i, j))
            return 0;
 
        int minCuts = Integer.MAX_VALUE;
 
       
        for (int k = i; k < j; k++) {
            int cuts = minPalPartition(str, i, k)
                       + minPalPartition(str, k + 1, j) + 1;
            minCuts = Math.min(minCuts, cuts);
        }
 
        return minCuts;
    }
	    public static void main (String args []) {
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter Strings:");
			
			String s =sc.next();
			
			
			
			System.out.print(" "+ minPalPartition (s,0,s.length()-1));
			
			
			
			sc.close();

		}


	

}
