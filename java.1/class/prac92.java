import java.util.Scanner;

public class prac92 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();

        int d = 256; // number of characters
        int q = 101; // prime number

        int n = text.length();
        int m = pattern.length();

        int p = 0; // hash of pattern
        int t = 0; // hash of text
        int h = 1;

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // calculate hash
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {

            if (p == t) {
                int j;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m)
                    System.out.println("Pattern found at index: " + i);
            }

            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + 1)) % q;

                if (t < 0)
                    t = t + q;
            }
        }

        sc.close();
    }
}