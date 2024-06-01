package com.handson;

import java.util.Scanner;

public class IPAddress {
	
	    static String validIPAddress(String ip) {
	        int count1 = 0;
	        int count2 = 0;
	        for(char c : ip.toCharArray()) {
	            if(c == '.') count1++;
	            if(c == ':') count2++;
	        }
	        if(count1 == 3) {
	            String[] query = ip.split("\\.");
	            if(query.length == 4) {
	                if(validIP4(query)) return "IPv4";
	                return "Neither";
	            }
	        }
	        if(count2 == 7) {
	            String[] query6 = ip.split("\\:");
	            if(query6.length == 8) {
	                if(validIP6(query6)) return "IPv6";
	                return "Neither";
	            }
	        }
	        return "Neither";
	    }
	    private static boolean validIP4(String[] query) {
	        for(String str : query) {
	            if(str.startsWith("0") && str.length() > 1) return false;
	            try {
	                int num = Integer.parseInt(str);
	                if(num < 0 || num > 255) return false;
	            } catch(NumberFormatException e) {
	                return false;
	            }            
	        }
	        return true;
	    }
	   private static boolean validIP6(String[] query) {
	        for(String str : query) {
	            if(str.length() > 4 || str.length() <= 0) return false;
	            for(char c : str.toCharArray()) {
	                if((c >= 'a' && c <= 'f') || (c >= 'A' && c <='F') || (c >= '0' && c <= '9')) continue;
	                return false;
	            }
	        }
	        return true;
	    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter ip:");
		
		String s =sc.next();
		
		System.out.print("ip :"+ validIPAddress(s));
		
		
		sc.close();

	}
}
