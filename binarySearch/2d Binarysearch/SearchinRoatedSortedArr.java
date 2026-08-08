```java
public class SearchinRoatedSortedArr {
    public static void main(String[] args) {

        // Rotated sorted array
        int arr[] = {4, 5, 6, 7, 0, 1, 2};

        // Print the pivot index
        System.out.print(findPivot(arr));
    }

    // Method to find the pivot element index
    // Pivot = largest element in the rotated sorted array
    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        // Apply Binary Search
        while (start <= end) {

            // Find middle index
            int mid = start + (end - start) / 2;

            /*
             Case 1:
             If middle element is greater than next element,
             then mid itself is the pivot.
             Example: [4,5,6,7,0,1,2]
                              ^
                             mid = 3 (7 > 0)
            */
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            /*
             Case 2:
             If middle element is smaller than previous element,
             then previous element is the pivot.
             Example: [4,5,6,7,0,1,2]
                                ^
                               mid = 4 (0 < 7)
             So pivot index = mid - 1 = 3
            */
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            /*
             Case 3:
             If middle element is less than or equal to start,
             then pivot lies on the left side.
            */
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }

            /*
             Case 4:
             Otherwise pivot lies on the right side.
            */
            else {
                start = mid + 1;
            }
        }

        // Array is not rotated
        return -1;
    }
}
```
