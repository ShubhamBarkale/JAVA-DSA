 public class SquareOfNo{
    public static void main(String[] args) {
        Square(5);
    }
   static void Square(int n) {
    int original = n;
    n = 2 * n;

    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {

            int atEveryIndex = Math.min(
                    Math.min(row, col),
                    Math.min(n - row, n - col)
            );

            System.out.print((original - atEveryIndex) + " ");
        }
        System.out.println();
    }
}
}