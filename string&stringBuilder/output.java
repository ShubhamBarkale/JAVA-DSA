// import java.util.Arrays;

// public class output {
//     public static void main(String[] args) {

//         // Primitive value
//         System.out.println(56);

//         // Wrapper Class:
//         // Integer is a class that wraps the primitive int into an object.
//         // (Nowadays we usually write: Integer num = 56;)
//         Integer num = new Integer(56);

//         // toString() converts the Integer object into String "56"
//         System.out.println(num.toString());

//         // println(Object x) automatically calls x.toString()
//         System.out.println(num);

//         System.out.println("shubham");

//         // Arrays do NOT override toString().
//         // Therefore Object's toString() method is called.
//         // Output will look like: [I@36baf30c
//         System.out.println(new int[]{2, 4, 6, 7, 8});

//         // Arrays.toString() prints array elements properly.
//         System.out.println(Arrays.toString(new int[]{2, 4, 6, 7, 8}));

//         // null reference
//         String name = null;
//         System.out.println(name); // prints "null"
//     }
// }