
// import java.util.*;

// public class SWiTchandcase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input numbers
//         System.out.print("Enter first number (a): ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number (b): ");
//         int b = sc.nextInt();

//         // Menu
//         System.out.println("\nChoose operation:");
//         System.out.println("1 : + (Addition)");
//         System.out.println("2 : - (Subtraction)");
//         System.out.println("3 : * (Multiplication)");
//         System.out.println("4 : / (Division)");
//         System.out.println("5 : % (Modulo)");
//         System.out.println("6 : **(square)");
        

//         int choice = sc.nextInt();

//         // Logic using switch
//         switch (choice) {
//             case 1:
//                 System.out.println("Result = " + (a + b));
//                 break;

//             case 2:
//                 System.out.println("Result = " + (a - b));
//                 break;

//             case 3:
//                 System.out.println("Result = " + (a * b));
//                 break;

//             case 4:
//                 if (b != 0)
//                     System.out.println("Result = " + (a / b));
//                 else
//                     System.out.println("Error: Division by zero ❌");
//                 break;

//             case 5:
//                 System.out.println("Result = " + (a % b));
//                 break;
//             case 6:
//              System.out.println("Result = " + Math.pow(a, b));
//                 break;

//             default:
//                 System.out.println("Invalid choice ❌");
//         }
//     }
// }














// import java.util.*;

// public class SWiTchandcase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter month number (1-12): ");
//         int month = sc.nextInt();

//         switch (month) {
//             case 1:
//                 System.out.println("January");
//                 break;
//             case 2:
//                 System.out.println("February");
//                 break;
//             case 3:
//                 System.out.println("March");
//                 break;
//             case 4:
//                 System.out.println("April");
//                 break;
//             case 5:
//                 System.out.println("May");
//                 break;
//             case 6:
//                 System.out.println("June");
//                 break;
//             case 7:
//                 System.out.println("July");
//                 break;
//             case 8:
//                 System.out.println("August");
//                 break;
//             case 9:
//                 System.out.println("September");
//                 break;
//             case 10:
//                 System.out.println("October");
//                 break;
//             case 11:
//                 System.out.println("November");
//                 break;
//             case 12:
//                 System.out.println("December");
//                 break;
//             default:
//                 System.out.println("Invalid month ❌");
//         }
//     }
// }















// using loop

// import java.util.*;

// public class SWiTchandcase {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice;

//         do {
//             System.out.print("Enter month number (1-12): ");
//             int month = sc.nextInt();

//             switch (month) {
//                 case 1: System.out.println("January"); break;
//                 case 2: System.out.println("February"); break;
//                 case 3: System.out.println("March"); break;
//                 case 4: System.out.println("April"); break;
//                 case 5: System.out.println("May"); break;
//                 case 6: System.out.println("June"); break;
//                 case 7: System.out.println("July"); break;
//                 case 8: System.out.println("August"); break;
//                 case 9: System.out.println("September"); break;
//                 case 10: System.out.println("October"); break;
//                 case 11: System.out.println("November"); break;
//                 case 12: System.out.println("December"); break;
//                 default: System.out.println("Invalid month ❌");
//             }

//             System.out.print("Do you want to continue? (1 = Yes, 0 = No): ");
//             choice = sc.nextInt();

//         } while (choice == 1);

//         System.out.println("Program ended 👍");
//     }
// }