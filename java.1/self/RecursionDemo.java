//   public class RecursionDemo {

//     public static int factorial(int n) {

//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         return n * factorial(n - 1);
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         int ans = factorial(n);

//         System.out.println("Factorial = " + ans);
//     }
// }



















// public class RecursionDemo {

//     public static void fibonacci(int a, int b, int n) {

//         if (n == 0) {
//             return;
//         }

//         int c = a + b;

//         System.out.print(c + " ");

//         fibonacci(b, c, n - 1);
//     }

//     public static void main(String[] args) {

//         int a = 0;
//         int b = 1;
//         int n = 7;

//         System.out.print(a + " ");
//         System.out.print(b + " ");

//         fibonacci(a, b, n - 2);
//     }
// }



































// public class RecursionDemo {

//     public static int sum(int n) {

//         if (n == 1) {
//             return 1;
//         }

//         return n + sum(n - 1);
//     }

//     public static void main(String[] args) {

//         int n = 5;

//         System.out.println(sum(n));
//     }
// }



































// public class RecursionDemo {

//     public static boolean palindrome(String str, int start, int end) {

//         if (start >= end) {
//             return true;
//         }

//         if (str.charAt(start) != str.charAt(end)) {
//             return false;
//         }

//         return palindrome(str, start + 1, end - 1);
//     }

//     public static void main(String[] args) {

//         String str = "madam";

//         boolean ans = palindrome(str, 0, str.length() - 1);

//         System.out.println(ans);
//     }
// }





























