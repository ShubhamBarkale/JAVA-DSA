import java.util.Scanner;

public class prac10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();

        int[][] cost = new int[n][n];

        System.out.println("Enter cost matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                cost[i][j] = sc.nextInt();

        boolean[] visited = new boolean[n];

        int current = 0;
        visited[current] = true;

        int totalCost = 0;

        System.out.print("Path: " + current);

        for (int count = 1; count < n; count++) {

            int next = -1;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (!visited[i] && cost[current][i] < min) {
                    min = cost[current][i];
                    next = i;
                }
            }

            visited[next] = true;
            System.out.print(" -> " + next);
            totalCost += min;
            current = next;
        }

        totalCost += cost[current][0]; // return to start
        System.out.println(" -> 0");

        System.out.println("Total Cost = " + totalCost);

        sc.close();
    }
}