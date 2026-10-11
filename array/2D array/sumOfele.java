```java
import java.util.Scanner;

public class sumOfele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int i = sc.nextInt();

        System.out.println("Enter no of columns:");
        int j = sc.nextInt();

        int arr[][] = new int[i][j];

        System.out.println("Enter array elements:");

        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                arr[k][l] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {
                sum = sum + arr[m][n];
            }
        }

        System.out.println("Sum of all elements: " + sum);

        sc.close();
    }
}
```
