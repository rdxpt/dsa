import java.util.LinkedList;
import java.util.Queue;

public class GraphAdjacencyMatrix {
    private int[][] adj;
    private int E;
    private int V;

    public GraphAdjacencyMatrix(int nodes) {
        this.adj = new int[nodes][nodes];
        this.E = 0;
        this.V = nodes;
    }

    public void addEdge(int u, int v) {
        this.adj[u][v] = 1;
        this.adj[v][u] = 1;
        E++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" : vertices "+E+" : edges"+"\n");
        for(int v = 0; v<V; v++){
            sb.append(v+": ");
            for(int w : adj[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for(int v=0; v<V; v++){
                if(adj[u][v]==1 && !visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyMatrix g = new GraphAdjacencyMatrix(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        System.out.println(g);
        g.bfs(0);
    }
}