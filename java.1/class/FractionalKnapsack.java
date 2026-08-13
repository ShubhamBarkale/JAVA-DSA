



import java.util.Scanner;

public class FractionalKnapsack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] weight = new int[n];
        int[] profit = new int[n];
        double[] ratio = new double[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of item " + (i + 1) + ": ");
            weight[i] = sc.nextInt();

            System.out.print("Enter profit of item " + (i + 1) + ": ");
            profit[i] = sc.nextInt();

            ratio[i] = (double) profit[i] / weight[i];
        }

        // Simple sorting (Bubble Sort based on ratio)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ratio[j] < ratio[j + 1]) {

                    // swap ratio
                    double temp = ratio[j];
                    ratio[j] = ratio[j + 1];
                    ratio[j + 1] = temp;

                    // swap weight
                    int tempW = weight[j];
                    weight[j] = weight[j + 1];
                    weight[j + 1] = tempW;

                    // swap profit
                    int tempP = profit[j];
                    profit[j] = profit[j + 1];
                    profit[j + 1] = tempP;
                }
            }
        }

        System.out.print("Enter capacity of knapsack: ");
        int W = sc.nextInt();

        double totalProfit = 0;

        // Greedy selection
        for (int i = 0; i < n; i++) {

            if (weight[i] <= W) {
                totalProfit += profit[i];
                W -= weight[i];
            } else {
                totalProfit += profit[i] * ((double) W / weight[i]);
                break;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);

        sc.close();
    }
}