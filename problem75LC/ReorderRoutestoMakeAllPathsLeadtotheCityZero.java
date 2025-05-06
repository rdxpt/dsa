package problem75LC;

import java.util.ArrayList;
import java.util.List;

public class ReorderRoutestoMakeAllPathsLeadtotheCityZero{
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());

        for(int[] conn : connections){
            int from = conn[0], to = conn[1];
            graph.get(from).add(new int[]{to,1});
            graph.get(to).add(new int[]{from, 0});
        }
    }
    
}