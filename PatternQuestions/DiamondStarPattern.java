public class DiamondStarPattern {

    public static void main(String[] args) {
        design(5);
    }

    static void design(int n) {

        for (int row = 0; row < 2 * n; row++) {

            int totalColsInRow = (row > n) ? 2 * n - row : row;
            int noOfSpaces = n - totalColsInRow;

            for (int space = 0; space < noOfSpaces; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
