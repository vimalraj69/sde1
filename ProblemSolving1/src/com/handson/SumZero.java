package com.handson;

import java.util.*;

public class SumZero {
    public static void sumZero(int n) {
        List<Integer> l = new ArrayList<>();
        if(n%2==0){
            for (int i = 1;i <=n / 2;i++) {
                l.add(i);
                l.add(-i);
            }
        }else{
            for (int i = 1;i<= n/2;i++) {
                l.add(i);
                l.add(-i);
            }
            l.add(0);
        }
        for(int i : l) {
        	System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

         
        System.out.println("final Array :");
        sumZero(n);

        sc.close();
    }
}

