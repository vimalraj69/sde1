package com.handson;

import java.util.*;

class XORQueriesofaSubarray {
  static void xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXOR = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixXOR[i + 1] = prefixXOR[i] ^ arr[i];
        }

        List<Integer> result = new ArrayList<>();
        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            System.out.print((prefixXOR[right + 1] ^ prefixXOR[left])+" ");
        }

        
    }

    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elememts:");
		for(int i =0 ;i < size; i++) {
			arr[i]=sc.nextInt()	;	
			}
		System.out.println("Enter size:");
		int n= sc.nextInt();
		int q[][] =new int [n][2];
		for(int i =0 ;i< n;i++) {
			for(int j=0;j<2;j++) {
				q[i][j]=sc.nextInt();
			}
		}
		
		xorQueries(arr, q);
		

		
		sc.close();

    }
}

