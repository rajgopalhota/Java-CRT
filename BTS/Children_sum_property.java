package BTS;
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
public class Children_sum_property {
    public static void childrenSum(Node root){
        Queue<Node>queue=new LinkedList<>();
        Node temp=root;
        queue.add(temp);
        while(!queue.isEmpty()){
            Node cur=queue.poll();
            int sum=0;
            if(cur.left!=null){
                queue.add(cur.left);
                sum+=cur.left.data;
            }
            if(cur.right!=null){
                queue.add(cur.right);
                sum+=cur.right.data;
            }
            if(sum<cur.data)
            {
                int sum1=0;
                if(cur.left!=null){
                    cur.left.data=cur.data;
                    sum1=sum1+cur.left.data;
                }
                if(cur.right!=null){
                    cur.right.data=cur.data;
                    sum1=sum1+cur.right.data;
                }
                if(sum!=0)
                    cur.data=sum1;
            }
            else{
                int sum1=0;
                if(cur.left!=null){
                    sum1=sum1+cur.left.data;
                }
                if(cur.right!=null){
                    sum1=sum1+cur.right.data;
                }
                if(sum1!=0)
                    cur.data=sum1;
            }
            System.out.print(cur.data+" ");
        }
        System.out.println();
        System.out.println("After the reorder according to children sum property");
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur=q.poll();
            int sum1=0;
            if(cur.left!=null){
                q.add(cur.left);
                sum1=sum1+(cur.left.data);
            }
            if(cur.right!=null){
                q.add(cur.right);
                sum1=sum1+(cur.right.data);
            }
            if(sum1!=0)
                cur.data=sum1;
            System.out.print(cur.data+" ");
        }
    }
    public static void main(String args[]) {
        Node root = new Node(2);
        root.left = new Node(35);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right = new Node(10);
        root.right.left = new Node(5);
        root.right.right = new Node(2);
        childrenSum(root);
    }
}
