

// public class Array{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter a size of a array");
//         int size=sc.nextInt();
//         int []array= new int[size];
//         System.out.println("enter values to array");
//          for(int i=0;i<size;i++){
//          array[i]=sc.nextInt();
//          }
//          System.out.println("enter index ti swap i,j");
//          int i=sc.nextInt();
//          int j=sc.nextInt();


//          int temp=array[i];
//          array[i]=array[j];
//          array[j]= temp;

//          for (int k = 0; k < size; k++) {
//             System.out.print(array[k] +" ");

             
//          }




        
//     }
// }

















// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();

//         int[] array = new int[size];

//         System.out.println("Enter values:");
//         for (int k = 0; k < size; k++) {
//             array[k] = sc.nextInt();
//         }

//         System.out.println("Enter indices to swap (i j):");
//         int index1 = sc.nextInt();
//         int index2 = sc.nextInt();

//         // validation
//         if (index1 >= 0 && index2 >= 0 && index1 < size && index2 < size) {

//             int temp = array[index1];
//             array[index1] = array[index2];
//             array[index2] = temp;

//             System.out.println("Array after swapping:");
//             for (int k = 0; k < size; k++) {
//                 System.out.print(array[k] + " ");
//             }

//         } else {
//             System.out.println("Invalid indices!");
//         }

//         sc.close();
//     }
// }












// remove odd elements 



// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input size
//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();

//         int[] array = new int[size];

//         // Input elements
//         System.out.println("Enter values:");
//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }

//         // Remove odd elements (store evens in new array)
//         int[] result = new int[size];
//         int j = 0;

//         for (int i = 0; i < size; i++) {
//             if (array[i] % 2 == 0) {   // keep even
//                 result[j] = array[i];
//                 j++;
//             }
//         }

//         // Print result
//         System.out.println("Array after removing odd elements:");
//         for (int i = 0; i < j; i++) {
//             System.out.print(result[i] + " ");
//         }

//         sc.close();
//     }
// }









// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input size
//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();

//         int[] array = new int[size];

//         // Input elements
//         System.out.println("Enter values:");
//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }

//         // Left rotate by 1
//         int first = array[0];

//         for (int i = 0; i < size - 1; i++) {
//             array[i] = array[i + 1];
//         }

//         array[size - 1] = first;

//         // Output result
//         System.out.println("Array after left rotation:");
//         for (int i = 0; i < size; i++) {
//             System.out.print(array[i] + " ");
//         }

//         sc.close();
//     }
// }





















// degits of no in array 

// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input size
//         System.out.print("Enter size of array: ");
//         int size = sc.nextInt();

//         int[] array = new int[size];

//         // Input elements
//         System.out.println("Enter values:");
//         for (int i = 0; i < size; i++) {
//             array[i] = sc.nextInt();
//         }

//         // Replace each element with digit sum
//         for (int i = 0; i < size; i++) {
//             int num = array[i];
//             int sum = 0;

//             while (num != 0) {
//                 sum += num % 10;  // get last digit
//                 num /= 10;        // remove last digit
//             }

//             array[i] = sum;  // replace
//         }

//         // Print result
//         System.out.println("Array after replacing with digit sum:");
//         for (int i = 0; i < size; i++) {
//             System.out.print(array[i] + " ");
//         }

//         sc.close();
//     }
// }


















// import java.util.Scanner;

// public class SwapElements {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Take size of array
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         // Take array elements
//         System.out.println("Enter elements:");
//         for (int k = 0; k < n; k++) {
//             arr[k] = sc.nextInt();
//         }

//         // Take indices to swap
//         System.out.print("Enter two indices to swap: ");
//         int i = sc.nextInt();
//         int j = sc.nextInt();

//         // Check validity
//         if (i < 0 || j < 0 || i >= n || j >= n) {
//             System.out.println("Invalid indices");
//         } else {
//             // Swap
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;

//             // Print updated array
//             System.out.print("Updated array: ");
//             for (int k = 0; k < n; k++) {
//                 System.out.print(arr[k] + " ");
//             }
//         }

//         sc.close();
//     }
// }














// import java.util.Scanner;

// public class LeftRotate {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input size
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         // Input elements
//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Left rotate by one
//         int first = arr[0];

//         for (int i = 0; i < n - 1; i++) {
//             arr[i] = arr[i + 1];
//         }

//         arr[n - 1] = first;

//         // Print result
//         System.out.print("Array after left rotation: ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         sc.close();
//     }
// }