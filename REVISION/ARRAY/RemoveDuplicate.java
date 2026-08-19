
public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 5, 3, 7, 5};

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            // Check whether arr[i] already exists in result
            for (int j = 0; j < index; j++) {

                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            // If not duplicate, add it
            if (!duplicate) {
                result[index] = arr[i];
                index++;
            }
        }

        // Print result
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}