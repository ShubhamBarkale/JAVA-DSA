
import java.util.Scanner;

public class IOinArray{
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner sc =new Scanner(System.in);

        
        for (int i = 0; i <arr.length; i++) {
            System.out.println("enetr the value :-");
            arr[i]=sc.nextInt();
        }
         for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}