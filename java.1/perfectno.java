import java.util.*;
public class perfectno {

    public static void main(String[] args) {
        //taking input
        System.out.println("Enter the Number  : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //checking perfect number
        if(perfect(num)){
            System.out.println("Perfect number : "+ num);
        }
        else{
            System.out.println("Not a Perfect number : "+ num);
        }
       
    }
    //perfect number function
    public static boolean  perfect(int num) {
        int perfectno=0;
        for (int i = 1; i < num; i++) {
            
            if (num % i == 0) {
                perfectno = perfectno+i; // 6=1+2+3
                if (num == perfectno) { //6==6
                    return true;
                }
                
            }
        } 
        return false;
    }
}
