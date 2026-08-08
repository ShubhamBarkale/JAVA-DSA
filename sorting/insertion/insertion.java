// import java.util.Arrays;

// public class insertion {

//     public static void main(String[] args) {
//         int[] arr = {6, 4, 3, 2, 7, 1, 5, 3, -2};

//         isort(arr); // Calling insertion sort

//         // Printing sorted array
//         System.out.println(Arrays.toString(arr));
//     }

//     static void isort(int[] arr) {

//         // Traverse the array
//         for (int i = 0; i < arr.length - 1; i++) {

//             // Move current element to its correct position
//             for (int j = i + 1; j > 0; j--) {

//                 // Swap if left element is greater
//                 if (arr[j] < arr[j - 1]) {
//                     swap(arr, j, j - 1);
//                 } else {
//                     // If elements are already sorted, stop
//                     break;
//                 }
//             }
//         }
//     }

//     // Method to swap two elements
//     static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }




