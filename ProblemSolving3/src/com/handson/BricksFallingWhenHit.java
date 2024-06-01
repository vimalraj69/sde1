package com.handson;

import java.util.Scanner;

public class BricksFallingWhenHit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter num: ");
        int num = s.nextInt();
        
        System.out.print("Enter matrix elements: ");
        int[][] arr = new int[num][4];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        
        System.out.print("Enter hit row: ");
        int num2 = s.nextInt();
        
        System.out.print("Enter hit elements: ");
        int[][] hit = new int[num2][2];
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < 2; j++) {
                hit[i][j] = s.nextInt();
            }
        }
        
        int c = 0, bri = 0, cou = 0, d = 0, e = 0;
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 4; j++) {
                c = 0;
                
                for (int k = 0; k < 2; k++) {
                    if (i == hit[k][0] && j == hit[k][1]) {
                        arr[i][j] = 0;
                        c++;
                    }
                }
                
                if (c != 0) {
                    cou++;
                    bri = 0;
                    for (int l = 0; l < 4; l++) {
                        if (arr[i][l] == 1) {
                            bri++;
                        }
                    }
                }
                
                if (bri == 2) {
                    cou++;
                    e++;
                    System.out.print(cou);
                    d = 1;
                    break;
                }
            }
        }
        
        if (d == 0 && e != 0) {
            System.out.print(cou);
        } else if (e == 0) {
            System.out.print("[0,0]");
        }
    }
}


