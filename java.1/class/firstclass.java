
// import java.util.Scanner;

// class firstclass{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please enter a day:");
//         String day = sc.next();   // take input
//         switch(day) {
//             case "Monday":
//                 System.out.println("basket ball");
//                 break;
//             case "Tuesday":
//                 System.out.println("tennis");
//                 break;
//             case "Wednesday":
//                 System.out.println("basket ball");
//                 break;
//             case "Thursday":
//                 System.out.println("cricket");
//                 break;
//             case "Friday":
//                 System.out.println("tennis");
//                 break;
//             case "Saturday":
//                 System.out.println("exercise");
//                 break;
//             case "Sunday":
//                 System.out.println("holiday");
//                 break;
//             default:
//                 System.out.println("Invalid day");
//         }
//         sc.close();
//     }
// }
// import java.util.Scanner;
// class FirstClass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter a number: ");
//         int n = sc.nextInt();
//         if (n % 3 == 0 && n % 5 == 0) {
//             System.out.println("FizzBuzz");
//         } 
//         else if (n % 3 == 0) {
//             System.out.println("Fizz");
//         } 
//         else if (n % 5 == 0) {
//             System.out.println("Buzz");
//         } 
//         else {
//             System.out.println("no is not divisible by 3 or 5");
//         }
//         sc.close();
//     }
// }
// import java.util.Scanner;
// class FirstClass {
//     public static void  countnotes (int amount) {
//         Scanner sc = new Scanner(System.in);
//           System.out.print("Please enter a amount: ");
//             int amount = sc.nextInt();
//         int notes2000 = amount/2000;
//         amount = amount%2000;
//         int notes500 = amount/500;
//         amount = amount%500;
//         int notes200 = amount/200;
//         amount = amount%200;
//         int notes50 = amount/50;
//         amount = amount%50;
//         int notes20 = amount/20;
//         amount = amount%20;
//         int notes10 = amount/10;
//         amount = amount%10;
//          System.out.println("2000 notes="+notes2000);
//          System.out.println("2000 notes="+notes500);
//          System.out.println("2000 notes="+notes200);
//          System.out.println("2000 notes="+notes20);
//          System.out.println("2000 notes="+notes10);
//     }
// }
// import java.util.Scanner;
// class firstclass {
//     public static void countNotes(int amount) {
//         int notes2000 = amount / 2000;
//         amount = amount % 2000;
//         int notes500 = amount / 500;
//         amount = amount % 500;
//         int notes200 = amount / 200;
//         amount = amount % 200;
//         int notes50 = amount / 50;
//         amount = amount % 50;
//         int notes20 = amount / 20;
//         amount = amount % 20;
//         int notes10 = amount / 10;
//         amount = amount % 10;
//         System.out.println("2000 notes = " + notes2000);
//         System.out.println("500 notes  = " + notes500);
//         System.out.println("200 notes  = " + notes200);
//         System.out.println("50 notes   = " + notes50);
//         System.out.println("20 notes   = " + notes20);
//         System.out.println("10 notes   = " + notes10);
//         System.out.println("Remaining amount = " + amount);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter amount: ");
//         int amount = sc.nextInt();
//         countNotes(amount);   // method call
//         sc.close();
//     }
// }
// Switch case as expressions
// import java.util.Scanner;
// class firstclass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter grade: ");
//         char grade = sc.next().charAt(0);
//         String message =switch (grade) {
//             case 'a','A' ->"excellent";
//             case 'b','B' ->"very good ";
//             case 'c','C' ->"good";
//             case 'd','D' ->"averag";
//             case 'f','F' ->"fail";
//             default ->{
//                 System.out.println("invalid grade");
//                 yield "fail";
//             }
//         };
//         System.out.println("performance :"+message);
//  }
// }
// import java.util.Scanner;
// class firstclass {
//     public static void main(String[] args) {
//     for (int i = 0; i < 100; i++) {
//          System.out.println(i);
//     }
//     }
// }
// import java.util.Scanner;
// class firstclass {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Please enter a no : ");
//         int num = sc.nextInt();
//         int i = 1;
//         while (i < 11) {
//             System.out.println(i * num);
//             i++;
//         }
//         int n = 1;
//         while (n<num) {
//             if(n%2==0){
//                 System.out.println(n);
//             }
//             n++;
//         }
//     }
// import java.util.Scanner;
// class firstclass {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         char ch;
//      do { 
//             System.out.println("welcome");
//             System.out.println("do you eant to print again");
//             System.out.println("enter->y for yes or enter->n for no");
//              ch =sc.next().charAt(0);
//         } while ('y'==ch||'Y'==ch);
//         System.err.println("thankyou");
//     }
// }
// import java.lang.Math;
// class firstclass {

//     public static void main(String[] args) {
//         int a= 456/10;
//         System.out.println(a);
//         int n = -546;
//         int num= Math.abs(n);
//         int count = 0;
//         while (num > 0) {
//             num = num / 10;
//             count++;
           
//         }
//          System.out.println(count);

//     }

// }
