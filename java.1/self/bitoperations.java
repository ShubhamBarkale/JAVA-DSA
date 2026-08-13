// public class bitoperations{
//     public static void main(String[] args) {
//         //gert bit
//         int n=5;//0101
//         int pos=2;
//         int bitmask=1<<pos;
         
//          if((bitmask & n)==0){
//             System.out.println("bit was 0");
//          }
//          else{
//             System.out.println("bit was 1");
//          }
//     }
 // }




// public class bitoperations {
//     public static void main(String[] args) {
        
//         // Number whose bit we want to check
//         int n = 5; // binary: 0101
        
//         // Position of the bit to check (0-based from right)
//         int pos = 2;
        
//         // Create a bitmask by shifting 1 to the left by 'pos'
//         // 1 << 2 = 0100
//         int bitmask = 1 << pos;
         
//         // Perform AND operation between n and bitmask
//         // If result is 0 → bit is 0
//         // If result is non-zero → bit is 1
//         if ((bitmask & n) == 0) {
//             System.out.println("bit was 0"); // bit at position is 0
//         } else {
//             System.out.println("bit was 1"); // bit at position is 1
//         }
//     }
// }











// public class bitoperations {
//     public static void main(String[] args) {

//         // Original number
//         int n = 5; // binary: 0101

//         // Position where we want to SET the bit (make it 1)
//         int pos = 1;

//         // Create bitmask by shifting 1 to position
//         // 1 << 1 = 0010
//         int bitMask = 1 << pos;

//         // OR operation sets the bit:
//         // If bit is already 1 → stays 1
//         // If bit is 0 → becomes 1
//         int newNumber = bitMask | n;

//         // Print result
//         System.out.println(newNumber);
//     }
// }
        








// public class bitoperations {
//     public static void main(String[] args) {

//         // Original number
//         int n = 5; // binary: 0101

//         // Position to clear (make 0)
//         int pos = 2;

//         // Step 1: create bitmask
//         // 1 << 2 = 0100
//         int bitMask = 1 << pos;

//         // Step 2: invert bitmask using NOT (~)
//         // ~(0100) = 1011
//         int notBitMask = ~bitMask;

//         // Step 3: AND with original number
//         // This will clear the bit at 'pos'
//         int newNumber = n & notBitMask;

//         // Print result
//         System.out.println(newNumber);
//     }
// }