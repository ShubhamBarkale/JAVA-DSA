
//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//           System.out.println("enetr a no for sum");
//           int num1=sc.nextInt();
//          System.out.print("enter a no ");
//          int num2=sc.nextInt();
//          System.out.print("the sum is ="+(num1+num2));

//     }
// }




// public class Function{
//     public static void main(String[] args) {
//         // addition();
//         // int ans=sum2();
//         // System.out.println(ans);
//         int mutiplication =sum3(20,60);
//         System.out.print(mutiplication );


//     }
//     static int sum3(int a ,int b){
//       a=10;
//       b=20;
//       int mul=a*b;
//       return mul;

//     }


// //     static int sum2(){
// //        Scanner sc=new Scanner(System.in);
// //           System.out.println("enetr a no for sum");
// //           int num1=sc.nextInt();
// //          System.out.print("enter a no ");
// //          int num2=sc.nextInt();
// //          int sum =num1+num2;
// //          System.out.print("the sum is ="+(sum));
              
// //               return sum;

// //     }

// //  public static void addition(){
// //         Scanner sc=new Scanner(System.in);
// //           System.out.println("enetr a no for sum");
// //           int num1=sc.nextInt();
// //          System.out.print("enter a no ");
// //          int num2=sc.nextInt();
// //          System.out.print("the sum is ="+(num1+num2));

// //   }
// }



















// // public class Function{
// //     public static void main(String[] args) {
// //       String mms= greet();
// //       System.out.print(mms);
// //     }
// //     public static String greet(){
// //       String greeting ="hi i am shubham";
// //       return greeting;
// //     }
// // }












// import java.util.Scanner;

// public class Function {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         boolean ans = isPrime(a);

//         System.out.println(ans);

//         sc.close();
//     }

//     static boolean isPrime(int a) {
//         if (a <= 1) {
//             return false;
//         }

//         int c = 2;
//         while (c * c <= a) {
//             if (a % c == 0) {
//                 return false;
//             }
//             c++;
//         }

//         return true;
//     }
// }

public class Function {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // //  System.out.println("enter a no ");

        // int n = sc.nextInt();
        for (int n = 100; n <=999; n++) {
            if(isAmstron(n)){
                System.out.println(n+ " ");
            }
        }
       
        // System.out.println(isAmstron(n));
    }
    public static boolean   isAmstron(int n){
          int original=n;
          int sum =0;
          while (n>0){
            int rem =n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
          }
          return sum == original;
    }
}