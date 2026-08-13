public class mergSort {

    public static void conquer(int arr[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Merge two sorted halves
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Remaining elements of left half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Remaining elements of right half
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {

        // Base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Left half
        divide(arr, si, mid);

        // Right half
        divide(arr, mid + 1, ei);

        // Merge
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {

        int arr[] = {42, 7, 91, 13, 56, 2, 78, 34, 65, 19};

        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}