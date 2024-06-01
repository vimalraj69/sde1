package com.handson;

import java.util.*;

public class SettleDebt {

	static Map<Integer, Integer> map = new HashMap<>();

	public static int settledebt(List<List<Integer>> transactions) {

		for (List<Integer> transaction : transactions) {
			int lender = transaction.get(0);
			int receiver = transaction.get(1);
			int amount = transaction.get(2);

			map.put(lender, map.getOrDefault(lender, 0) - amount);
			map.put(receiver, map.getOrDefault(receiver, 0) + amount);
		}

		List<Integer> balances = new ArrayList<>();
		for (int value : map.values()) {
			if (value != 0) {
				balances.add(value);
			}
		}

		return settleDebtRecursive(balances, 0);

	}

	private static int settleDebtRecursive(List<Integer> balances, int start) {
		while (start < balances.size() && balances.get(start) == 0) {
			start++;
		}

		if (start == balances.size()) {
			return 0;
		}

		int minTransactions = Integer.MAX_VALUE;

		for (int i = start + 1; i < balances.size(); i++) {
			if (balances.get(start) * balances.get(i) < 0) {
				balances.set(i, balances.get(i) + balances.get(start));

				minTransactions = Math.min(minTransactions, 1 + settleDebtRecursive(balances, start + 1));

				balances.set(i, balances.get(i) - balances.get(start));
			}
		}

		return minTransactions;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of times:");

		int times = sc.nextInt();

		for (int t = 0; t < times; t++) {
			List<List<Integer>> Transaction = new ArrayList<>();

			System.out.println("Enter the NO of Transaction :");
			int noOftransaction = sc.nextInt();

			for (int i = 0; i < noOftransaction; i++) {
				List<Integer> l = new ArrayList<>();
				l.add(sc.nextInt());
				l.add(sc.nextInt());
				l.add(sc.nextInt());
				Transaction.add(l);
			}
			System.out.println(settledebt(Transaction));

		}

	}

}
