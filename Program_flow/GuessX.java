import java.util.Scanner;

public class GuessX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);

        char target = 'x';

        while (input != target) {

            System.out.println("Wrong character! Try again.");

            System.out.print("Enter a new character: ");
            input = sc.next().charAt(0);
        }

        System.out.println("Game Over!");

        sc.close();
    }
}