// What is Recursion?
// Recursion is a programming technique where a method calls itself to solve a problem.
// Instead of using a loop (for or while), a recursive method keeps calling itself
// until it reaches a base condition, which stops the recursion.


// Why do we need recursion?
// Some problems are naturally broken into smaller versions of the same problem.
// For example:
// Example 1: Climbing Stairs
// To reach the 5th stair, you first need to reach:
// the 4th stair, or
// the 3rd stair.
// The same problem repeats again and again.
// Example 2: Folder Structure
// Folder
// │
// ├── Java
// │   ├── Arrays
// │   └── Recursion
// │
// └── Python
//     ├── Django
//     └── Flask

// A folder can contain another folder, which can contain another folder.
// This is naturally recursive.









// public class Recursion1 {

//     public static void main(String[] args) {

//         // Start printing numbers from 1
//         printno(1);
//     }

//     // Recursive method to print numbers
//     static void printno(int n) {

//         // Base condition: stop recursion when n becomes 5
//         if (n == 5) {
//             System.out.println(5); // Print the last number
//             return;                // End the function
//         }

//         // Print the current number
//         System.out.println(n);

//         // Recursive call with the next number
//         printno(n + 1);
//     }
// }










// EXAMPLE 2 binary search using recursion

public class Recursion1 {

    public static void main(String[] args) {

        // Sorted array (Binary Search works only on sorted arrays)
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 55, 99};

        // Element we want to find
        int target = 99;

        // Call the recursive binary search method
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    // Recursive Binary Search Method
    static int search(int[] arr, int target, int start, int end) {

        // Base Case:
        // If start becomes greater than end,
        // the element is not present in the array.
        if (start > end) {
            return -1;
        }

        // Calculate the middle index
        // This formula prevents integer overflow.
        int mid = start + (end - start) / 2;

        // If target is found, return its index
        if (arr[mid] == target) {
            return mid;
        }

        // If target is smaller than middle element,
        // search only in the left half.
        else if (arr[mid] > target) {
            return search(arr, target, start, mid - 1);
        }

        // Otherwise search in the right half.
        else {
            return search(arr, target, mid + 1, end);
        }
    }
}

