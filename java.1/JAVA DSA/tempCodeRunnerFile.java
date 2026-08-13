import java.util.Scanner;
public class Array{
 public static void main(String[] args){
   Scanner sc =new Scanner(System.in);
   int arr [][]=new int[3][3];
   System.out.println(arr.length);

   for (int rows = 0; rows <arr.length ; rows++) {
    for (int col = 0; col <arr[rows].length; col++) {
        arr[rows][col]=sc.nextInt();
    }
       
   }
 }
}