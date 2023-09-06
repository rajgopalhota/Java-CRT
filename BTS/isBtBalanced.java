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
public class isBtBalanced {
    public static void isBalanced(Node root){
        if(root==null){
            return;
        }
        if(dfsheight(root)==-1){
            System.out.println("Not Balanced");
        }
        else{
            System.out.println("Balanced");
        }
    }
    public static int dfsheight(Node root){
        if(root==null){
            return 0;
        }
        int left=dfsheight(root.left);
        int right=dfsheight(root.right);
        if(left==-1){
            return -1;
        }
        if(right==-1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return 1+Math.max(left, right);
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
        isBalanced(root);
    }
}
