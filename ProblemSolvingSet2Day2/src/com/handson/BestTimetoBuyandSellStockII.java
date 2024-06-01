package com.handson;

import java.util.*;

public class BestTimetoBuyandSellStockII {

	public static int sellBuy(List<Integer> prices) {
		int max=0;
		try {

			
		        
		        for(int i=0;i<prices.size()-1;i++){
		        	 if(prices.get(i+1)>prices.get(i)){
		                 max+=prices.get(i+1)-prices.get(i);
		             }
		        }

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

		return max;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the times :");

		int times = sc.nextInt();
		for (int t = 0; t < times; t++) {
			System.out.print("Enter the size :");

			int size = sc.nextInt();

			List<Integer> l = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				l.add(sc.nextInt());
			}

			

			System.out.println(sellBuy(l));
		}

	}

}
