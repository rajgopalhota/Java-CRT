package BTS;
import java.util.Stack;
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
//1 2 4 5 8 3 6 7 9 10 
public class Iterative_preorder_traversal {
    public static void iterativePreorder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node cur=stack.pop();
            if(cur.right!=null){
                stack.push(cur.right);
            }
            if(cur.left!=null){
                stack.push(cur.left);
            }
            System.out.print(cur.data+" ");
        }
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
        iterativePreorder(root);
    }
}
