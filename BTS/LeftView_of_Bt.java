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
public class LeftView_of_Bt {
    public static void rightView(Node root){
        Map<Integer,Integer>map=new TreeMap<>();
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        int row=0;
        while(!queue.isEmpty()){
            
            int size=queue.size();
            while(size-->0){
                Node cur=queue.poll();
                if(!map.containsKey(row))
                    map.put(row,cur.data);
                if(cur.left!=null){
                    queue.add(cur.left);
                }
                if(cur.right!=null){
                    queue.add(cur.right);
                }
            }
            row++;
        }
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
        rightView(root);
    }
}
