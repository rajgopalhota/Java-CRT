package BTS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Path_to_Specific_node {
    public static void path(Node root, int target) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                al.add(root.data);
                if (al.get(al.size() - 1) == target) {
                    Iterator<Integer> i = al.iterator();
                    while (i.hasNext()) {
                        System.out.print(i.next() + " ");
                    }
                    break;
                }
                root = root.left;
            } else {
                Node temp = stack.peek();
                if (temp.right == null) {
                    stack.pop();
                    al.remove(al.size() - 1);
                }
                root = temp.right;
            }
        }
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.left.right.right = new Node(7);
        root.right = new Node(3);
    }
}
