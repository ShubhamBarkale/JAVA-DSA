import java.util.ArrayList;

public class ArrrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add elements
        list.add(10);
        list.add(20);

        System.out.println("List: " + list);

        // Get element at index 0
        System.out.println("Element: " + list.get(0));

        // Change element at index 0
        list.set(0, 50);
        System.out.println("After set: " + list);

        // Remove element at index 1
        list.remove(1);
        System.out.println("After remove: " + list);

        // Get size
        System.out.println("Size: " + list.size());

        // Check whether 50 exists
        System.out.println("Contains 50: " + list.contains(50));
    }
}