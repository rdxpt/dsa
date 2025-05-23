import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphAdjacencyList {
    LinkedList<Integer>[] adj;
    private int V;      // size of array
    private int E;      // size of data
    private boolean[] visited = new boolean[V];
    private int[] comptId = new int[V];
    private int count = 0;

    @SuppressWarnings("unchecked")
    public GraphAdjacencyList(int nodes){
        this.V = nodes;
        this.E=0;
        this.adj = new LinkedList[nodes];
        for(int v=0; v<nodes; v++){
            this.adj[v] = new LinkedList<>();
        }
        
    }
    public void addEdge(int u, int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V+" vertices, "+E+" edges"+"\n");
        for(int v=0; v<V; v++){
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
        visited[s] = true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" ");
            for(int v : adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }

    public void dfs(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.print(u+" ");
                for(int v : adj[u]){
                    if(!visited[v])stack.push(v);
                }
            }
        }
    }

    public void dfs(){
        boolean[] visited = new boolean[V];
        for(int v=0; v<V;v++){
            if(!visited[v])dfs(v,visited);
        }
    }
    public void dfs(int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v+" ");
        for(int w: adj[v]){
            if(!visited[w]){
                dfs(w, visited);
            }
        }
    }

    public void dfsConnectedComponents(){
        
        for(int v=0; v<V; v++){
            if(!visited[v]){
                dfsConnectedComponents(v, visited, comptId, count);
                count++;
            }
        }
    }
    public void dfsConnectedComponents(int v, boolean[] visited, int[] comptId, int count){
        visited[v] = true;
        comptId[v] = count;
        for(int w : adj[v]){
            if(!visited[w]){
                dfsConnectedComponents(w, visited, comptId, count);
            }
        }
    }
    public int getCountCC(){
        return count;
    }
    public boolean isConnected(int x, int y){
        return comptId[x]==comptId[y];
    }

    public static void main(String[] args) {
        GraphAdjacencyList g = new GraphAdjacencyList(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        System.out.println(g);
        g.bfs(0);
        System.out.println();
        g.dfs(0);
        System.out.println();
        g.dfs();
    }
}
