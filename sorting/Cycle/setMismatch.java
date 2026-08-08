// leet code nno 645 not solved 

// import java.util.Arrays;

// public class setMismatch {

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 2, 4};

//         System.out.println(Arrays.toString(findErrorNums(nums)));
//     }

//     static int[] findErrorNums(int[] nums) {
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

//         // Find duplicate and missing number
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != j + 1) {
//                 return new int[]{nums[j], j + 1};
//             }
//         }

//         return new int[]{-1, -1};
//     }

//     static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }