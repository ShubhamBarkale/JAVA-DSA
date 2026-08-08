// 1672. Richest Customer Wealth



// class Solution {
//     public int maximumWealth(int[][] accounts) {

//         int maxWealth = 0;

//         // Traverse each customer (row)
//         for (int i = 0; i < accounts.length; i++) {

//             int sum = 0;

//             // Traverse each bank account (column)
//             for (int j = 0; j < accounts[i].length; j++) {
//                 sum += accounts[i][j];
//             }

//             // Update maximum wealth
//             if (sum > maxWealth) {
//                 maxWealth = sum;
//             }
//         }

//         return maxWealth;
//     }
// }
