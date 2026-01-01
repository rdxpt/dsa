package problem75LC;

public class FindtheMinimumAreatoCoverAllOnesII {
    public static int minimumAreaII(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;

        int result = Integer.MAX_VALUE;

        for(int rowSplit=1; rowSplit<m; rowSplit++){
            for(int colSplit= 1; colSplit<n; colSplit++){
                int top = minimumArea(0, rowSplit, 0, n, grid);
                int bottomLeft = minimumArea(rowSplit, m, 0, colSplit, grid);
                int bottomRight = minimumArea(rowSplit, m, colSplit, n, grid);
                result = Math.min(result, top+bottomLeft+bottomRight);
                
                int topLeft = minimumArea(0, rowSplit, 0, colSplit, grid);
                int topRight = minimumArea(0, rowSplit, colSplit, n, grid);
                int bottom = minimumArea(rowSplit, m, 0, n, grid);
                result = Math.min(result, topLeft+topRight+bottom);
            }
        }

        for(int i=1; i<m; i++){
            for(int j= i+1; j<n; j++){
                int top1 = minimumArea(0, i, 0, n, grid);
                int top2 = minimumArea(i, j, 0, n, grid);
                int top3 = minimumArea(j, m, 0, n, grid);
                result = Math.min(result, top1+top2+top3);

                int bottom1 = minimumArea(0, i, 0, i, grid);
                int bottom2 = minimumArea(0, i, i, j, grid);
                int bottom3 = minimumArea(0, i, j, n, grid);
                result = Math.min(result, bottom1+bottom2+bottom3);
            }
        }


        return result;
    }

    public static int minimumArea(int r1, int r2, int c1, int c2, int[][] grid){
      
        int minR = r1;
        int maxR = r2;
        int minC = c1;
        int maxC = c2;

        for(int i=r1; i<r2+1; i++){
            for(int j=c1; j<c2+1; j++){
                if(grid[i][j]==1){
                    minR = Math.min(minR, i);
                    maxR = Math.max(maxR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }

        return (maxR-minR+1)*(maxC-minC+1);
    }
}
