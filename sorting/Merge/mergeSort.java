import java.util.Arrays;   // Imports the Arrays class for copyOfRange() and toString()

public class mergeSort {

    public static void main(String[] args) {

        // Original unsorted array
        int[] arr = {5, 4, 3, 2, 1, 6, 7, 45, 8, 66, 9};

        // Call merge sort and store the sorted array
        arr = merge(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Recursive function to divide the array
    static int[] merge(int[] arr) {

        // Base case: if the array has only one element, it is already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Find the middle index
        int mid = arr.length / 2;

        // Divide the array into left half
        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));

        // Divide the array into right half
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    // Function to merge two sorted arrays
    private static int[] merge(int[] first, int[] second) {

        // Create a new array to store the merged result
        int[] mix = new int[first.length + second.length];

        // i -> first array index
        // j -> second array index
        // k -> merged array index
        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays
        while (i < first.length && j < second.length) {

            // Copy the smaller element into mix[]
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }

            // Move to the next position in the merged array
            k++;
        }

        // Copy remaining elements from first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements from second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        // Return the merged sorted array
        return mix;
    }
}
























// // withoud creating a reference array 
// import java.util.Arrays;

// public class mergeSort {

//     public static void main(String[] args) {

//         int[] arr = {5, 4, 3, 2, 1, 6, 7, 45, 8, 66, 9};

//         // Calling merge sort
//         mergeSort(arr, 0, arr.length);

//         // Printing sorted array
//         System.out.println(Arrays.toString(arr));
//     }


//     // Function to divide the array recursively
//     static void mergeSort(int[] arr, int s, int e) {

//         // Base condition
//         // If only one element is present, it is already sorted
//         if (e - s == 1) {
//             return;
//         }


//         // Finding middle index
//         int mid = s + (e - s) / 2;


//         // Divide left part
//         mergeSort(arr, s, mid);


//         // Divide right part
//         mergeSort(arr, mid, e);


//         // Merge both sorted parts
//         merge(arr, s, mid, e);
//     }



//     // Function to merge two sorted parts
//     static void merge(int[] arr, int s, int mid, int e) {


//         // Temporary array to store merged values
//         int[] mix = new int[e - s];


//         int i = s;      // Pointer for left half
//         int j = mid;    // Pointer for right half
//         int k = 0;      // Pointer for mix array



//         // Compare elements of both halves
//         while (i < mid && j < e) {

//             if (arr[i] < arr[j]) {

//                 mix[k] = arr[i];
//                 i++;

//             } else {

//                 mix[k] = arr[j];
//                 j++;

//             }

//             k++;
//         }



//         // Copy remaining elements from left half
//         while (i < mid) {

//             mix[k] = arr[i];
//             i++;
//             k++;

//         }



//         // Copy remaining elements from right half
//         while (j < e) {

//             mix[k] = arr[j];
//             j++;
//             k++;

//         }



//         // Copy merged array back into original array
//         for (int l = 0; l < mix.length; l++) {

//             arr[s + l] = mix[l];

//         }
//     }
// }