//  import java.util.Scanner;

// public class assignment{
//     public static void main(String[] args) {


//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();

//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();

//         System.out.print("Enter operator (+, -, *, /): ");
//         char op = sc.next().charAt(0);

//         switch(op) {
//             case '+':
//                 System.out.println("Result = " + (num1 + num2));
//                 break;

//             case '-':
//                 System.out.println("Result = " + (num1 - num2));
//                 break;

//             case '*':
//                 System.out.println("Result = " + (num1 * num2));
//                 break;

//             case '/':
//                 if(num2 != 0)
//                     System.out.println("Result = " + (num1 / num2));
//                 else
//                     System.out.println("Cannot divide by zero");
//                 break;

//             default:
//                 System.out.println("Invalid operator");
//         }
//     }
// }
    














// import java.util.Scanner;

// public class assignment {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input
//         System.out.print("Enter gender (Male/Female): ");
//         String gender = sc.nextLine();

//         System.out.print("Enter years of service: ");
//         int service = sc.nextInt();
//         sc.nextLine(); // consume newline

//         System.out.print("Enter qualification (Graduate/Post Graduate): ");
//         String qualification = sc.nextLine();

//         int salary = 0;

//         // Logic
//         if (gender.equalsIgnoreCase("Male")) {
//             if (service >= 10) {
//                 if (qualification.equalsIgnoreCase("Post Graduate")) {
//                     salary = 15000;
//                 } else {
//                     salary = 10000;
//                 }
//             } else {
//                 if (qualification.equalsIgnoreCase("Post Graduate")) {
//                     salary = 10000;
//                 } else {
//                     salary = 7000;
//                 }
//             }
//         } 
//         else if (gender.equalsIgnoreCase("Female")) {
//             if (service >= 10) {
//                 if (qualification.equalsIgnoreCase("Post Graduate")) {
//                     salary = 12000;
//                 } else {
//                     salary = 9000;
//                 }
//             } else {
//                 if (qualification.equalsIgnoreCase("Post Graduate")) {
//                     salary = 8000;
//                 } else {
//                     salary = 6000;
//                 }
//             }
//         } 
//         else {
//             System.out.println("Invalid gender input!");
//             return;
//         }

//         // Output
//         System.out.println("Salary = " + salary);
//     }

// }








    








//     import java.util.Scanner;

// public class assignment {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input basic salary
//         System.out.print("Enter basic salary: ");
//         double basic = sc.nextDouble();

//         double hra = 0, da = 0;

//         // Calculate HRA and DA
//         if (basic <= 10000) {
//             hra = basic * 0.20;
//             da = basic * 0.80;
//         } 
//         else if (basic <= 20000) {
//             hra = basic * 0.25;
//             da = basic * 0.90;
//         } 
//         else {
//             hra = basic * 0.30;
//             da = basic * 0.95;
//         }

//         double gross = basic + hra + da;

//         // Input years
//         System.out.print("Enter current year: ");
//         int currentYear = sc.nextInt();

//         System.out.print("Enter joining year: ");
//         int joiningYear = sc.nextInt();

//         int service = currentYear - joiningYear;

//         // Bonus
//         if (service > 3) {
//             gross += 2500;
//         }

//         // Output
//         System.out.println("Gross Salary = " + gross);
//     }
// }