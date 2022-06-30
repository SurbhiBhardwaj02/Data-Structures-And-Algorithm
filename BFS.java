import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int V;
    private LinkedList<Integer> adj[];

    BFS(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i =0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int e) {
        adj[v].add(e);
    }
    public void bfs(int s){
        boolean visited[] = new boolean[adj.length];
        Queue<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s+" ");

            for (int e: adj[s]){
                if (visited[e] != true){
                    visited[e] = true;
                    queue.add(e);
                }
            }
        }

    }

    public static void main(String[] args) {
        BFS obj = new BFS(4);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);

        obj.bfs(2);
    }


}