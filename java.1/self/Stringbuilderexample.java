// public class Stringbuilderexample {
//     public static void main(String[] args) {
        
//         // Create a StringBuilder object with initial value "tony"
//         StringBuilder sb = new StringBuilder("tony");
        
//         // Print the whole string
//         System.out.println(sb);   // output: tony
        
//         // Print character at index 1 (index starts from 0)
//         System.out.println(sb.charAt(1));   // output: o
        
//         // Change character at index 0 to '$'
//         sb.setCharAt(0, '$');
//         System.out.println(sb);   // output: $ony
        
//         // Print updated character at index 0
//         System.out.println(sb.charAt(0));   // output: $
        
//         // Insert character 'e' at index 4 (end of string)
//         sb.insert(4, 'e');
//         System.out.println(sb);   // output: $onye
        
//         // Delete characters from index 3 to 4 (end index is exclusive)
//         sb.delete(3, 4);
//         System.out.println(sb);   // output: $one
//     }
// }





// public class Stringbuilderexample {
//     public static void main(String[] args) {
        
//         // Create StringBuilder with initial character "h"
//         StringBuilder sb = new StringBuilder("h");
        
//         // Append characters one by one
//         sb.append("e");   // now string becomes "he"
//         sb.append("l");   // now string becomes "hel"
//         sb.append("l");   // now string becomes "hell"
//         sb.append("o");   // now string becomes "hello"
        
//         // Print final string
//         System.out.println(sb);   // output: hello
//         System.out.println(sb.length());
//     }
// }  














// public class Stringbuilderexample{
//     public static void main(String[] args) {
        
//         String str = "hello";
//         String reversed = "";
        
//         // Loop from end to start
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }
        
//         System.out.println(reversed);   // output: olleh
//     }
// }

















