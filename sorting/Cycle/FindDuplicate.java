// leet code problem


public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,3,6,2,5,6,4};

        int a = finddupp(arr);

        System.out.println(a);
    }

    static int finddupp(int[] arr) {
        int i = 0;

        while (i < arr.length) {   

            if (arr[i] != i + 1) {

                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }

            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
