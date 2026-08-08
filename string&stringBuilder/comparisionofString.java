// Two ways to compare Strings in Java:
// 1) ==        -> compares references (memory addresses)
// 2) equals()  -> compares actual content (characters)

public class comparisionofString {
    public static void main(String[] args) {

        // Both "shubham" literals are stored in the String Pool.
        // Since the value is the same, Java creates only ONE object.
        String a = "shubham";
        String b = "shubham";

        // c stores the same reference as 'a'
        String c = a;

        // == checks whether both variables point to the same object
        System.out.println(a == b); // true
        System.out.println(c == b); // true

        // 'new' keyword forces Java to create a new object in heap memory,
        // even if the same value already exists in the String Pool.
        String name1 = new String("shubham");
        String name2 = new String("shubham");

        // Different objects -> different references
        System.out.println(name1 == name2); // false

        // equals() compares only the contents of the strings
        // Both contain "shubham", so result is true.
        System.out.println(name1.equals(name2)); // true

        // charAt(index) returns the character at a specific index.
        // Indexing starts from 0.
        // "shubham"
        //  0123456
        System.out.println(name1.charAt(2)); // 'u'
    }
}