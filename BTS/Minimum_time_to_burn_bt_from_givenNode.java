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
public class Minimum_time_to_burn_bt_from_givenNode {
    public static void parent_node(Node root,Map<Node,Node>parent){
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            if(current.left!=null){
                parent.put(current.left, current);
                queue.add(current.left);
            }
            if(current.right!=null){
                parent.put(current.right, current);
                queue.add(current.right);
            }
        }
    }
    public static void minimum_burn_time(Node root,Node target){
        if(root==null){
            return;
        }
        Map<Node,Node>parent=new HashMap<>();
        parent_node(root,parent);
        Queue<Node>queue=new LinkedList<>();
        Map<Node,Boolean> visited=new HashMap<>();
        queue.add(target);
        int time=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            time++;
            while(size-->0){
                Node current=queue.poll();
                if(current.left!=null&&(visited.get(current.left)==null)){
                    queue.add(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null&&(visited.get(current.right)==null)){
                    queue.add(current.right);
                    visited.put(current.right,true);
                }
                if(parent.get(current)!=null&&(visited.get(current)==null)){
                    queue.add(parent.get(current));
                    visited.put(parent.get(current),true);
                }
            }
        }
        System.out.println("the minimum time to destory the binary tree is "+time);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
        
        Node target = root.left.right;
        minimum_burn_time(root, target);
        
    }
}
