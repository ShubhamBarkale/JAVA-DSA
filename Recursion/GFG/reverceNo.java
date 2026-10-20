public class reverceNo{
    public static void main(String[] args) {
        int n =23457;
        System.out.print(rev(n,0));
    }
    public static int rev(int n ,int r){
        if(n==0){
            
            return r;
        }
          return   rev(n/10,r*10+n%10);
    }
}