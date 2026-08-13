// class Backtracking {

//     // Function to print all permutations
//     public static void printPermutation(String str, String perm, int idx) {

//         // Base case
//         // If original string becomes empty,
//         // print the formed permutation
//         if (str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }

//         // Loop through every character
//         for (int i = 0; i < str.length(); i++) {

//             // Current character
//             char currChar = str.charAt(i);

//             // Create new string by removing current character
//             String newStr = str.substring(0, i) + str.substring(i + 1);

//             // Recursive call
//             printPermutation(newStr, perm + currChar, idx + 1);
//         }
//     }

//     public static void main(String[] args) {

//         String str = "ABC";

//         // Function call
//         printPermutation(str, "", 0);
//     }
// }