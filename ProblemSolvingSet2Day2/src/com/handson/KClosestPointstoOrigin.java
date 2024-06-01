package com.handson;

import java.util.*;

public class KClosestPointstoOrigin {

	class Pair implements Comparable<Pair> {
		int arr[];
		int dist;

		Pair(int arr[], int dist) {
			this.arr = arr;
			this.dist = dist;
		}

		@Override
		public int compareTo(Pair p) {
			return this.dist - p.dist;
		}
	}

	public  int[][] kClosest(int[][] points, int k) {
		int result[][] = new int[k][2];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int a[] : points) {
			int dist = (int) (Math.pow(a[0], 2) + Math.pow(a[1], 2));
			pq.add(new Pair(a, dist));
		}
		int i = 0;
		while (k != 0) {
			result[i++] = pq.poll().arr;
			k--;
		}
		return result;
	}

	public static void main(String args[]) {
		KClosestPointstoOrigin kc =new KClosestPointstoOrigin();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the points size:");
		int n = sc.nextInt();
		int arr[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		System.out.print("Enter the k:");
		
		int k =sc.nextInt();

		int ans [][]=kc.kClosest(arr,k);
		
		for(int i =0 ;i< ans.length;i++) {
			for(int j =0; j< ans[i].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
		}

	}

}
