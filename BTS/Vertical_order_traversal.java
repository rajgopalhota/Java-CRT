package BTS;
import java.util.*;
class Node{
    int data;
    Node left;;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tuple{
    Node node;
    int row;
    int column;
    Tuple(Node node,int row,int column){
        this.node=node;
        this.row=row;
        this.column=column;
    }
}
public class Vertical_order_traversal {
    public static void verticalOrder_traversal(Node root){
        TreeMap<Integer,Map<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple> queue =new LinkedList<Tuple>();
        queue.add(new Tuple(root,0,0));
        while(!queue.isEmpty()){
            Tuple tuple=queue.poll();
            Node node=tuple.node;
            int row=tuple.row;
            int col=tuple.column;
            if(!map.containsKey(row)){
                map.put(row,new TreeMap<>());
            }
            if(!map.get(row).containsKey(col)){
                map.get(row).put(col,new PriorityQueue<>());
            }
            map.get(row).get(col).add(node.data);
            if(node.left!=null){
                queue.add(new Tuple(node.left,row-1,col+1));
            }
            if(node.right!=null){
                queue.add(new Tuple(node.right, row+1, col+1));
            }
        }
        System.out.println("Vertical order traversal is ");
        for(Integer i:map.keySet()){
            Map<Integer,PriorityQueue<Integer>>m=map.get(i);
            for(Integer j:m.keySet()){
                PriorityQueue<Integer> p=m.get(j);
                for(Integer k:p){
                    System.out.print(k+" ");
                }
            } 
        }
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.left = new Node(9);
        root.right.right = new Node(10);
        verticalOrder_traversal(root);
    }
}
