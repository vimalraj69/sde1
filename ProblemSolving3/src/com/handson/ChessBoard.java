package com.handson;

import java.util.Scanner;

public class ChessBoard {

	
	    public static int movesToChessboard(int[][] board) {
	        int n = board.length;
	        int rowMask = 0, colMask = 0, rowCnt = 0, colCnt = 0;

	        for (int i = 0; i < n; i++) {
	            rowMask |= board[0][i] << i;
	            colMask |= board[i][0] << i;
	        }

	        int altRow = (1 << (n / 2 + n % 2)) - 1;
	        int altCol = (1 << (n / 2)) - 1;
	        altRow = altRow | (altRow << 1);
	        altCol = altCol | (altCol << 1);

	        for (int i = 0; i < n; i++) {
	            int row = 0, col = 0;
	            for (int j = 0; j < n; j++) {
	                row |= board[i][j] << j;
	                col |= board[j][i] << j;
	            }
	            if (row != rowMask && row != (~rowMask & ((1 << n) - 1))) return -1;
	            if (col != colMask && col != (~colMask & ((1 << n) - 1))) return -1;
	            if (row == rowMask) rowCnt++;
	            if (col == colMask) colCnt++;
	        }

	        int rowMoves = Math.min(Integer.bitCount(rowMask ^ altRow), n - Integer.bitCount(rowMask ^ altRow)) / 2;
	        int colMoves = Math.min(Integer.bitCount(colMask ^ altCol), n - Integer.bitCount(colMask ^ altCol)) / 2;

	        if ((rowCnt != n / 2 && rowCnt != (n + 1) / 2) || (colCnt != n / 2 && colCnt != (n + 1) / 2)) return -1;

	        return rowMoves + colMoves;
	    }
	
	 public static void main(String[] args) {
	        
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the board: ");
	        int n = scanner.nextInt();
	        int[][] board = new int[n][n];
	        System.out.println("Enter the elements of the board (0 or 1): ");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                board[i][j] = scanner.nextInt();
	            }
	        }
	        System.out.print(movesToChessboard(board));
	        
	        
	    }


}
