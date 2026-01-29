/**
 * N um be rO fP ro vi nc es
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

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, i, visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int[][] isConnected, int v, boolean[] visited) {
        visited[v] = true;
        for (int w = 0; w < isConnected.length; w++) {
            if (isConnected[v][w] == 1 && !visited[w]) {
                dfs(isConnected, w, visited);
            }
        }
    }
}

