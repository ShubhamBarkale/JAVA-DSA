
    public static void main(String[] args) {
        int[]arr={-12,-4,1,2,3,4,5,6,7,8,9,10};
        int target=6;
        int ans=Bs(arr,target);
        System.out.println("the target element is"+ ans);

       

        
    }
    static int Bs(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
    while(start<=end){
      int mid = start + (end - start) / 2;
      if(target<arr[mid]){
        end=mid-1;
      }
      else if(target>arr[mid]){
       start=mid+1;
      }
      else{
        return mid;
      }
    }
    return -1;
   
 }





// top compines questions 
// public class BinarySearch{
//     public static void main(String[] args) {
//       int []arr={1,2,3,4,5,6,7,8,9,10};
//       int target=6;
//       int ans=cealing(arr,target);
//       System.out.println(ans);

//     }
//     static int cealing(int[]arr,int tagret){
//       int start=0;
//       int end =arr.length-1;
      

//       while (start<=end){
//         int mid=(start+(end-start))/2;
//         if(tagret<arr[mid]){
//           end=mid-1;

//         }
//          else if (tagret>arr[mid]){
//             start=mid+1;
//         }
//         else{
//           return mid;
//         }

//       }
//       return start;
//           }
// }













// public class BinarySearch{
//     public static void main(String[] args) {
//       int []arr={1,2,3,4,5 ,7,8,9,10};
//       int target=6;
//       int ans=floor(arr,target);
//       System.out.println(ans);

//     }
//     static int floor(int[]arr,int tagret){
//       int start=0;
//       int end =arr.length-1;
      

//       while (start<=end){
//         int mid=(start+(end-start))/2;
//         if(tagret<arr[mid]){
//           end=mid-1;

//         }
//          else if (tagret>arr[mid]){
//             start=mid+1;
//         }
//         else{
//           return mid;
//         }

//       }
//       return start;
//           }
// }







// public class BinarySearch {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,9,10,12,15,18,20};
//         int target = 18;

//         System.out.println(findRange(arr, target));
//     }

//     static int findRange(int[] arr, int target) {
//         int start = 0;
//         int end = 1;

//         while (target > arr[end]) {
//             int newStart = end + 1;

//             // double the size of the box
//             end = end + (end - start + 1) * 2;

//             start = newStart;
//         }

//         return binarySearch(arr, target, start, end);
//     }

//     static int binarySearch(int[] arr,
//                             int target,
//                             int start,
//                             int end) {

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (target < arr[mid]) {
//                 end = mid - 1;
//             } else if (target > arr[mid]) {
//                 start = mid + 1;
//             } else {
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }




