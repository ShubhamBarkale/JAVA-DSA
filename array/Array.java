
//         int[]num= new int[5];
//         // num[]={1,2,3,4,5,};
        
//         for (int i = 0; i < num.length; i++) {
//             num[i]= sc.nextInt();
//         }
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i]);
//         }

//     }
// }




// import java.util.Scanner;
// public  class Array{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter the values ");
//         int [] array=new int[5];

//         for (int i = 0; i <array.length; i++) {
//             array[i]=sc.nextInt();
//         }
//         System.out.println("elements of an array");
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i]+" ");
//         }
//         sc.close();
//     }
// }















// public  class Array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the elements");
//         int [][]arr=new int[3][3];
         
//          for (int row = 0; row < arr.length; row++) {
//             for (int colum = 0; colum < arr[row].length; colum++) {
//                 arr[row][colum]=sc.nextInt();
//             }
//          }
//          System.out.println("printing the array");
//             for (int row = 0; row < arr.length; row++) {
//             for (int colum = 0; colum < arr[row].length; colum++) {
//                 System.out.print(arr[row][colum]+" ");
//             }
//             System.out.println();
//          }
        
//     }
// }









// public  class Array{
//     public static void main(String[] args) {
//         ArrayList<Integer>list= new ArrayList<>();
//             list.add(10);
//             list.add(130);
//              list.add(10);
//             list.add(130);
//              list.add(10);
//             list.add(130);
//              list.add(10);
//             list.add(130);

        
//     }
// }











//swap
// import java.util.Arrays;
// public  class Array{
//     public static void main(String[] args) {
//          int[] arr={1,2,3,4,5,6,8};
//          swap(arr,2,3);
//          System.out.print(Arrays.toString(arr));
//     }
//     static void swap(int[]arr,int index1,int index2) {
//         int temp=arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]=temp;
//     }
// }






// public class Array {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6, 8};

//         System.out.println(max(arr));
//     }

//     public static int max(int[] arr) {
//         int maxvalue = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > maxvalue) {
//                 maxvalue = arr[i];
//             }
//         }

//         return maxvalue;
//     }
// }




























// rev


// public  class Array{
//     public static void main(String[] args) {
//         // // 1st method of array creatioon ;

//         // int[]markes=new int[3];
//         // markes[0]=1;
//         // markes[1]=5;
//         // markes[2]=9;

//         // // 2nd method of array creation

//         // int []markes={1,4,7,8,};


//     }
// }











// taking array as a input

// public  class Array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a size of array");
//          int size=sc.nextInt();
//          int[]arr=new int[size];


//          for (int i = 0; i < size; i++) {
//               arr[i]=sc.nextInt();

//          }
//          for (int i = 0; i < arr.length; i++) {
//              System.out.print(arr[i]+" ");
//          }

//     }
// }






//  Homework Problems 
// 1. Take an array of names as input from the user and print them on the screen. 
// import java.util.Scanner;
// public  class Array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a size of the array");
//         int size=sc.nextInt();
//         String[]Names=new String[size];


//         for (int i = 0; i < size; i++) {
//             System.out.println("enter the name ");
//             Names[i]=sc.next();
//         }

//         for (int i = 0; i < Names.length; i++) {
//             System.out.println("the names are:-"+Names[i]);
            
//         }


//     }
    
//     }






















// max and min no in array
// import java.util.Scanner;
// public  class Array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of the array");
//         int size=sc.nextInt();
//         int[]arr=new int[size];





//         for (int i = 0; i < size; i++) {
//             System.out.println("  Enter the no in array");
//             arr[i]=sc.nextInt();
            
//         }
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;

        
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] < min){
//                 min=arr[i];
//             }
//             if(arr[i] > max){
//                 max=arr[i];
//             }
            
//         }
//         System.out.print("the max No is"+max);
//          System.out.print("the min No is"+min);

//     }
// }













// check where the array is stored inascendinng or decending order

// import java.util.Scanner;
// public  class Array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of the array");
//         int size=sc.nextInt();
//         int[]arr=new int[size];





//         for (int i = 0; i < size; i++) {
//             System.out.println("  Enter the no in array");
//             arr[i]=sc.nextInt();
            
//         }
//          boolean isAscending=true;
        
//         for (int i = 0; i < arr.length-1; i++) {
//               if(arr[i]>arr[i+1]){
//                 isAscending=false;
//               }
//         }
//         if(isAscending){
//             System.out.println("Arr is in ascenting order");
//         }
//         else{
//             System.out.println("not in ascending order");
//         }
//     }
// }