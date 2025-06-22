package DSA.Arrays;

public class DigonalSum_2DMatrix {

    public static int calculateDiagonalSum(int [][] matrix){
           int sum = 0;
           int n = matrix.length;
           for (int i = 0 ; i<n;i++){
                // Primary diagonal
                sum += matrix[i][i];
                
                // Secondary diagonal
                if (i != n - 1 - i) { // Avoid double counting the middle element in odd-sized matrices
                     sum += matrix[i][n - 1 - i];
                }
           }
           return sum;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3 , 4},
            {5, 6, 7, 8 },
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        
        int diagonalSum = calculateDiagonalSum(matrix);
        System.out.println("Diagonal Sum: " + diagonalSum);
    }
}
