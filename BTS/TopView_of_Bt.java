package BTS;
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Tuple{
    Node node;
    int column; 
    Tuple(Node node,int column){ 
        this.node=node;
        this.column=column; 
    }
}
public class TopView_of_Bt {
    public static void topView(Node root){
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Tuple> queue=new LinkedList<Tuple>();
        queue.add(new Tuple(root,0));
        while(!queue.isEmpty()){
            Tuple tuple=queue.poll();
            Node node=tuple.node;
            int column=tuple.column; 
            if(!map.containsKey(column)){
                map.put(column, node.data);
            }
            if(node.left!=null){
                queue.add(new Tuple(node.left, column - 1)); // Corrected this line
            }
            if(node.right!=null){
                queue.add(new Tuple(node.right, column + 1)); // Corrected this line
            }
        }
        for(Integer i:map.keySet()){
            System.out.print(map.get(i) + " "); 
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
        topView(root);
    }
}
