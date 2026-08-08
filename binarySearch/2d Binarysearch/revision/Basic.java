
//     public static void main(String[] args){
//         int arr[]={1,2,3,4,5,6,7,8,9,10};
//         int target=7;

//         int ans=Ftarget(arr, target);
//         System.out.print("the targey element is at position :-  "+ans);


//     }
//    static int Ftarget(int arr[],int target){
//     int start=0;
//     int end=arr.length-1;
//     while (start<=end){
//         int mid=start+(end-start)/2;
//         if(arr[mid]==target){
//             return mid;
//         }
//         if(arr[mid]<target){
//             start=mid+1;
//         }
//         if(arr[mid]>target){
//             end=mid-1;
//         }

//     }
//     return -1;
        
//     }
//  }








// // floor problem
// public class Basic {
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,8,9,10};
//         int target = 7;

//         int ans = Floor(arr, target);
//         System.out.println("Floor is : " + ans);
//     }

//     static int Floor(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return arr[mid];
//             }

//             if (arr[mid] < target) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }

//         return arr[end];
//     }
// }







// for ceiling 
public class Basic {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;

        int ans = ceiling(arr, target);

        System.out.println("Ceiling is : " + ans);
    }

    // Method to find the ceiling of a target
    // Ceiling = smallest element >= target
    static int ceiling(int[] arr, int target) {

        // If target is greater than the largest element,
        // then ceiling does not exist.
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        // Starting index
        int start = 0;

        // Last index
        int end = arr.length - 1;

        // Binary Search
        while (start <= end) {

            // Find middle index safely
            int mid = start + (end - start) / 2;

            // Target found
            // Target itself is the ceiling
            if (arr[mid] == target) {
                return arr[mid];
            }

            // Target is greater,
            // so ignore left half
            if (arr[mid] < target) {
                start = mid + 1;
            }
            // Target is smaller,
            // so ignore right half
            else {
                end = mid - 1;
            }
        }

        /*
         After loop:

         end   -> Floor index
         start -> Ceiling index

         Therefore return arr[start]
        */
        return arr[start];
    }
}