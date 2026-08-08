
// import java.util.ArrayList;

// public class SearchEliment{
//     public static void main(String[] args) {
//         int [] arr={1,2,4,7,9,78,6,5,14};
//         int target=14;
//         int index=0;
//         System.out.print(Search(arr, target, index));
//     }
//     static boolean Search(int [] arr,int target,int index){
//        if(index==arr.length){
//         return false;
//        }
//        return arr[index]==target || Search(arr,target,index+1);
//     }
// }




 








// // return index value 
// public class SearchEliment{
//     public static void main(String[] args) {
//         int [] arr={1,2,4,7,9,78,6,5,14};
//         int target=14;
//         int index=0;
//         System.out.print(Search(arr, target, index));
//     }
//     static int Search(int [] arr,int target,int index){
//        if(index==arr.length){
//         return -1;
//        }
//        if(arr[index]==target){
//         return index;
//        }else{
//        return  Search(arr,target,index+1);
//        }
//     }
// }
















// // what if the no is repeated how to get ther both index

// public class SearchEliment{
//     public static void main(String[] args) {
//         int [] arr={1,2,4,7,14,9,78,6,5,14};
//         int target=14;
//         int index=0;
//         Search(arr,target,0);
//         System.out.println(list);

//     }
//     static ArrayList<Integer>list=new ArrayList<>();
//     static void  Search(int [] arr,int target,int index){
//        if(index==arr.length){
//         return ;
//        }
//        if(arr[index]==target){
//        list.add(index);
//        }
//         Search(arr,target,index+1);
//     }
// }
