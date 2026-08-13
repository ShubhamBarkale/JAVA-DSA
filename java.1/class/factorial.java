
// import java.util.*;

// public class factorial {

//     public static void main(String[] args) {
//         System.out.println("Enter the Number to find Factorial : ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         // using non static method
//         factorial obj = new factorial();
//         obj.fact(num);
//     }

//     public void fact(int num) {
//         int fact = 1;
//         // if (fact == 0 | fact == 1) {
//         //     System.out.println(fact);
//         // } else {
//         //     while (num > 0) {
//         //         fact = fact * num;
//         //         num--;
//         //     }
//         //     System.out.println(fact);
//         // }

//         for (int i = 2; i <= num; i++) {
            
//             for (int j =1; j <= i; j++) {
//                 fact = fact * j;
//                 System.out.print("\n fact"+ j +" : "+fact);
//             }
//            // System.out.println(fact);
//         }
//     }
// }
















// BY SHUBHAM 
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // factorial of negative number is not defined
        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }

        // Call method and print result
        int result = findFactorial(num);
        System.out.println("Factorial = " + result);
    }

    // Method to calculate factorial
    public static int findFactorial(int num) {

        int fact = 1; // Initialize result

        // Loop from 1 to num
        for (int i = 1; i <= num; i++) {
            fact *= i;   // Multiply current number
        }

        return fact; // Return final result
    }
}