package problem75LC;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutestoMakeAllPathsLeadtotheCityZero{
    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i<n; i++) adj.add(new ArrayList<>());

        for(int[] edge : connections){
            adj.get(edge[0]).add(new int[] {edge[1], 1});
            adj.get(edge[1]).add(new int[] {edge[0], 0});
        }

        boolean[] visited = new boolean[n];
        return dfs(0, adj, visited);
    }

    public int dfs(int curr, List<List<int[]>> adj, boolean[] visited){
        visited[curr] = true;
        int totalFlips = 0;

        for(int[] edge : adj.get(curr)){
            int neighbor = edge[0];
            int cost = edge[1];

            if(!visited[neighbor]){
                totalFlips += cost;
                totalFlips += dfs(neighbor, adj, visited);
            }
        }
        return totalFlips;
    }
    
}