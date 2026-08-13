
import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
        sum();
    }

     public static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no:-");
        int num1 = sc.nextInt();
        System.out.print("Enter a no:-");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is :-" + sum);

    }

}
