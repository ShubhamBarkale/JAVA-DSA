// Generics means writing a class, method, or collection that can work with different data types while still providing type safety.


import java.util.Arrays;

// T represents a generic type
// The class can work with Integer, String, Double, etc.
public class CustomGenericArrayList<T> {

    // Object[] is used internally because Java does not allow
    // direct creation of generic arrays like new T[]
    private Object[] data;

    private int DEFAULT_SIZE = 10;

    // Number of elements currently stored
    private int size = 0;


    // Constructor
    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }


    // Add an element of type T
    public void add(T num) {

        // If array is full, increase its size
        if (isfull()) {
            resize();
        }

        // Add element and increase size
        data[size++] = num;
    }


    // Increase array capacity
    private void resize() {

        // Create a new array with double capacity
        Object[] temp = new Object[data.length * 2];

        // Copy old elements
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        // Point data to the new array
        data = temp;
    }


    // Check whether array is full
    private boolean isfull() {
        return size == data.length;
    }


    // Remove the last element
    @SuppressWarnings("unchecked")
    public T remove() {

        T removed = (T) data[--size];

        // Optional: remove reference from old position
        data[size] = null;

        return removed;
    }


    // Get element at a particular index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }


    // Return number of elements
    public int size() {
        return size;
    }


    // Replace element at an index
    public void set(int index, T value) {
        data[index] = value;
    }


    @Override
    public String toString() {
        return "CustomGenericArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {

        // T becomes Integer
        CustomGenericArrayList<Integer> list =
                new CustomGenericArrayList<>();

        list.add(14);
        list.add(25);
        list.add(30);

        System.out.println(list);


        // T becomes String
        CustomGenericArrayList<String> names =
                new CustomGenericArrayList<>();

        names.add("Shubham");
        names.add("Rahul");
        names.add("Amit");

        System.out.println(names);
    }
}