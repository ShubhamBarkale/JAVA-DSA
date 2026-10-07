public class passingArrayToMethods{
 
 public static void main(String[] args) {
     
     int x[]={1,2,3,4,5,6,7,8,9};
     change(x);
     System.out.println(x[7]);
 }
 public static void change(int[] a) {
     a[7]=40;
 }
}