package com.handson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindtheWinneroftheCircularGame {
	
	static int game (int num[], int k ) {
		Queue<Integer> q= new LinkedList<>();
		
		for(int i : num) {
			q.add(i);
		}
		int i =1;
		while(q.size()!=1) {
			if(i % k !=0 && !q.isEmpty()) {
				int pop= q.poll();
				q.add(pop);
				i++;
			}else {
				if(!q.isEmpty())
				q.poll();
				i++;
			}
		}
		
		return q.peek();
	}
	
	static int game1 (int n, int k ) {
		int winner =0;
		for(int i =1; i<=n; i++) {
			winner =(winner + k) %i;
		}
		return winner+1;
	}
	
	
	
	public static void main (String args [] ) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the n :");
		int n= sc.nextInt();
		int arr[] =new int [n];
		for(int i =0; i<n; i++) {
			arr[i]=i+1;
		}
		
		System.out.print("Enter the k :");
		int k= sc.nextInt();
		
		System.out.println("The winner :"+game(arr, k));
		System.out.println("The winner1 :"+game1(n, k));


	}

}
