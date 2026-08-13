// import java.util.Scanner;
// public class Array{
//  public static void main(String[] args){
//      Scanner sc= new Scanner(System.in);
//     int [] arr= new int[5];
//     for (int i = 0; i < arr.length; i++) {
//         System.out.println("enetr a no for arr");
//         arr[i]=sc.nextInt();
//     }
//    for (int num:arr){
//     System.out.println(num + " ");
//  }
//  }
// }

















// 2d array
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];

        System.out.println("Enter 9 elements:");

        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = sc.nextInt();
            }
        }

        System.out.println("Array elements:");

        for (int rows = 0; rows < arr.length; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                System.out.print(arr[rows][col] + " ");
            }
            System.out.println();
        }
    }
}