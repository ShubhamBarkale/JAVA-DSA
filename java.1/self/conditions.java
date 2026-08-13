// import java.util.Scanner;

// public class conditions {
//     public static void main(String args[]) {
//         System.out.println("enter the age :-");
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age>18){
//             System.out.println("addult");
//         }
//         else{
//         System.out.println("not adult");
//         }
//     }
// }
// public class conditions {
//     public static void main(String args[]){
//         // for loops 
//         for(int i=0;i<100;i++){
//             System.out.println(i+"=hellow");
//         }
//     }
// }
// public class conditions{
//     public static void main(String args []) {
//         // while loop
//         int i =0;
//         while(i<100){
//             System.out.println(i+"=hellow");
//             i++; //or i+1
//         }
//     }
// }
// public class conditions{
//     public static void main(String args []) {
//         int i=0;
//         do { 
//             System.out.println(i+"=do while");
//             i++;//i=i+1
//         } while (i<100);
//     }
// } 
import java.util.*;

public class conditions {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;//sum+=i;

        }
        System.out.println("the total sum is=" + sum);

    }
}
