package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class Bfs {
    private int V; 
    private static LinkedList<Integer>[] adj;

    public Bfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    public static void addEdge(int source,int destination){
        adj[source].add(destination);
    }
    public static void bfs(int source){
       boolean visited[]=new boolean[adj.length];
       LinkedList<Integer> queue=new LinkedList<>();
       visited[source]=true;
       queue.add(source);
       while(!queue.isEmpty()){
         int k=queue.poll();
         System.out.print(k+" ");
         Iterator i=adj[k].listIterator();
         while(i.hasNext()){
            int l=(int)i.next();
            if(visited[l]==false){
                visited[l]=true;
                queue.add(l);
            }
         }
       }
    }
    public static void main(String args[]){
        Bfs graph = new Bfs(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Breadth First Traversal (starting from vertex 2):");
        graph.bfs(2);
    }
}
