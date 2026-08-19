public class SearchElement{
    public static void main(String[] args) {
        int target =5;
        int arr[]={2,3,7,8,5,4,3,2,9,11};
        int get =Find(arr, target);
        System.out.print("Element found ot position :- "+ get);

    }
    static int Find(int[] arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target){
                return i ;
            }
        }
        return -1;
    }
}