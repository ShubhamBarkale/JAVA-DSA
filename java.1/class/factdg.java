// import java.util.*;
// public class factdg {

//     public static void main(String[] args) {
//         //taking input
//         System.out.println("Enter the Number  : ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int ans = factdg(num);
//         if(num==ans){
//         System.out.println(num +" is same ");

//         }
//         else{
//             System.out.println(num +" is same ");
//         }
//     }

//     public static int factdg(int num) {
//         int dg;
//         int sum = 0;
//         while (num > 0) {
//             dg = num % 10;
//             num = num / 10;
//             sum = sum + factorial(dg);
//         }
    
//         return sum;
//     }

//     public static int factorial(int num) {
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact = fact * i;
//         }

//         return fact;
//     }
// }








// shubham 
import java.util.*;

public class factdg {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num;
        int result = factdg(num);

        if (result == original) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

    public static int factdg(int num) {
        int digit;
        int sum = 0;

        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            sum = sum + factorial(digit);
        }

        return sum;
    }

    public static int factorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }
}