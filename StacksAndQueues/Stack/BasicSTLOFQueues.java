
import java.util.LinkedList;
import java.util.Queue;

public class BasicSTLOFQueues {

    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        System.out.println(Q + " " + Q.peek());
        System.out.println(Q);
        Q.remove();
        System.out.println(Q);
        System.out.println(Q + " " + Q.size());

    }
}
