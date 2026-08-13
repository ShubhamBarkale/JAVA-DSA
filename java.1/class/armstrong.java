
import java.util.*;
import java.lang.Math.*;

public class armstrong {

    public static void main(String[] args) {
        //taking input
        System.out.println("Enter the Number  : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (arm(num)) {
            System.out.println(num + " is a Armstrong number");
        } else {
            System.out.println(num+ " is not a Armstrong number");
        }
    }

    //power of number
    public static int pow(int x, int n) {
        int pow = x; //2^3 x=2 , n=3 pow=2
        for (int i = 1; i < n; i++) {
            pow = pow * x;
        }
        return pow;
    }

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static boolean  arm(int num) {
        int org = num;
        int n = count(num);
        int sum = 0;
        int extract;
        while (num != 0) {
            extract = num % 10;
            sum = sum + pow(extract, n);
            num = num / 10;
        }
        // if(org == sum) {
        //     return true;
        // } else {
        //     return false;
        // }
        return org==sum;
    }
}
