
// import java.lang.classfile.instruction.ReturnInstruction;
import java.util.*;

public class prime {

    public static void main(String[] args) {
        System.out.println("Enter the Number  : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

// check prime for 1 number
        if (prime(num1)) {
            System.out.println(num1 + " Prime");
        } else {
            System.out.println(num1 + " Not a prime");
        }
// check prime for 2 number
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (prime(i)) {
                System.out.println(i + " Prime");
            } else {
                System.out.println(i + " Not a prime");

            }
        }

    }

    public static boolean prime(int num) {
        int i;
        for (i = 2; i * i <= num / 2; i++) { //another condition i*i<=num , i<=math.sqrt(num)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
