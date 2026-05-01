package problem75LC;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        boolean firstColZero = false;
        
        for(int i = 0; i < r; i++){
            
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 0; i < r; i++){
            if(matrix[i][0] == 0){
                for(int j = 1; j < c; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < c; j++){
            if(matrix[0][j] == 0){
                for(int i = 0; i < r; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
