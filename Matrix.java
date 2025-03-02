public class Matrix{

    public static class Coordinate{
        public int x;
        public int y;

        public Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
        public String toString() {
            return "(" + x + " x " + y + ")";
        }
    }
    
    public static int[][] createMatrix(){
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;

        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;

        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;

        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;
        
        return matrix;
    }

    public static Coordinate searchKeyInSortedMatrix(int[][] matrix, int n, int key){
        int i = 0;
        int j = n-1;
        while(i<n && j>=0 ){
            if(matrix[i][j]==key){
                return new Coordinate(i,j);
            }
            if(matrix[i][j]>key)j--;
            else i++;
        }
        return null;
    }

    public static void spiralPrint(int[][] matrix, int r, int c){
        int i, k = 0, l = 0;
        while(k<r && l<c){
            for(i=l; i<c; i++)System.out.print(matrix[k][i]+" ");
            k++;
            for(i=k;i<r;i++)System.out.print(matrix[i][c-1]+" ");
            c--;
            if(k<r){
                for(i=c-1;i>=l;i--)System.out.print(matrix[r-1][i]+" ");
                r--;
            }
            if(l<c){
                for(i=r-1;i>=k;i--)System.out.print(matrix[i][l]+" ");
            }
            l++;
        }
    }

    public static void spiro(int[][] mat, int r, int c){
        int i, k = 0, l = 0;
        while(k<r && l<c){
            for(i=l; i<c; i++)System.out.print(mat[k][i]+" ");
            k++;
            for(i=k; i<r; i++)System.out.print(mat[i][c-l]+" ");
            c--;
            if(k<r){
                for(i=c-l; i>=l; i--)System.out.print(mat[r-l][i]);
            }
            if(l<c){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = createMatrix();
        Coordinate loc = searchKeyInSortedMatrix(mat, 4, 48);
        if(loc!=null)System.out.println(loc.toString());
        spiralPrint(mat, 4, 4);
        spiro(mat, 4, 4);
        System.out.println(mat.length);
    }
}