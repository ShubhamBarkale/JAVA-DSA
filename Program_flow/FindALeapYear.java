import java.util.Scanner;

public class FindALeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year to check whether it is a leap year or not: ");

        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {

            System.out.println("It is a leap year.");

        } else {

            System.out.println("It is not a leap year.");
        }

        sc.close();
    }
}