package com.handson;

import java.util.HashMap;
import java.util.*;

public class FrogsCroaking {
	
	 static int minNumberOfFrogs(String s) {
	        int n = s.length();
	        int idx = 0;
	        int ans = 0;
	        int curr = 0;
	        int max_frogs = n/5;
	        if (n%5!=0) return -1;
	        int[] freq = new int[] {0, 0, 0, 0, 0};
	        Map<Character, Integer> map = new HashMap<>();
	        map.put('c', 0);
	        map.put('r', 1);
	        map.put('o', 2);
	        map.put('a', 3);
	        map.put('k', 4);

	        while (idx<s.length()) {
	            Character ch = s.charAt(idx);
	            if (!map.containsKey(ch)) return -1;
	            if (ch=='k') {
	                curr--;
	            } else {
	                freq[map.get(ch)]++;
	                if (ch=='c'){
	                    curr++;
	                    ans = Math.max(ans, curr);
	                } else {
	                    freq[map.get(ch)-1]--;
	                    if (freq[map.get(ch)-1]==-1) return -1;
	                }
	            }
	            idx++;
	        }
	        if (freq[0]>0) return -1;
	        return ans;
	    }
	    
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String:");
		
		String s =sc.next();
		
		System.out.print("frog yelling:"+ minNumberOfFrogs(s));
		
		
		sc.close();

	}
}
