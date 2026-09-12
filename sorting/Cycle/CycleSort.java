// import java.util.Arrays;

// public class CycleSort {
//     public static void main(String[] args) {
//         int[] arr = {3, 5, 2, 1, 4};
//         sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     static void sort(int[] arr) {
//         int i = 0;

//         while (i < arr.length) {
//             int correct = arr[i] - 1;

//             if (arr[i] != arr[correct]) {
//                 swap(arr, i, correct);
//             } else {
//                 i++;
//             }
//         }
//     }

//     static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }
























// //  amazon 

// leet code 268  how to search missing no 

// class Solution {
//     public int missingNumber(int[] nums) {
//         sort(nums);

//         // Find the first index where the number doesn't match the index
//         for (int index = 0; index < nums.length; index++) {
//             if (nums[index] != index) {
//                 return index;
//             }
//         }

//         // If all indices match, the missing number is n
//         return nums.length;
//     }

//     static void sort(int[] nums) {
//         int i = 0;

//         while (i < nums.length) {
//             int correct = nums[i];

//             if (nums[i] < nums.length && nums[i] != nums[correct]) {
//                 swap(nums, i, correct);
//             } else {
//                 i++;
//             }
//         }
//     }

//     static void swap(int[] nums, int first, int second) {
//         int temp = nums[first];
//         nums[first] = nums[second];
//         nums[second] = temp;
//     }
// }











// google 
// leetcode 488 finf all no disappeared in an array

  
  
// public class CycleSort {

//     public static void main(String[] args) {
//         int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

//         int[] ans = solution(nums);

//         System.out.println(Arrays.toString(ans));
//     }

//     static int[] solution(int[] nums) {
//         int i = 0;

//         // Cyclic Sort
//         while (i < nums.length) {
//             int correct = nums[i] - 1;

//             if (nums[i] != nums[correct]) {
//                 swap(nums, i, correct);
//             } else {
//                 i++;
//             }
//         }

//         // Count missing numbers
//         int count = 0;
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != j + 1) {
//                 count++;
//             }
//         }

//         // Store missing numbers
//         int[] ans = new int[count];
//         int k = 0;

//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != j + 1) {
//                 ans[k] = j + 1;
//                 k++;
//             }
//         }

//         return ans;
//     }

//     static void swap(int[] nums, int first, int second) {
//         int temp = nums[first];
//         nums[first] = nums[second];
//         nums[second] = temp;
//     }
// }