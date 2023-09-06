package Graphs;
import java.util.*;
public class topological_sorting_using_bfs {
    public static void Topological_Sorting(int n,ArrayList<ArrayList<Integer>>adj){
        int topo[]=new int[adj.size()];
        int indegree[]=new int[adj.size()];
        for(int j=0;j<n;j++){
            for(Integer i:adj.get(j)){
                indegree[i]++;
            }
        }
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        int index=0;
        while(!queue.isEmpty()){
            int k=queue.poll();
            topo[index++]=k;
            for(Integer i:adj.get(k)){
                indegree[i]--;
                if(indegree[i]==0){
                    queue.add(i);
                }
            }
        }
        System.out.println("Topological soeting is ");
        for(int i=0;i<n;i++){
            System.out.print(topo[i]+" ");
        }
    }
    public static void main(String args[]){
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(3).add(1);
        adj.get(2).add(3);
        Topological_Sorting(6,adj);
    }
}
