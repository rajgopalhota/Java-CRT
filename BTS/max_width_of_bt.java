package BTS;
import java.util.LinkedList;
import java.util.*;
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class pair{
    Node node;
    int index;
    pair(Node node,int index){
        this.node=node;
        this.index=index;
    }
}
public class max_width_of_bt {
    public static void max_width(Node root) {
        if (root == null) {
            return;
        }
        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(root,1));
        int max = 0;
        while (!queue.isEmpty()) {
            int first=0,last=0;
            int size = queue.size();
            for(int i=0;i<size;i++){
                pair cur=queue.poll();
                Node node=cur.node;
                int index=cur.index;
                if(i==0){
                    first=index;
                }
                if(i==size-1){
                    last=index;
                }
                if(node.left!=null){
                    queue.add(new pair(node.left,2*index+1));    
                }
                if(node.right!=null){
                    queue.add(new pair(node.right,2*index+2));
                }
            }
            max=Math.max(max,last-first+1);
        }
        System.out.println("The maximim width of the binary  is " + max);
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.left.left = new Node(5);
        root.left.left.left = new Node(7);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.right.right.right = new Node(6);
        max_width(root);
    }
}
