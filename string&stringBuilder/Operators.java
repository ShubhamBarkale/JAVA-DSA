import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        // Characters are internally stored as integers (ASCII/Unicode values).
        // 'a' = 97
        // 'b' = 98

        System.out.println('a' + 'b');
        // 97 + 98 = 195
        // Output: 195


        // If at least one operand is a String,
        // Java performs String Concatenation.

        System.out.println("a" + "b");
        // Output: ab


        // 'a' = 97
        // 97 + 3 = 100
        // (char)100 = 'd'

        System.out.println((char) ('a' + 3));
        // Output: d


        // Here "a" is already a String.
        // Therefore 3 is automatically converted into String "3"
        // and concatenated.

        System.out.println("a" + 3);
        // Output: a3


        // new ArrayList<>() creates an empty ArrayList object.
        // During concatenation Java automatically calls toString().

        System.out.println("kunal" + new ArrayList<>());
        // Internally:
        // "kunal" + new ArrayList<>().toString()

        // ArrayList's toString() returns "[]"

        // Output:
        // kunal[]


        // Integer object is also converted to String
        // using its toString() method.

        System.out.println("kunal" + new Integer(56));

        // Internally:
        // "kunal" + Integer.valueOf(56).toString()

        // Output:
        // kunal56
    }
}