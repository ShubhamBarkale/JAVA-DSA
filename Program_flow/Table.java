
import java.util.Scanner;

public class Table{
    public static void main(String[] args) {
        
        Scanner sc =new Scanner (System.in);
        System.out.println("ENETR A NO TO PRINT A TABLE :-");
        int n=sc.nextInt();
        System.err.println("THE TABLE IS ");
        for (int i = 1; i < 11; i++) {
             int mul= i*n;

             System.out.println(n+" x "+i+" = "+mul);
            
        }
        sc.close();
    }
}