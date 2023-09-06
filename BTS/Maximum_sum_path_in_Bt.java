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
public class Maximum_sum_path_in_Bt {
    public static int maxPathSum(Node root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
        maxPathDown(root, maxValue);
        return maxValue[0];
    }

    public static int maxPathDown(Node node, int maxValue[]) {
        if (node == null) return 0;
        int left = Math.max(0, maxPathDown(node.left, maxValue));
        int right = Math.max(0, maxPathDown(node.right, maxValue));
        maxValue[0] = Math.max(maxValue[0], left + right + node.data);
        return Math.max(left, right) + node.data;
    }

    public static void main(String args[]) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        int max = maxPathSum(root);
        System.out.println("The maximum sum path is " + max);
    }
}
