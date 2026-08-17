import java.util.ArrayList;
// Imports the ArrayList class from Java's utility package.
// ArrayList is a dynamic array that can grow or shrink in size.

public class LamdaExpressions {

    public static void main(String[] args) {

        // Creates an ArrayList that can store Integer objects.
        // Integer is used instead of int because ArrayList works with objects.
        ArrayList<Integer> arr = new ArrayList<>();

        // for loop runs 5 times.
        // i starts from 0 and goes up to 4.
        for (int i = 0; i < 5; i++) {

            // Adds i + 1 into the ArrayList.
            //
            // i = 0 -> adds 1
            // i = 1 -> adds 2
            // i = 2 -> adds 3
            // i = 3 -> adds 4
            // i = 4 -> adds 5
            //
            // Therefore, ArrayList becomes:
            // [1, 2, 3, 4, 5]
            arr.add(i + 1);
        }

        // forEach() goes through every element of the ArrayList.
        //
        // Lambda expression:
        // (item) -> { ... }
        //
        // "item" represents each element of the ArrayList one by one.
        //
        // First: item = 1
        // Second: item = 2
        // Third: item = 3
        // Fourth: item = 4
        // Fifth: item = 5
        arr.forEach((item) -> {

            // Multiplies the current item by 2
            // and prints the result.
            //
            // item = 1 -> 1 * 2 -> 2
            // item = 2 -> 2 * 2 -> 4
            // item = 3 -> 3 * 2 -> 6
            // item = 4 -> 4 * 2 -> 8
            // item = 5 -> 5 * 2 -> 10
            System.out.println(item * 2);
        });
    }

    // A normal method named sum.
    // It accepts two int values and returns their addition.
    //
    // Example:
    // sum(10, 20) -> 30
    int sum(int a, int b) {
        return a + b;
    }
}