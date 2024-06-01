import java.util.*;
public class NQueens {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of Queen's you want to adjust: ");
        int n= sc.nextInt();
        System.out.println();
        
        solveNQueens(n);
        sc.close();
    }

    private static void solveNQueens(int n) {
        int[] board = new int[n]; // Stores column placements for each queen
        solveNQueensUtil(board, 0, n); // Start solving from the first row (0)
    }

    private static boolean solveNQueensUtil(int[] board, int row, int n) {
        if (row == n) { // Base case: Queens placed in all rows, solution found
            printSolution(board, n);
            return true;
        }

        // Try placing a queen in each column of the current row
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row] = col; // Place queen in current row and column
                if (solveNQueensUtil(board, row + 1, n)) { // Recursively check next row
                    return true;
                }

                // Backtrack: If placement doesn't lead to a solution, remove queen and try another column
                board[row] = -1; // Remove queen from current position
            }
        }

        // If no safe position found in current row for any column, return false
        return false;
    }

    private static boolean isSafe(int[] board, int row, int col, int n) {
        // Check for attacks from queens placed in previous rows
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(row - i) == Math.abs(col - board[i])) {
                return false; // Attacking queen found
            }
        }

        // No attacks found, return true
        return true;
    }

    private static void printSolution(int[] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i] == j) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}