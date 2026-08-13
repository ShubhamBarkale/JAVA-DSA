public class revers {

    public static void main(String[] args) {
        // using static method 
        rev();
        // using non static method
        revers obj = new revers();
        obj.rev1();
    }

    public static void rev() {
        int num = 12345;
        int digitrev;
        int rev = 0;
        while (num != 0) {
            digitrev = num % 10;
            rev = rev * 10 + digitrev;
            num = num / 10;

        }
        System.out.println(rev);
    }

     public void rev1() {
        int num = 12345;
        int digitrev;
        int rev = 0;
        while (num != 0) {
            digitrev = num % 10;
            rev = rev * 10 + digitrev;
            num = num / 10;

        }
        System.out.println(rev);
    }
}
