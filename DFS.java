import java.util.LinkedList;

public class DFS {
    private int v;
    private LinkedList<Integer> adj[];

    DFS(int V){
        v= V;
        adj = new LinkedList[V];
        for (int i = 0; i< V; ++i)
            adj[i] = new LinkedList();
    }
    public void addEdge(int v, int e){
        adj[v].add(e);
    }
    public void dfsHelper(){
        boolean visited[] = new boolean[adj.length];
        dfs(2, visited);
    }
    public void dfs(int s, boolean visited[]) {
        //
        visited[s] = true;
        System.out.print(s + " ");

        for (int e : adj[s]) {
            if (visited[e] != true) {
                dfs(e, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS obj = new DFS(4);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);

        obj.dfsHelper();
    }
}
