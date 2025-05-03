public class test{
    public static void dfs(char[][] grid, int i, int j, boolean[][ ]visited) {
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || j<0 || i>=m || j>=n || visited[i][j] || grid[i][j]!='1'){
            return;
        }

        visited[i][j] = true;

        dfs(grid, i+1, j, visited);
        dfs(grid, i-1, j, visited);
        dfs(grid, i, j+1, visited);
        dfs(grid, i, j-1, visited);
    }
    public static int numIslands(char[][] grid){
        int numIslands = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    dfs(grid, i, j, visited);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
}