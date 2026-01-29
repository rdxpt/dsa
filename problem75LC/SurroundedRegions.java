/**
 * S ur ro un de dR eg io ns
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

public class SurroundedRegions {
    private int m;
    private int n;
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;

        this.m = board.length;
        this.n = board[0].length;


        // N -> Not Surrounded

        // top & bottom border search
        for(int i = 0; i < n; i++){
            if(board[0][i] == 'O'){
                dfs(board, 0, i);
            }
            if(board[m-1][i] == 'O'){
                dfs(board, m-1, i);
            }
        }

        // left & right border search
        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            if(board[i][n-1] == 'O'){
                dfs(board, i, n-1);
            }
        }

        // implementing the changes

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'N'){
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }


    }
    private void dfs(char[][] board, int row, int col){
        if(row<0 || row >= m || col<0 || col >= n || board[row][col]!='O') return;
        board[row][col] = 'N';
        dfs(board, row + 1, col);
        dfs(board, row - 1, col);
        dfs(board, row, col + 1);
        dfs(board, row, col - 1);
    }
}

