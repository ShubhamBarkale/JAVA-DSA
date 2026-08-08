// public class StringBuilderrrr {
//     public static void main(String[] args) {

//         // Creates an empty StringBuilder object.
//         // Unlike String, StringBuilder is mutable (its contents can be changed).
//         StringBuilder builder = new StringBuilder();

//         for (int i = 0; i < 26; i++) {

//             // Generates characters from 'a' to 'z'
//             char ch = (char) ('a' + i);

//             // Appends the character to the existing StringBuilder.
//             // No new String object is created each time.
//             // append() is amortized O(1), so doing it n times is O(n).
//             builder.append(ch);
//         }

//         // Prints: abcdefghijklmnopqrstuvwxyz
//         System.out.println(builder);

//         // Removes the character at index 0 ('a').
//         // All remaining characters shift one position to the left.
//         // Time Complexity: O(n)
//         builder.deleteCharAt(0);

//         // Prints: bcdefghijklmnopqrstuvwxyz
//         System.out.println(builder);

//         // You can also perform many other operations:
//         // builder.insert(index, value);
//         // builder.replace(start, end, "text");
//         // builder.reverse();
//         // builder.setCharAt(index, 'X');
//         // builder.delete(start, end);
//         // builder.length();
//         // builder.capacity();
//         // builder.toString();
//     }
// }



// // now go to methods