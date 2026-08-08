// public class ReverceNumber{
// public static void main(String[] args) {
//     revl(1234);
//     System.out.println(sum);

// }
// static int sum =0;     // cheating 
// static void revl(int n){
//     if(n==0){
//         return;
//     }
//     int rem=n%10;
//      sum=sum*10+rem;
//      revl(n/10);
// }
// }








// goodpublic class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(rev2(1234));
    }

    static int rev2(int n) {
        // Base condition
        if (n == 0) {
            return 0;
        }

        // Find last digit
        int rem = n % 10;

        // Count digits remaining
        int digits = (int)(Math.log10(n));

        // Recursive call
        return rem * (int)Math.pow(10, digits) + rev2(n / 10);
    }
