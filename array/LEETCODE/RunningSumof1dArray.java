// 1480. Running Sum of 1d Array


import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        runningSum(nums);

        System.out.println(Arrays.toString(nums));
    }

    static int[] runningSum(int[] nums) {

        // Start from index 1 because the first element remains the same
        for (int i = 1; i < nums.length; i++) {

            // Add the previous running sum to the current element
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}