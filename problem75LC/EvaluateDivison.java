package problem75LC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluateDivison {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for(int i=0; i<equations.size(); i++){
            String start = equations.get(i).get(0);
            String end = equations.get(i).get(1);
            Double value = values[i];

            graph.computeIfAbsent(start, k -> new HashMap<>()).put(end, value);
            graph.computeIfAbsent(end, k -> HashMap<>()).put(start, 1.0 / value);
        }

        double[] results = new double[queries.size()];

        for(int i=0; i<queries.size()l i++){
            String start = queries.get(i).get(0);
            String end = queries.get(i).get(1);
            results[i] = dfs(start, end, new HashSet<>(), graph);
        }
        
        return results;
    }

    private double dfs(String current, String target, Set<String> visited, Map<String, Map<String, Double>> graph){
        if(!(graph.containsKey(current) || graph.containsKey(target)) return -1.0;
        if(current.equals(target)) return 1.0;

        visited.add(current);

        Map<String, Double> neighbours = graph.get(current);

        for(Map.Entry<String, Double> neighbour : neighbours.entrySet()){
            String next = neighbour.getKey();
            if(!visited.contains(next)){
                double res = dfs(next, target, visited, graph);
                if(res != -1.0) return res * neighbour.getValue();
            }
        }

        return -1.0;
    }
}
