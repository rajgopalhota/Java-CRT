package BTS;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Diameter_of_bt {
    public static void diameterOfBt(Node root) {
        int[] diameter = new int[1];
        height(root, diameter);
        System.out.println("The diameter of the binary tree is " + diameter[0]);
    }

    static int height(Node node, int[] diameter) {
        if (node == null) {
            return 0;
        }
        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return Math.max(lh, rh) + 1;
    }

    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);
        diameterOfBt(root);        
    }
}
