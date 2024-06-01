package com.selfpractice;

import java.util.Scanner;

public class RecyclingPens {
	static boolean check(int n, int r, int k, long c, long barrier) {
        long totalMoney = r + (n - barrier) * k;
        long pro = totalMoney / c;
        return pro >= barrier;
    }
    
    static int recyclePens(int n, int r, int k, int c) {
        int low = 0;
        int high = n;
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (check(n, r, k, c, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

     public static void main (String args []) {
 		Scanner sc = new Scanner (System.in);
 		
 		System.out.println("Enter the N R K C:");
 		int n=sc.nextInt();
 		int r=sc.nextInt();
 		int k=sc.nextInt();
 		int c=sc.nextInt();
 	
 		System.out.print("reusable "+recyclePens(n,r,k,c));
 		sc.close();
 	}

}
