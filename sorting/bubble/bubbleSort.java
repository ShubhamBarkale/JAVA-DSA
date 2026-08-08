// import java.util.Arrays;

// public class bubbleSort {
//     public static void main(String[] args) {
//         int[] arr = {5, 4, 3, 2, 1, -1};

//         bubble(arr);

//         System.out.println(Arrays.toString(arr));
//     }

//     static void bubble(int[] arr) {

//         boolean swapped;

//         // Number of passes
//         for (int i = 0; i < arr.length; i++) {

//             swapped = false;

//             // Compare adjacent elements
//             for (int j = 1; j < arr.length - i; j++) {

//                 if (arr[j] < arr[j - 1]) {

//                     // Swap
//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;

//                     swapped = true;
//                 }
//             }

//             // If no swapping happens, array is already sorted
//             if (!swapped) {
//                 break;
//             }
//         }
//     }
// }

















// /// count the no of swaps
// import java.util.Arrays;

// public class bubbleSort {
//     public static void main(String[] args) {
//         int[] arr = {5, 1, 4, 2, 8};

//         bubble(arr);

//         System.out.println(Arrays.toString(arr));
//     }

//     static void bubble(int[] arr) {
//         boolean swapped;
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {

//             swapped = false;

//             for (int j = 1; j < arr.length - i; j++) {

//                 if (arr[j] < arr[j - 1]) {

//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;

//                     count++;          // count swaps
//                     swapped = true;  // swap happened
//                 }
//             }

//             if (!swapped) {
//                 break;
//             }
//         }

//         System.out.println("Total swaps = " + count);
//     }
// }
























// // sort in reverce order

// import java.util.Arrays;

// public class bubbleSort {
//     public static void main(String[] args) {
//         int[] arr = {5, 1, 4, 2, 8};

//         bubble(arr);

//         System.out.println(Arrays.toString(arr));
//     }

//     static void bubble(int[] arr) {
//         boolean swapped;
//         int count = 0;

//         for (int i = 0; i < arr.length; i++) {

//             swapped = false;

//             for (int j = 1; j < arr.length - i; j++) {

//                 if (arr[j] >arr[j - 1]) { /// for decending order

//                     int temp = arr[j];
//                     arr[j] = arr[j - 1];
//                     arr[j - 1] = temp;

                  
//                     swapped = true;  // swap happened
//                 }
//             }

//             if (!swapped) {
//                 break;
//             }
//         }

//         System.out.println("Total swaps = " + count);
//     }
// }