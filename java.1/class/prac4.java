import java.util.Scanner;

public class prac4{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] profit = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of item " + (i + 1) + ": ");
            weight[i] = sc.nextInt();

            System.out.print("Enter profit of item " + (i + 1) + ": ");
            profit[i] = sc.nextInt();
        }

        System.out.print("Enter capacity of knapsack: ");
        int W = sc.nextInt();

        int[][] dp = new int[n + 1][W + 1];

        // DP logic
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {

                if (weight[i - 1] <= w) {
                    int include = profit[i - 1] + dp[i - 1][w - weight[i - 1]];
                    int exclude = dp[i - 1][w];

                    dp[i][w] = Math.max(include, exclude);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("Maximum Profit = " + dp[n][W]);

        sc.close();
    }
}