import java.util.Arrays;

public class CustomArrayList {

    // This array stores the actual elements
    private int[] data;

    // Initial capacity of our custom ArrayList
    private int DEFAULT_SIZE = 10;

    // Keeps track of how many elements are currently stored
    private int size = 0;


    // Constructor
    // It creates an integer array of size 10
    public CustomArrayList() {
        data = new int[DEFAULT_SIZE];
    }


    // Adds a new element to the ArrayList
    public void add(int num) {

        // Before adding, check whether the array is full
        if (isfull()) {

            // If full, create a bigger array
            resize();
        }

        // Add the number at the current size index
        // Then increase size by 1
        data[size++] = num;
    }


    // Creates a new array with double the capacity
    private void resize() {

        // Example:
        // Old array = 10
        // New array = 20
        int[] temp = new int[data.length * 2];

        // Copy all old elements into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        // Make data point to the new bigger array
        data = temp;
    }


    // Checks whether the array is full
    private boolean isfull() {

        // If size and array length are equal,
        // there is no empty space left
        return size == data.length;
    }


    // Removes the last element from the list
    public int remove() {

        // Decrease size first, then get that element
        int removed = data[--size];

        // Return the removed element
        return removed;
    }


    // Returns the element at the given index
    public int get(int index) {
        return data[index];
    }


    // Returns the number of elements currently stored
    public int size() {
        return size;
    }


    // Replaces the element at the given index
    public void set(int index, int value) {
        data[index] = value;
    }


    // Converts our CustomArrayList into a String
    // Arrays.toString() prints the contents of the array
    @Override
    public String toString() {

        return "CustomArrayList{" +
               "data=" + Arrays.toString(data) +
               ", size=" + size +
               '}';
    }


    // Program execution starts here
    public static void main(String[] args) {

        // Create our CustomArrayList object
        CustomArrayList list = new CustomArrayList();

        // Add elements
        list.add(14);
        list.add(25);
        list.add(30);

        // Print the CustomArrayList
        System.out.println(list);
    }
}