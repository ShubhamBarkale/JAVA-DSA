public class MinimumandMaximum {

    static int min;
    static int max;

    public static void main(String[] args) {

        int[] arr = {1,4,3,-5,-4,8,6};

        min = arr[0];
        max = arr[0];

        MinMax(arr,1);

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }

    static void MinMax(int[] arr, int i){

        if(i == arr.length){
            return;
        }

        if(arr[i] < min){
            min = arr[i];
        }

        if(arr[i] > max){
            max = arr[i];
        }

        MinMax(arr,i+1);
    }
}