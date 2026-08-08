public class DimondnoTriangle {
    public static void main(String[] args) {
        Triangle(5);
    }

    static void Triangle(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {

            int totalcol = (row > n) ? (2 * n - row) : row;

            // Spaces
            for (int space = 0; space < n - totalcol; space++) {
                System.out.print("  ");
            }

            // Decreasing numbers
            for (int col = totalcol; col >= 1; col--) {
                System.out.print(col + " ");
            }

            // Increasing numbers
            for (int col = 2; col <= totalcol; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}