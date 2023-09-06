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
    int col;
    Tuple(Node node,int col){
        this.node=node;
        this.col=col;
    }
}
public class BottomView_of_Bt {
    public static void bottomView(Node root){
        if(root==null){
            return;
        }
        Map<Integer,Integer>map=new TreeMap<>();
        Queue<Tuple>queue=new LinkedList<>();
        queue.add(new Tuple(root, 0));
        while(!queue.isEmpty()){
            Tuple tuple=queue.poll();
            Node node=tuple.node;
            int col=tuple.col;
            map.put(col,node.data);
            if(node.left!=null){
                queue.add(new Tuple(node.left, col-1));
            }
            if(node.right!=null){
                queue.add(new Tuple(node.right, col+1));
            }
        }
        System.out.println("Bottom view of the given Binary tree");
        for(Integer i:map.values()){
            System.out.print(i+" ");
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
        bottomView(root);
    }
}
