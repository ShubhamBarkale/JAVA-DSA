// // sumple form 


// public class IncreasingDecreasingTrianglePattern {
//     public static void main(String[] args) {
//         pattern(5);
//     }

//     static void pattern(int n) {

//         // Increasing Triangle
//         for (int row = 1; row <= n; row++) {
//             for (int col = 1; col <= row; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         // Decreasing Triangle
//         for (int row = n - 1; row >= 1; row--) {
//             for (int col = 1; col <= row; col++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// advance

// public class IncreasingDecreasingTrianglePattern{
//     public static void main(String[] args) {
//         unknown(5);
//     }

//     static void unknown(int n) {

//         // Outer loop runs from 0 to 2*n.
//         // First half prints an increasing triangle.
//         // Second half prints a decreasing triangle.
//         for (int row = 0; row <= 2 * n; row++) {

//             // Ternary Operator (condition ? value_if_true : value_if_false)
//             //
//             // If row > n:
//             //     totalColInRow = 2 * n - row
//             // Else:
//             //     totalColInRow = row
//             //
//             // It decides how many stars should be printed in each row.
//             //
//             // Example for n = 5:
//             // row : totalColInRow
//             // 0   : 0
//             // 1   : 1
//             // 2   : 2
//             // 3   : 3
//             // 4   : 4
//             // 5   : 5   <-- Maximum stars
//             // 6   : 4
//             // 7   : 3
//             // 8   : 2
//             // 9   : 1
//             // 10  : 0

//             int totalColInRow = (row > n) ? (2 * n - row) : row;

//             // Prints stars.
//             // We use <= because when totalColInRow = 0,
//             // it should still print one star.
//             for (int col = 0; col <= totalColInRow; col++) {
//                 System.out.print("* ");
//             }

//             // Move to the next line after each row.
//             System.out.println();
//         }
//     }
// }