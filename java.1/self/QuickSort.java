public class QuickSort {

    // Partition function
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high]; // Last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // Smaller elements go to left side
            if (arr[j] < pivot) {

                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        i++;

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // Pivot index
    }

    // Quick Sort function
    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pivotIndex = partition(arr, low, high);

            // Left part
            quickSort(arr, low, pivotIndex - 1);

            // Right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = {42, 7, 91, 13, 56, 2, 78, 34, 65, 19};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}