/**
 * N um be rO fI sl an ds
 *
 * Purpose:
 * - LeetCode practice solution (revision notes at top).
 *
 * Key idea:
 * - Summarize the core trick you used (2â€“3 bullets) after solving once.
 *
 * Complexity:
 * - Time:  See method-level notes (depends on approach).
 * - Space: See method-level notes (depends on approach).
 *
 * Edge cases / gotchas:
 * - Write the tricky cases you tend to forget.
 *
 * Tags: DSA
 */
package problem75LC;

public class NumberOfIslands {
    public static int numIslands(char[][] grid) {
        int numOfIslands = 0;
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid, visited, i, j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
    public static void dfs(char[][] grid, boolean[][] visited, int i, int j){
        int m = grid.length;
        int n = grid[0].length;

        int[][] directions = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};

        if(i<0 || i>=m || j<0 || j>=n || visited[i][j] || grid[i][j] != '1') return;
        visited[i][j] = true;

        for(int[] dir : directions){
            dfs(grid, visited, i+dir[0], j+dir[1]);
        }
    }
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        int result = numIslands(grid);
        System.out.println("Number of islands: " + result);
    }
}

