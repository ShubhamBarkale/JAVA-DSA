//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the no of rows");
//         int rows=sc.nextInt();
//         System.out.println("enter the no of colum");
//         int col =sc.nextInt();
//         int [][] matrix=new int[rows][col];



//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j]=sc.nextInt();
                
//             }
            
//         }
//          System.err.println("the matrix is");
//          for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < col; j++) {
               
//                 System.out.print(matrix[i][j]+" ");
                
//             }
//             System.out.println();
            
//         }
        
//     }
    
// }






// search an element x in matrix

// public class toDArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the no of rows");
//         int row = sc.nextInt();

//         System.out.println("Enter the no of col");
//         int col = sc.nextInt();

//         int[][] matrix = new int[row][col];
//         System.out.println("enter the elements");

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("ENTER THE ELEMENT TO FIND IN MATRIX :-");
//         int x = sc.nextInt();

//         boolean found = false;

//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if (matrix[i][j] == x) {
//                     System.out.println(
//                         "ELEMENT IS FOUND AT (" + i + "," + j + ")"
//                     );
//                     found = true;
//                 }
//             }
//         }

//         if (!found) {
//             System.out.println("Not Found");
//         }

//         sc.close();
//     }
// }


















// spiral order of the matrix


public class toDArray {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printSpiral(matrix);
    }

    static void printSpiral(int[][] matrix) {

        int row_start = 0;
        int row_end = matrix.length - 1;

        int col_start = 0;
        int col_end = matrix[0].length - 1;

        while (row_start <= row_end && col_start <= col_end) {

            // Top Row
            for (int j = col_start; j <= col_end; j++) {
                System.out.print(matrix[row_start][j] + " ");
            }
            row_start++;

            // Right Column
            for (int i = row_start; i <= row_end; i++) {
                System.out.print(matrix[i][col_end] + " ");
            }
            col_end--;

            // Bottom Row
            if (row_start <= row_end) {
                for (int j = col_end; j >= col_start; j--) {
                    System.out.print(matrix[row_end][j] + " ");
                }
                row_end--;
            }

            // Left Column
            if (col_start <= col_end) {
                for (int i = row_end; i >= row_start; i--) {
                    System.out.print(matrix[i][col_start] + " ");
                }
                col_start++;
            }
        }
    }
}