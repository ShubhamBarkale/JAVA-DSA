public class Search2D {
    public static void main(String[] args) {

        int target = 5;

        int[][] arr = {
            {2, 3, 7},
            {8, 5, 4},
            {3, 2, 9}
        };

        int[] result = find(arr, target);

        if (result[0] != -1) {
            System.out.println(
                "Element found at row: " + result[0] +
                ", column: " + result[1]
            );
        } else {
            System.out.println("Element not found");
        }
    }

    static int[] find(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}