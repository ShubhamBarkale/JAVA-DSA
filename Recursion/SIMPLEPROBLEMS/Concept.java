// passing no 
public class Concept{
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
         return;
        }
        System.out.println(n);
        // dont use n-- search the diff between n-- &--n
        fun(--n);
    }
}