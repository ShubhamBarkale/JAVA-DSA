import java.util.Scanner;

class MatrixThread extends Thread {

    int row;
    int[][] A, B, C;
    int n, p;

    MatrixThread(int row, int[][] A, int[][] B, int[][] C, int n, int p) {
        this.row = row;
        this.A = A;
        this.B = B;
        this.C = C;
        this.n = n;
        this.p = p;
    }

    public void run() {

        for (int j = 0; j < p; j++) {
            C[row][j] = 0;

            for (int k = 0; k < n; k++) {
                C[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}

public class prac7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of A: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.print("Enter columns of B: ");
        int p = sc.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] C = new int[m][p];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                B[i][j] = sc.nextInt();

        // Create threads
        MatrixThread[] threads = new MatrixThread[m];

        for (int i = 0; i < m; i++) {
            threads[i] = new MatrixThread(i, A, B, C, n, p);
            threads[i].start();
        }

        // Wait for threads to finish
        try {
            for (int i = 0; i < m; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print result
        System.out.println("Result matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}