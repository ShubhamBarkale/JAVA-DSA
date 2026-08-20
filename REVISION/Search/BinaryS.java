public class BinaryS {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;

        int ans = BinarySearch(arr, target);

        System.out.println(ans);
    }

    static int BinarySearch(int[] arr, int T) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (T < arr[mid]) {
                end = mid - 1;
            }
            else if (T > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}