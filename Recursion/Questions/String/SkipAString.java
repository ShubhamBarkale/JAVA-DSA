// // remove a from string 

// public class SkipAString{
//     public static void main(String[] args) {

//         skip("","baccdah");
//     }
//     static void skip(String p ,String up) {
//         if(up.isEmpty()){
//             System.out.print(p);
//             return;
//         }
//         char ch = up.charAt(0);

//         if(ch=='a'){
//             skip(p, up.substring(1));

//         }
//         else{
//             skip(p+ch,up.substring(1));
//         }
//     }
// }



// //  same but slightliyy diff true to search and compare 

//  public class SkipAString {

//     public static void main(String[] args) {
//         System.out.println(skip("bbaacagjajra"));
//     }

//     static String skip(String up) {

//         if (up.isEmpty()) {
//             return "";
//         }

//         char ch = up.charAt(0);

//         if (ch == 'a') {
//             return skip(up.substring(1));
//         } else {
//             return ch + skip(up.substring(1));
//         }
//     }
// }

