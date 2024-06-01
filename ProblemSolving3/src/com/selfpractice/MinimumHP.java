package com.selfpractice;

import java.util.*;

public class MinimumHP {

    public static int minimumHp(int n, int m, int[][] arr) {
        int[][] dp = new int[n][m];

        dp[n - 1][m - 1] = Math.max(1, 1 - arr[n - 1][m - 1]);

        for (int i = m - 2; i >= 0; i--) {
            dp[n - 1][i] = Math.max(1, dp[n - 1][i + 1] - arr[n - 1][i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            dp[i][m - 1] = Math.max(1, dp[i + 1][m - 1] - arr[i][m - 1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                dp[i][j] = Math.min(Math.max(1, dp[i + 1][j] - arr[i][j]), Math.max(1, dp[i][j + 1] - arr[i][j]));
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int n = sc.nextInt();

        System.out.print("Enter the col: ");
        int m = sc.nextInt();

        int[][] board = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

     
        System.out.println( minimumHp(n, m, board));

        sc.close();
    }
}

