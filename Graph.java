import java.util.*;
import java.util.LinkedList;

public class Graph {
    HashMap<Integer,List<Integer>> obj;
    Graph()
    {
        obj=new HashMap<>();
    }
    public void addEdge(int source,int destination,boolean bidirection)
    {
        List<Integer> sneighbour=obj.getOrDefault(source,new ArrayList<>());
        sneighbour.add(destination);
        obj.put(source,sneighbour);
        if(bidirection)
        {
            List<Integer> dneighbour= obj.getOrDefault(destination,new ArrayList<>());
            dneighbour.add(source);
            obj.put(destination,dneighbour);
        }
    }
    public void display()
    {
        for(Map.Entry<Integer,List<Integer>> entry: obj.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public void bfs(int source)
    {
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(source);
        Set<Integer> vis=new HashSet<>();
        vis.add(source);
        while (!bfs.isEmpty())
        {
            int front=bfs.poll();
            System.out.print(front+" ");
            List<Integer> neighbourlist=obj.get(front);
            for (int neighbour:neighbourlist)
            {
                if(!vis.contains(neighbour))
                {
                    bfs.add(neighbour);
                    vis.add(neighbour);
                }
            }
        }
    }

    public void dfs(int source)
    {
        Set<Integer> vis=new HashSet<>();
        dfsHelper(source,vis);
    }
    public void dfsHelper(int source,Set<Integer>vis)
    {
        vis.add(source);
        System.out.print(source+" ");
        List<Integer> neighbourlist=obj.get(source);
        for (int neighbour:neighbourlist)
        {
            if (!vis.contains(neighbour))
                dfsHelper(neighbour,vis);
        }

    }

    //single source shortest path using bfs
    public void sssp(int source)
    {
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(source);
        Map<Integer,Integer> dis=new HashMap<>();
        for (int vertex:obj.keySet())
        {
            dis.put(vertex,Integer.MAX_VALUE);
        }
        dis.put(source,0);
        while (!bfs.isEmpty())
        {
            int front=bfs.poll();
            List<Integer> neighbourlist=obj.get(front);
            for (int neighbour:neighbourlist)
            {
                if(dis.get(neighbour)==Integer.MAX_VALUE)
                {
                    bfs.add(neighbour);
                    int distance=dis.get(front)+1;
                    dis.put(neighbour,distance);
                    System.out.println("Distance of "+neighbour+" from source "+source+" is "+distance);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph obj1=new Graph();
//        obj1.addEdge(1,2,true);
//        obj1.addEdge(1,3,true);
//        obj1.addEdge(1,4,true);
//        obj1.addEdge(2,3,true);
//        obj1.addEdge(3,4,true);
//        obj1.addEdge(3,5,true);
//        obj1.addEdge(4,5,true);
//        obj1.addEdge(5,6,true);
//        obj1.addEdge(5,7,true);
        obj1.addEdge(0,1,true);
        obj1.addEdge(1,3,true);
        obj1.addEdge(3,4,true);
        obj1.addEdge(4,2,true);
        obj1.addEdge(2,0,true);
        obj1.addEdge(1,2,true);
        obj1.addEdge(2,3,true);
        obj1.display();
        System.out.println("BFS:");
        obj1.bfs(1);
        System.out.println();
        System.out.println("DFS :");
        obj1.dfs(1);
        System.out.println();
        System.out.println("sssp");
        obj1.sssp(1);
    }
}
