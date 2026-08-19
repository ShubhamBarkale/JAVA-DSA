import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("ENTER " + size + " ELEMENTS:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondLargest = arr[1];

        // Make sure largest contains the bigger of first two
        if (secondLargest > largest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        // Find largest and second largest
        for (int i = 2; i < size; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second largest element = " + secondLargest);
    }
}