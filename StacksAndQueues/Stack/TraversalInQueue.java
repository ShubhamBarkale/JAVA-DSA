import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {

    // Display all elements of the queue
    private static void display(Queue<Integer> Q) {

        // Print the queue and its size
        System.out.println(Q + " " + Q.size());

        // Store original size because queue size changes during traversal
        int size = Q.size();

        // Traverse all elements
        for (int i = 0; i < size; i++) {

            // Print the front element
            System.out.print(Q.peek() + " ");

            // Remove front element and add it back
            // This moves the front element to the rear
            Q.add(Q.remove());
        }

        System.out.println();
    }

    // Add an element at a particular index
    private static void addAtIndex(Queue<Integer> Q, int idx, int val) {

        // Store current queue size
        int size = Q.size();

        // Move elements before the required index to the rear
        for (int i = 0; i < idx; i++) {
            Q.add(Q.remove());
        }

        // Add the new element at the required position
        Q.add(val);

        // Move the remaining elements to maintain the original order
        for (int i = idx; i < size; i++) {
            Q.add(Q.remove());
        }
    }

    // Return the element present at a particular index
    private static int peek(Queue<Integer> Q, int idx) {

        // Store queue size
        int size = Q.size();

        // Default answer if index is invalid
        int ans = -1;

        // Traverse the queue
        for (int i = 0; i < size; i++) {

            // Remove the front element
            int val = Q.remove();

            // Check if current index is required index
            if (i == idx) {
                ans = val;
            }

            // Add the element back to the queue
            Q.add(val);
        }

        // Return element at the given index
        return ans;
    }

    // Remove and return the element at a particular index
    private static int removeAtIndex(Queue<Integer> Q, int idx) {

        // Store queue size
        int size = Q.size();

        // Default answer if index is invalid
        int ans = -1;

        // Traverse the queue
        for (int i = 0; i < size; i++) {

            // Remove the front element
            int val = Q.remove();

            // If required index is found
            if (i == idx) {

                // Store the element
                // Do NOT add it back, so it gets removed
                ans = val;

            } else {

                // Add all other elements back
                Q.add(val);
            }
        }

        // Return the removed element
        return ans;
    }

    public static void main(String[] args) {

        // Create a Queue using LinkedList
        Queue<Integer> Q = new LinkedList<>();

        // Add elements to the queue
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);

        // Display the original queue
        display(Q);

        // Add 60 at index 2
        addAtIndex(Q, 2, 60);

        // Display queue after insertion
        display(Q);

        // Get element at index 3
        System.out.println("Peek at index 3: " + peek(Q, 3));

        // Remove element at index 2
        System.out.println("Removed: " + removeAtIndex(Q, 2));

        // Display queue after removal
        display(Q);
    }
}