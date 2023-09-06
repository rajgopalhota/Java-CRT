package BTS;

import java.util.LinkedList;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Height_of_bt_using_bfs {
    public static void maxHeightByBfs(Node root){
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int cnt=0;
        while(!q.isEmpty()){
            int size=q.size();
            cnt++;
            while(size-->0){
                Node cur=q.poll();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
        System.out.println("The height of the tree is "+cnt);
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        maxHeightByBfs(root);
    }
}
