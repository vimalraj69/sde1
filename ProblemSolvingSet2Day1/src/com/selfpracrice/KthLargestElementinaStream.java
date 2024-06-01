package com.selfpracrice;

import java.util.*;

class KthLargest {
	List<Integer> l;
	int k;

	KthLargest(int k, List<Integer> l) {

		this.k = k;
		this.l = l;

	}

	public int add(int num) {
		l.add(num);
		Collections.sort(l);
		return l.get(l.size()-k);
	}
}

public class KthLargestElementinaStream {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size and element :");

		int size = sc.nextInt();

		List<Integer> l = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			l.add(sc.nextInt());
		}
		System.out.print("Enter the K :");

		int k = sc.nextInt();

		KthLargest kl = new KthLargest(k, l);

		System.out.print("Size and element to add :");

		int size2 = sc.nextInt();
		
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < size2; i++) {
			int num = sc.nextInt();
			ans.add(kl.add(num));
			
		}
		
		System.out.println(ans);

			sc.close();

	}

}
