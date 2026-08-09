public class NQueen {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];

        int result = queens(board, 0);

        System.out.println("Total solutions: " + result);
    }

    static int queens(boolean[][] board, int row) {

        // All rows are filled
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // Try every column in the current row
        for (int col = 0; col < board.length; col++) {

            // Check whether queen can be placed
            if (isSafe(board, row, col)) {

                board[row][col] = true;

                count += queens(board, row + 1);

                // Backtracking
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // Check vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper-left diagonal
        int maxLeft = Math.min(row, col);

        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check upper-right diagonal
        int maxRight = Math.min(row, board.length - 1 - col);

        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {

        for (boolean[] row : board) {

            for (boolean element : row) {

                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("x ");
                }
            }

            System.out.println();
        }
    }
}