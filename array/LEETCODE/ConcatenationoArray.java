// 1929. Concatenation of Array

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationoArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Input elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create result array of double size
        int[] result = new int[2 * n];

        // Copy first half
        for (int i = 0; i < n; i++) {
            result[i] = nums[i];
        }

        // Copy second half
        for (int i = 0; i < n; i++) {
            result[n + i] = nums[i];
        }

        // Print result
        System.out.println("Concatenated Array:");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}



















// second method

// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Input size of first array
//         System.out.print("Enter size of first array: ");
//         int n1 = sc.nextInt();

//         int[] arr1 = new int[n1];

//         // Input first array elements
//         System.out.println("Enter elements of first array:");
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = sc.nextInt();
//         }

//         // Input size of second array
//         System.out.print("Enter size of second array: ");
//         int n2 = sc.nextInt();

//         int[] arr2 = new int[n2];

//         // Input second array elements
//         System.out.println("Enter elements of second array:");
//         for (int i = 0; i < n2; i++) {
//             arr2[i] = sc.nextInt();
//         }

//         // Create result array
//         int[] result = new int[n1 + n2];

//         // Copy first array into result
//         System.arraycopy(arr1, 0, result, 0, n1);

//         // Copy second array into result
//         System.arraycopy(arr2, 0, result, n1, n2);

//         // Print result
//         System.out.println("Concatenated Array:");
//         System.out.println(Arrays.toString(result));

//         sc.close();
//     }
// }