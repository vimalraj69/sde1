package com.handson;

import java.util.*;
public class Lotteryticket {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt(); 
	        
	        while (T>0) {
	            int N = scanner.nextInt(); 
	            int K = scanner.nextInt(); 
	            scanner.nextLine(); 
	            
	            String matchStr = scanner.nextLine(); 
	            
	            int winningTickets = 0;
	            for (int i = 0; i < N; i++) {
	                String ticket = scanner.nextLine();
	                if (isWinningTicket(ticket, matchStr, K)) {
	                    winningTickets++;
	                }
	            }
	            
	            System.out.println(winningTickets);
	        }
	    }
	    private static boolean isWinningTicket(String ticket, String matchStr, int K) {
	        for (int i = 0; i <= matchStr.length() - ticket.length(); i++) {
	            int count = 0;
	            for (int j = 0; j < ticket.length(); j++) {
	                if (ticket.charAt(j) != matchStr.charAt(i + j)) {
	                    count++;
	                    if (count > K || (ticket.charAt(j) != 'a' && matchStr.charAt(i + j) != 'a') ||
	                        (ticket.charAt(j) != 't' && matchStr.charAt(i + j) != 't')) {
	                        break;
	                    }
	                }
	            }
	            if (count <= K) {
	                return true;
	            }
	        }
	        return false;
}
}

