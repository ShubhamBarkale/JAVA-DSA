// public class loops{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         for (int i = 0; i <= num; i++) {
//             System.out.println(i);
//         }

//         sc.close();
//     }
// }


























// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          System.out.print("enter a no :-");
//          int num=sc.nextInt();
          
//          int i=0;
//           while (i<=num) {
//                System.out.println("num  "+i);
//                i++;
              
//           }sc.close();

//     } 
// }
























// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//          System.out.print("enter a no :-");
//          int num=sc.nextInt();
          
//            int i=0;
//           do{
//             System.out.println(i);
//             i++;
//           }while (i<=num) ;
          
         
//     } 
// }










// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         int first = 0;
//         int second = 1;

//         System.out.println("Fibonacci Series:");

//         for (int i = 0; i < num; i++) {

//             System.out.print(first + " ");

//             int next = first + second;

//             first = second;
//             second = next;
//         }

//         sc.close();
//     }
// }



















// import java.util.Scanner;

// public class loops{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number  to find a occurence : ");
//         int num = sc.nextInt();
//          int count =0;
//         int n=1568268885;
//         while(n>0){
//           int  rem=n%10;
//           if(rem==num){
//             count++;
//           }
//           n=n/10;

//         }
//         System.out.println(count);

//         sc.close();
//     }
// }




















// import java.util.Scanner;

// public class loops {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number: ");
//         int num = sc.nextInt();

//         int rev = 0;

//         while (num != 0) {

//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }

//         System.out.println("Reversed number: " + rev);

//         sc.close();
//     }
// }



















