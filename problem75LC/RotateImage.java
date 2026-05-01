package problem75LC;

import java.util.Arrays;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = i; j < cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<rows/2; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[rows-i-1];
            matrix[rows-i-1] = temp;
        }
        System.out.println(Arrays.toString(matrix));
    }
    public static void main(String[] args) {
        rotate(new int[][] {{1,2,3}, {4,5,6}, {7,8,9}});
    }
}
