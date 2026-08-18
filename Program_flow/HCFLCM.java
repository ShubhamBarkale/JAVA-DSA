import java.util.Scanner;

public class HCFLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        // Find HCF
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int hcf = a;

        // Find LCM
        int lcm = (originalA * originalB) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}