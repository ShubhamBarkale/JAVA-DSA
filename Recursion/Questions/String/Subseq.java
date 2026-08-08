public class Subseq{
    public static void main(String[] args) {
        subbseq(" ", "abc");
        
    }
    static void subbseq(String p ,String up){
        if(up.isEmpty()){
          System.out.println(p);
          return;
        }
        char ch=up.charAt(0);

        subbseq(p+ ch, up.substring(1));
          subbseq(p, up.substring(1));

    }

}