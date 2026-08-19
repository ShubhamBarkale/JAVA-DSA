
import java.util.Scanner;

// Find largest elemen


public class LargestEle{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENETR THE SIZE OF THE ARRAY:-");;
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("ENTER  "+size+"  ELEMENTS");
         for (int i = 0; i < size; i++) {

              arr[i]=sc.nextInt();
         }
           System.out.println("Array largest  element:");
           int max=arr[0];

        for (int i = 0; i < size; i++) {
           if(max<arr[i]){
            max=arr[i];
           }
        }
        System.out.println("The mac element is "+ max);
        
    }
}