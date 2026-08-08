// public class PrintNo{
//     public static void main(String[] args) {
//        NoP(6);
        
//     }
//     static void NoP(int n){
//         if(n==0){
//             return ;
//         }
//         System.out.println(n);
//         NoP(n-1);

//     }
// }







// reverse

// public class PrintNo{
//     public static void main(String[] args) {
//        Norev(6);
        
//     }
//     static void Norev(int n){
//         if(n==0){
//             return ;
//         }
        
//         Norev(n-1);
//         System.out.println(n);

//     }
// }
























//both

public class PrintNo{
    public static void main(String[] args) {
       Norev(6);
        
    }
    static void Norev(int n){
        if(n==0){
            return ;
        }

        System.out.println(n);  
        Norev(n-1);
        System.out.println(n);

    }
}