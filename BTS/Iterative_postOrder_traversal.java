package BTS;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class Iterative_postOrder_traversal {
    
    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        if (root == null) {
            return al;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null; 
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode current = stack.peek().right;
                if (current == null || current == prev) {

                    current = stack.pop();
                    al.add(current.val);
                    prev = current;
                } else {
                    root = current; 
                }
            }
        }
        return al;
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(8);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(10);
        List<Integer>al= postorderTraversal(root);
        System.out.println(al);
    }
}
