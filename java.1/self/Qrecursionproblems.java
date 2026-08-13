

// Q tower oh hanoi


// public class Qrecursionproblems {

//     // Recursive function to solve Tower of Hanoi problem
//     public static void tovweofHanoi(int n, String src, String helper, String dest) {

//       7
//         // Step 3:
//         // Move the (n-1) disks from helper to destination using source as helper
//         tovweofHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String[] args) {

//         // Number of disks
//         int n = 3;

//         // Function call
//         // s = source
//         // h = helper
//         // d = destination
//         tovweofHanoi(n, "s", "h", "d");
//     }
// }
























// public class Qrecursionproblems {

//     public static void printRevtring(String str, int idx) {

//         // Base case
//         if (idx == 0) {
//             System.out.print(str.charAt(idx));
//             return;
//         }

//         // Print current character
//         System.out.println(str.charAt(idx));

//         // Recursive call
//         printRevtring(str, idx - 1);
//     }

//     public static void main(String[] args) {

//         String str = "abcd";

//         printRevtring(str, str.length() - 1);
//     }
// }




















// public class Qrecursionproblems {

//     public static int first = -1;
//     public static int last = -1;

//     public static void occurance(String str, int idx, char element) {

//         // Base case
//         if (idx == str.length()) {
//             System.out.println("First occurrence : " + first);
//             System.out.println("Last occurrence : " + last);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         if (currChar == element) {

//             if (first == -1) {
//                 first = idx;
//             } else {
//                 last = idx;
//             }
//         }

//         // Recursive call
//         occurance(str, idx + 1, element);
//     }

//     public static void main(String[] args) {

//         String str = "abchhfakuudgjjsbaaajujsaahbaanhsayhwqjad";

//         occurance(str, 0, 'a');
//     }
// }














// Check if array is strictly increasing using recursion

public class Qrecursionproblems {

    public static boolean issorted(int arr[], int idx) {

        // Base case:
        // If we reach the last element,
        // the array is sorted
        if (idx == arr.length - 1) {
            return true;
        }

        // Check current element with next element
        if (arr[idx] < arr[idx + 1]) {

            // Recursive call for next index
            return issorted(arr, idx + 1);

        } else {

            // If current element is greater
            // or equal, array is not strictly increasing
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9};

        // Print result
        System.out.println(issorted(arr, 0));
    }
}