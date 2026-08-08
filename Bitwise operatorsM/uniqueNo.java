// use xor


public class uniqueNo{
    public static void main(String[] args) {
        int[] arr={1,3,5,7,6,5,3,6,1};
        System.out.print(unique(arr));
    }
    private static int unique(int [] arr){
        int uniq=0;
        for(int n:arr){
            uniq^=n;
        }
         return uniq;
    }
}