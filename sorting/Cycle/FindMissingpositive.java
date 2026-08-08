// find first missing positive 41  leet code not solved ;


public class FindMissingpositive {

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};

        int ans = find(nums);
       System.out.println(ans  );
    }

    static int find(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 &&
                nums[i] <= nums.length &&
                nums[i] != nums[correct]) {

                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Search for first missing positive
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}