import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value:");
            arr[i] = sc.nextInt();
        }

        reverse(arr);
    }

    public static void reverse(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }

        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }
}