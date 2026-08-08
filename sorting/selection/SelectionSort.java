// import java.util.Arrays;

// public class SelectionSort {

//     public static void main(String[] args) {

//         // Original array
//         int[] arr = {6, 4, 3, 2, 7, 1, 5, 3, -2};

//         // Call selection sort method
//         Selection(arr);

//         // Print sorted array
//         System.out.println(Arrays.toString(arr));
//     }

//     static void Selection(int[] arr) {

//         // Loop for every element in the array
//         for (int i = 0; i < arr.length; i++) {

//             // Find the last index of the unsorted part
//             int last = arr.length - i - 1;

//             // Find index of maximum element
//             // between index 0 and last
//             int maxIndex = getMaxIndex(arr, 0, last);

//             // Put maximum element at its correct position
//             swap(arr, maxIndex, last);
//         }
//     }






//     // Method to swap two elements
//     static void swap(int[] arr, int first, int second) {

//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }

//     // Method to find index of maximum element
//     // from start to end index
//     public static int getMaxIndex(int[] arr, int start, int end) {

//         // Assume first element is maximum
//         int max = start;

//         // Traverse the unsorted part
//         for (int i = start; i <= end; i++) {

//             // Update max index if larger element is found
//             if (arr[max] < arr[i]) {
//                 max = i;
//             }
//         }

//         // Return index of maximum element
//         return max;
//     }
// } 