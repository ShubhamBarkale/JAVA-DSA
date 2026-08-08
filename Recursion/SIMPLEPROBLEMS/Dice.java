public class Dice {

    // Main method: execution starts here
    public static void main(String[] args) {
        dice("", 4);          // Start with an empty string and target = 4
    }

    // Recursive function
    static void dice(String p, int target) {

        // Base case
        if (target == 0) {
            System.out.println(p);   // Print one valid dice sequence
            return;
        }

        // Try every possible dice value (1 to 6)
        // i <= target prevents the target from becoming negative
        for (int i = 1; i <= 6 && i <= target; i++) {

            // Recursive call
            // p + i      -> append the current dice value to the answer
            // target - i -> reduce the remaining target
            dice(p + i, target - i);
        }
    }
}