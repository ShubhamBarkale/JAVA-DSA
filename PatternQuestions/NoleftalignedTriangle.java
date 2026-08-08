
public class NoleftalignedTriangle{
    public static void main(String[] args) {
        notri(5);
    }
    static void notri(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print(col+" ");
                
            }
            System.out.println();
            
        }
        
    }
}