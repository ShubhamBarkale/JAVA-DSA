import java.util.*;
public class automorphic{
    public static void main(String[] args) {
        //taking input
        System.out.println("Enter the Number  : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sq=square(num);
        if(num==(sq%10)){
            System.out.println(num + " is a automorphic number");
        }
        else{
            System.out.println(num + " is not a automorphic number");
        }
        
    }
    
    public static int square(int num){
        return num*num;
    }


}