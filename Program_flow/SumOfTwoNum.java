import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for first number
        System.out.println("ENTER NO A :- ");
        int A = sc.nextInt();

        // Ask user for second number
        System.out.println("ENTER NO B :- ");
        int B = sc.nextInt();

        // Add A and B
        int sum = A + B;

        // Print the result
        System.out.print("THE SUM OF A AND B IS " + sum);

        // Close Scanner
        sc.close();
    }
}