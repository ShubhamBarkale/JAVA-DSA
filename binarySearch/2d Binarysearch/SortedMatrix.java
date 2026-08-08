// public class SortedMatrix {

//     public static void main(String[] args) {

//         int[][] matrix = {
//                 {1, 2, 3, 4},
//                 {5, 6, 7, 8},
//                 {9, 10, 11, 12},
//                 {13, 14, 15, 16}
//         };

//         int[] ans = search(matrix, 10);
//         System.out.println("Row = " + ans[0] + ", Col = " + ans[1]);
//     }

//     static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {

//         while (cStart <= cEnd) {
//             int mid = cStart + (cEnd - cStart) / 2;

//             if (matrix[row][mid] == target) {
//                 return new int[]{row, mid};
//             }

//             if (matrix[row][mid] < target) {
//                 cStart = mid + 1;
//             } else {
//                 cEnd = mid - 1;
//             }
//         }

//         return new int[]{-1, -1};
//     }

//     static int[] search(int[][] matrix, int target) {

//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         if (rows == 0) {
//             return new int[]{-1, -1};
//         }

//         if (rows == 1) {
//             return binarySearch(matrix, 0, 0, cols - 1, target);
//         }

//         int rStart = 0;
//         int rEnd = rows - 1;
//         int cMid = cols / 2;

//         // Reduce the rows to two
//         while (rStart < (rEnd - 1)) {
//             int mid = rStart + (rEnd - rStart) / 2;

//             if (matrix[mid][cMid] == target) {
//                 return new int[]{mid, cMid};
//             }

//             if (matrix[mid][cMid] < target) {
//                 rStart = mid;
//             } else {
//                 rEnd = mid;
//             }
//         }

//         // Check the middle column of the two remaining rows
//         if (matrix[rStart][cMid] == target) {
//             return new int[]{rStart, cMid};
//         }

//         if (matrix[rStart + 1][cMid] == target) {
//             return new int[]{rStart + 1, cMid};
//         }

//         // Search in 1st half
//         if (target <= matrix[rStart][cMid - 1]) {
//             return binarySearch(matrix, rStart, 0, cMid - 1, target);
//         }

//         // Search in 2nd half
//         if (target >= matrix[rStart][cMid + 1] &&
//                 target <= matrix[rStart][cols - 1]) {
//             return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
//         }

//         // Search in 3rd half
//         if (target <= matrix[rStart + 1][cMid - 1]) {
//             return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
//         }

//         // Search in 4th half
//         return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
//     }
// }