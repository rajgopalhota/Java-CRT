package BTS;

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
//4 2 8 5 1 6 3 9 7 10 
public class Binary_Tree_dfs_traversals {
    public static void Preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
    public static void Postorder(Node root){
        if(root==null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
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
        Preorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
        Postorder(root);

    }
}
