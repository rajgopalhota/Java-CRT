package Graphs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int node;
    int parent;
    Node(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}

public class Detect_cycle_in_a_graph_using_bfs {
    public static boolean Cycle_check(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[]){
        Queue<Node> queue=new LinkedList<>();
        queue.add(new Node(s, -1));
        visited[s]=true;
        while(!queue.isEmpty()){
            int node=queue.peek().node;
            int parent=queue.peek().parent;
            queue.remove();
            for(Integer i:adj.get(node)){
                if(visited[i]==false){
                    queue.add(new Node(i,node));
                    visited[i]=true;
                }
                else if(parent!=i){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int v){
        boolean visited[]=new boolean[v];
        Arrays.fill(visited,false);
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                if(Cycle_check(adj,i,visited)){
                    return true;
                }
            }
        }
        return false;
    
    }
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
                
        Detect_cycle_in_a_graph_using_bfs obj = new Detect_cycle_in_a_graph_using_bfs();
        boolean ans = obj.isCycle(adj,4);
        if (ans)
            System.out.println("1");    
        else
            System.out.println("0");
    }
}

