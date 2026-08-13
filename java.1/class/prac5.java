import java.util.Scanner;

public class prac5 {

    static int n;
    static int[][] board;

    // Check if safe to place queen
    static boolean isSafe(int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1)
                return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    // Solve using backtracking
    static boolean solve(int row) {

        if (row == n) {
            return true;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(row, col)) {

                board[row][col] = 1; // place queen

                if (solve(row + 1)) {
                    return true;
                }

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    // Print solution
    static void printBoard() {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (board[i][j] == 1) {
                System.out.print("Q ");
            } else {
                System.out.print(". ");
            }

        }
        System.out.println();
    }
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of queens: ");
        n = sc.nextInt();

        board = new int[n][n];

        if (solve(0)) {
            System.out.println("Solution:");
            printBoard();
        } else {
            System.out.println("No solution exists");
        }

        sc.close();
    }
}