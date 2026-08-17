import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// T must be Number or a subclass of Number
public class wildCardExample<T extends Number> {

    private Object[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public wildCardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    // Wildcard example
    // Accepts List<Integer>, List<Double>, List<Float>, etc.
    public void getList(List<? extends Number> list) {

        for (Number num : list) {
            System.out.println(num);
        }
    }

    public void add(T num) {

        if (isfull()) {
            resize();
        }

        data[size++] = num;
    }

    private void resize() {

        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    @SuppressWarnings("unchecked")
    public T remove() {

        T removed = (T) data[--size];

        data[size] = null;

        return removed;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "wildCardExample{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        // T = Number
        wildCardExample<Number> list = new wildCardExample<>();

        for (int i = 0; i < 10; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

        // Creating Integer List
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // ? extends Number accepts List<Integer>
        list.getList(numbers);

        // Creating Double List
        List<Double> decimals = new ArrayList<>();

        decimals.add(10.5);
        decimals.add(20.5);
        decimals.add(30.5);

        // ? extends Number also accepts List<Double>
        list.getList(decimals);
    }
}