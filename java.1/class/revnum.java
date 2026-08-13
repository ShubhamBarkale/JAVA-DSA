
import java.util.*;

public class revnum {

    public static void main(String[] args) {
        //taking input
        System.out.println("Enter the Number  : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        rev(num);

    }

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    public static int pow(int x, int n) {
        int pow = x; //2^3 x=2 , n=3 pow=2
        for (int i = 1; i < n; i++) {
            pow = pow * x;
        }
        return pow;
    }

    public static void rev(int num) {
        int n = count(num) / 2;//count and taking half of it for making power 
        int power = pow(10, n); //n=6 n/2=3 pow=1000
        int half1 = num / power;// 123456/1000=123
        System.out.println("half 1 : " + half1);
        int half2 = num % power;// 123456%1000=456
        System.out.println("half 1 : " + half2);
        int half2rev = revers(half2);
        int final1 = half1 * power + half2rev;
        System.out.println(final1);

    }

    public static int revers(int num) {
        int lastdg;
        int revdigit = 0;
        while (num > 0) {
            lastdg = num % 10;
            num = num / 10;
            revdigit = (revdigit * 10) + lastdg;
        }
        return revdigit;
    }
}
