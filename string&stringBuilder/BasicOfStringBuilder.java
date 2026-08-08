// // String objects are stored in two places:
// // 1) String Constant Pool (inside Heap Memory)
// // 2) Normal Heap Memory

// // String Pool:
// // - It is a special memory area inside the heap.
// // - It stores only one copy of each unique string literal.
// // - If the same string is created again, Java reuses the existing object
// //   instead of creating a new one.

// public class BasicOfStringBuilder {
//     public static void main(String[]args) {

//         // Array object is created inside Heap Memory.
//         int[] arr = {2, 3, 4, 5, 19};

//         // Primitive variables are stored directly in stack memory.
//         int a = 10;

//         // "shubham barkale" is a string literal.
//         // It is stored in the String Pool.
//         // Variable 'name' stores the reference (address) of that object.
//         String name = "shubham barkale";
//         System.out.println(name);

//         // "STG" is also stored in the String Pool.
//         String name1 = "STG";
//         System.out.println(name1);

//         // Strings are immutable (cannot be changed).
//         // When we assign "Ram", Java does NOT modify "STG".
//         // Instead, a new String object "Ram" is created in the String Pool,
//         // and name1 now points to "Ram".
//         // The "STG" object still exists in the pool.
//         name1 = "Ram";

//         System.out.println(name1);

//         // Since "STG" already exists in the String Pool,
//         // Java does not create a new object.
//         // name2 simply points to the existing "STG" object.
//         String name2 = "STG";
//     }
// }