
// public class patternpractice {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (j == 1 || j == n ||i==1 ||i==n) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }






// public class patternpractice {
//     public static void main(String[] args) {
//       int n = 5;
    
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {   
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }





// public class patternpractice {
//     public static void main(String[] args) {
//       int n = 5;
    
//         for (int i = n; i >=1; i--  ) {
//             for (int j = 1; j <=i; j++) {   
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }






// public class patternpractice {
//     public static void main(String[] args) {
//       int n = 5;
    
//         for (int i = 1; i <=n; i++  ) {
//             for (int j = 1; j <=n; j++) {   
//                 if (i+j>=6) {
//                     System.out.print("* ");
                    
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



//  OR 





// public class patternpractice {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {

//             // spaces (decreasing)
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  ");
//             }

//             // stars (increasing)
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }








// public class patternpractice {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=1;i<=n;i++) {
//             for(int j=1;j <=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//         }
// }




// public class patternpractice{
//     public static void main(String[] args) {
//         int n=5;
//         int sum=1;
//         for (int i=1;i<=n;i++){
//             for (int j = 1; j <= i; j++) {
//                  System.out.print(sum+"   ");
//                 sum=sum+1;
                
//             }
//             System.out.println();
//         }
      
    
//     }
//      }










// public class patternpractice{
//     public static void main(String[] args) {
//         int n=5;
//         for (int i=1;i<=n;i++){
//             for (int j = 1; j <= i; j++) {
//              int sum=i+j;
//               if (sum%2==0) {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
      
    
//     }
//      }







// public class patternpractice{
//     public static void main(String[] args) {
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                if(i==1 && j==1){
//                   System.out.print ("# ");
//                }
//                else if(i==1||j==1||i==j){
//                 System.out.print("* ");
//                }else{
//                 System.out.print("  " );
//                }

//                }
//                System.out.println();
//             }
//         }
        

//     }








// public class patternpractice {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {

//             // spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println(); // next line
//         }
//     }
// }















public class patternpractice {
        public static void printPattern(int n)
    {
        int i, j;
        
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            
            // inner loop to handle number of columns
            for (j = 1; j <= n-i+1; j++) {
                
                // printing column values 
                // upto the row value
                System.out.print(j + " ");
            }

            // print new line for each row
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}