public class reverse {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7};

        int[] reverse = new int[arr.length];

        int index = 0;

        for (int idx = arr.length - 1; idx >= 0; idx--) {

            reverse[index] = arr[idx];

            index++;
        }

        // Print reversed array
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}