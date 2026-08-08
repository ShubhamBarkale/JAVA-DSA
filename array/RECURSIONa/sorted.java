// check carray is sorted or not 
public class sorted{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,8,7};
        System.out.print(Sorted(arr, 0));
        
    }
    static boolean  Sorted(int[]arr , int index){
        // base condition 
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& Sorted(arr,index+1);
    }

}