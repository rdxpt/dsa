package problem75LC;

public class FindtheMinimumAreatoCoverAllOnesI {
    public static int minimumArea(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int minR = m;
        int maxR = -1;
        int minC = n;
        int maxC = -1;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    minR = Math.min(minR, i);
                    maxR = Math.max(minR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }

        return (maxR-minR+1)*(maxC-minC+1);
    }
}
