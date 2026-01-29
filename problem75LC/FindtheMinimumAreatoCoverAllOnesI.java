/**
 * F in dt he Mi ni mu mA re at oC ov er Al lO ne sI
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

