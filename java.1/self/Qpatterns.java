import java.net.SocketTimeoutException;
import java.util.Scanner;

// // Q print a reactangel
// public class Qpatterns{
//     public static void main(String[] args){
//         // int n=5;
//         // int m=5;
// //outer loop
//    for(int i=1;i<6;i++){
//     //inner loop 
//     for(int j=1;j<7;j++){
//         System.out.print("*");
//     }
//     System.out.println();
//    }
// }
// }





// // print a hollow reactangel
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;

//         // outer loop
//         for (int i = 1; i <= n; i++) {

//             // inner loop
//             for (int j = 1; j <= m; j++) {

//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" "); // important
//                 }
//             }

//             System.out.println();
//         }
//     }
// }



// //half perimid 
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;

//         for(int i = 1; i < n ; i++){
//             for(int j = 1; j <= i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//      }
//  }





// // inverted perimed 
// //half perimid 
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;

//         for(int i = n; i >= 1 ; i--){
//             for(int j = 1; j <= i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//      }
//  }





// right half perimid 
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//          for(int i = 1; i <= n ; i++){
//             //inner loop ->print space
//             for(int j=1;j<= n-i;j++){
//                 System.out.print(" ");

//             }
//             // inner loop
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println("*");
//          }
//     }
//   }





// // print perimed using no 
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 4;
     
//          for(int i = 1; i <= n ; i++){
//             for(int j=1;j<=i;j++){
//             System.out.print(j+" ");
//             }
//             System.out.println();
//          }
//     }
// }



// // inverted half  perimide with no's
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;
     
//          for(int i = 1; i <= n ; i++){
//             for(int j =1;j<=n-i+1;j++){
//             System.out.print(j+" ");
//             }
//             System.out.println();
//          }
         
         
//     }
// }





// // print floyd's triangle
// inverted half  perimide with no's
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;
//         int number=1;
     
//          for(int i = 1; i <= n ; i++){
//             for(int j =1;j<=i;j++){
//             System.out.print(number+" ");
//             number++;
//             }
//             System.out.println();
//          }
         
         
//     }
// }



// 0 1 perimide with no's
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;
     
//          for(int i = 1; i <= n ; i++){
//             for(int j =1;j<=i;j++){
//             int sum=i+j;
//             if(sum%2==0){
//                 System.out.print("1");
//             }else{
//                 System.out.print("0");
//             }
//             }
//             System.out.println();
//          }
         
         
//     }
// }







// butterfly patterns
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;

//         // upper half
//         for(int i = 1; i <= n; i++) {

//             // left stars
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             // spaces
//             int spaces = 2 * (n - i);
//             for(int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }

//             // right stars
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println(); // move to next line
//         }

//         // lower half
//         for(int i = n; i >= 1; i--) {

//             // left stars
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             // spaces
//             int spaces = 2 * (n - i);
//             for(int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }

//             // right stars
//             for(int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }







// // solid rombus
//  public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;
    
//         for(int i = 1; i <= n; i++) {

//             // spaces
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");   
//             }

//             // stars
//             for(int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }




// // number perimid 
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i = 1; i <= n; i++) {

//             // spaces
//             for(int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // numbers with space
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }

//             System.out.println();
//         }
//     }
// }
    






// //palindromic patterns 
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 5;

//         for(int i = 1; i <= n; i++) {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }//first half
//             for(int j=i;j>=1;j--){
//                 System.out.print(j);
//             }//second half
//             for(int j=2;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }




// // dimond pattern
// public class Qpatterns {
//     public static void main(String[] args) {
//         int n = 4;

//         for(int i = 1; i <= n; i++) {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*"); 
//             }
//             System.out.println();
//         }
//         // lower
//          for(int i = n; i >= 1; i--) {
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*"); 
//             }
//             System.out.println();
//         }
//     }
// }













// public class  Qpatterns {
//     public static void main(String[] args) {

//         int n = 9; // size of grid (must be odd)
//         int mid = n / 2;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {

//                 if (i == mid || j == mid) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }

//             }
//             System.out.println();
//         }
//     }
// }