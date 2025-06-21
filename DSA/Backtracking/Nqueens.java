package DSA.Backtracking;

import java.util.Scanner;

public class Nqueens {
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (board size): ");
        N = sc.nextInt();
        sc.close();

        char[][] board = new char[N][N];

        // Initialize board with '.'
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                board[i][j] = '.';

        if (solveNQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean solveNQueens(char[][] board, int row) {
        if (row == N)
            return true;

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';

                if (solveNQueens(board, row + 1))
                    return true;

                board[row][col] = '.';
            }
        }

        return false;
    }

    static boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    static void printBoard(char[][] board) {
        System.out.println("\nOne possible solution:");
        for (char[] row : board) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }
}
