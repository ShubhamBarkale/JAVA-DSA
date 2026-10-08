public class basicSort {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 2, 9, 7, 3, 6, 4, 10, 5};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        print(arr);
    }

    static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}