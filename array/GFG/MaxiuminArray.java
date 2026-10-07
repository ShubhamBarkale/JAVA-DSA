import java.util.Scanner;

public class MaxiuminArray{
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner sc =new Scanner(System.in);
        int max =1;

        
        for (int i = 0; i <arr.length; i++) {
            System.out.println("enetr the value :-");
            arr[i]=sc.nextInt();
        }
         for (int i = 0; i <arr.length; i++) {
           if(max<arr[i]) max=arr[i];
         
        }
        System.out.print("the max of array is :-  "+ max);
    }
}