import java.util.Scanner;

public class sumOfArray{
    public static void main(String[] args) {
        int [] arr = new int[6];
        Scanner sc =new Scanner(System.in);
        int sum =1;

        
        for (int i = 0; i <arr.length; i++) {
            System.out.println("enetr the value :-");
            arr[i]=sc.nextInt();
        }
         for (int i = 0; i <arr.length; i++) {
          sum=sum*arr[i];
         
        }
        System.out.print("the sum of array is :-  "+ sum);
    }
}