public class AddDigits{
     public static void main(String[] args) {
       
         System.out.print(DigitSum(1342));
     }
     static int DigitSum(int n){
        if(n<=1){
            return 1;
        }
        return (n%10)+ DigitSum(n/10);
     }
}