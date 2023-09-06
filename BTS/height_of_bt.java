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
public class height_of_bt {
    public static int maxHeight(Node root){
        if(root==null){
            return 0;
        }
        int lh=maxHeight(root.left);
        int rh=maxHeight(root.right);
        return 1+Math.max(lh, rh);
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
        System.out.println("The maximum height of the tree is "+maxHeight(root));
    }
}
