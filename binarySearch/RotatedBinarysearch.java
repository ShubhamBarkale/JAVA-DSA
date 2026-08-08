// recursion 

public class RotatedBinarysearch {

    public static void main(String[] args) {

        // Rotated sorted array
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        // Search for 5
        System.out.println(search(arr, 5, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {

        // Base Case:
        // If start crosses end, the element doesn't exist.
        if (s > e) {
            return -1;
        }

        // Find the middle index
        int m = s + (e - s) / 2;

        // If the middle element is the target, return its index.
        if (arr[m] == target) {
            return m;
        }

        // -----------------------------------------------------
        // STEP 1 : Check which half is sorted.
        // -----------------------------------------------------

        // If the left half is sorted
        // Example:
        // [5,6,7,8 | 9,1,2,3]
        //  s      m
        if (arr[s] <= arr[m]) {

            // Check whether the target lies inside the sorted left half.

            // Example:
            // target = 6
            // left half = [5,6,7,8]
            // Since 6 lies between 5 and 8,
            // search only the left half.

            if (target >= arr[s] && target < arr[m]) {
                return search(arr, target, s, m - 1);
            }

            // Otherwise,
            // the target must be in the right half.
            return search(arr, target, m + 1, e);
        }

        // -----------------------------------------------------
        // STEP 2 : Otherwise, the right half is sorted.
        // -----------------------------------------------------

        // Example:
        // [7,8,9 | 1,2,3]
        //         m     e
        //
        // Right half = [1,2,3]

        // Check whether the target lies inside the sorted right half.

        if (target > arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }

        // Otherwise,
        // search the left half.

        return search(arr, target, s, m - 1);
    }
}