
import java.util.HashSet;

public class sets_STL{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(77); set.add(22);set.add(45);set.add(18);

        System.out.println(set.size());
        System.out.println(set.contains(22)+" "+ set.contains(18));
        set.remove(22);
        System.out.println(set.contains(22)+" "+ set.contains(18));
         System.out.println(set.size());
         System.out.println(set);
    }
}