/**
 * G am eO fL if e
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

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] directions = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int sum = 0;
                int value = board[i][j];
                for(int[] direction : directions){
                    int x = i + direction[0];
                    int y = j + direction[1];
                    if(x>=0 && y>=0 && x<m && y<n){
                        sum += board[x][y]%2;
                    }
                }
                if(value == 0 && sum == 3){
                    board[i][j] = 2;
                } else if(value == 1 && (sum<2 || sum>3)) board[i][j]=3;
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j< n; j++){
                board[i][j] = board[i][j]/2; 
            }
        }
    }
}

