
public class rowMaxSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxSum = Integer.MIN_VALUE;
        int row = -1;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                row = i;
            }
        }

        System.out.println("Row index: " + row);
        System.out.println("Maximum row sum: " + maxSum);
    }
}
